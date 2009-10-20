/*-
 * See the file LICENSE for redistribution information.
 *
 * Copyright (c) 2002,2008 Oracle.  All rights reserved.
 *
 * $Id: IncompatibleClassException.java,v 1.1 2008/02/07 17:12:27 mark Exp $
 */

package com.sleepycat.jni.persist.evolve;

/**
 * A class has been changed incompatibly and no mutation has been configured to
 * handle the change or a new class version number has not been assigned.
 *
 * @see com.sleepycat.jni.persist.EntityStore#EntityStore EntityStore.EntityStore
 * @see com.sleepycat.jni.persist.model.Entity#version
 * @see com.sleepycat.jni.persist.model.Persistent#version
 *
 * @see com.sleepycat.jni.persist.evolve Class Evolution
 * @author Mark Hayes
 */
public class IncompatibleClassException extends RuntimeException {

    public IncompatibleClassException(String msg) {
        super(msg);
    }
}
