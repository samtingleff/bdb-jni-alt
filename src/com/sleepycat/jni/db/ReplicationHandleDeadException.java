/*-
 * See the file LICENSE for redistribution information.
 *
 * Copyright (c) 1997,2008 Oracle.  All rights reserved.
 *
 * $Id: ReplicationHandleDeadException.java,v 12.8 2008/01/17 05:04:53 mjc Exp $
 */
package com.sleepycat.jni.db;

import com.sleepycat.db.internal.DbEnv;

/**
Thrown when a database handle has been invalidated because a replication
election unrolled a committed transaction.
When this happens the handle is no longer able to be used and the application
must close the handle using the {@link com.sleepycat.jni.db.Database#close Database.close} method and open a new
handle. This exception is thrown when a client unrolls a transaction in order
to synchronize with a new master. If the application was permitted to use the
original handle, it's possible the handle might attempt to access nonexistent
resources.
*/
public class ReplicationHandleDeadException extends DatabaseException {
    /* package */ ReplicationHandleDeadException(final String s,
                                   final int errno,
                                   final DbEnv dbenv) {
        super(s, errno, dbenv);
    }
}