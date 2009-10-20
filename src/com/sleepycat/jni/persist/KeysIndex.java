/*-
 * See the file LICENSE for redistribution information.
 *
 * Copyright (c) 2002,2008 Oracle.  All rights reserved.
 *
 * $Id: KeysIndex.java,v 1.1 2008/02/07 17:12:26 mark Exp $
 */

package com.sleepycat.jni.persist;

import java.util.Map;
import java.util.SortedMap;

import com.sleepycat.jni.bind.EntryBinding;
import com.sleepycat.jni.collections.StoredSortedMap;
import com.sleepycat.jni.db.Database;
import com.sleepycat.jni.db.DatabaseEntry;
import com.sleepycat.jni.db.DatabaseException;
import com.sleepycat.jni.db.LockMode;
import com.sleepycat.jni.db.OperationStatus;
import com.sleepycat.jni.db.Transaction;

/**
 * The EntityIndex returned by SecondaryIndex.keysIndex().  This index maps
 * secondary key to primary key.  In Berkeley DB internal terms, this is a
 * secondary database that is opened without associating it with a primary.
 *
 * @author Mark Hayes
 */
class KeysIndex<SK,PK> extends BasicIndex<SK,PK> {

    private EntryBinding pkeyBinding;
    private SortedMap<SK,PK> map;

    KeysIndex(Database db,
              Class<SK> keyClass,
              EntryBinding keyBinding,
              Class<PK> pkeyClass,
              EntryBinding pkeyBinding)
        throws DatabaseException {

        super(db, keyClass, keyBinding,
              new DataValueAdapter<PK>(pkeyClass, pkeyBinding));
        this.pkeyBinding = pkeyBinding;
    }

    /*
     * Of the EntityIndex methods only get()/map()/sortedMap() are implemented
     * here.  All other methods are implemented by BasicIndex.
     */

    public PK get(SK key)
        throws DatabaseException {

        return get(null, key, null);
    }

    public PK get(Transaction txn, SK key, LockMode lockMode)
        throws DatabaseException {

        DatabaseEntry keyEntry = new DatabaseEntry();
        DatabaseEntry pkeyEntry = new DatabaseEntry();
        keyBinding.objectToEntry(key, keyEntry);

        OperationStatus status = db.get(txn, keyEntry, pkeyEntry, lockMode);

        if (status == OperationStatus.SUCCESS) {
            return (PK) pkeyBinding.entryToObject(pkeyEntry);
        } else {
            return null;
        }
    }

    public Map<SK,PK> map() {
        return sortedMap();
    }

    public synchronized SortedMap<SK,PK> sortedMap() {
        if (map == null) {
            map = new StoredSortedMap(db, keyBinding, pkeyBinding, true);
        }
        return map;
    }

    boolean isUpdateAllowed() {
        return false;
    }
}
