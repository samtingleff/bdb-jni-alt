/*-
 * See the file LICENSE for redistribution information.
 *
 * Copyright (c) 1997,2008 Oracle.  All rights reserved.
 *
 * $Id: ReplicationLeaseTimeoutException.java,v 12.3 2008/01/17 05:04:53 mjc Exp $
 */
package com.sleepycat.jni.db;

import com.sleepycat.db.internal.DbEnv;

/**
Thrown if a master lease has timed out.
*/
public class ReplicationLeaseTimeoutException extends DatabaseException {
    /* package */ ReplicationLeaseTimeoutException(final String s,
                                   final int errno,
                                   final DbEnv dbenv) {
        super(s, errno, dbenv);
    }
}