/*-
 * See the file LICENSE for redistribution information.
 *
 * Copyright (c) 1997,2008 Oracle.  All rights reserved.
 *
 * $Id: PanicHandler.java,v 12.7 2008/01/17 05:04:53 mjc Exp $
 */
package com.sleepycat.jni.db;

/**
An interface specifying a function to be called if the database
environment panics.
*/
public interface PanicHandler {
    /**
    A function to be called if the database environment panics.
    <p>
    Errors can occur in the Berkeley DB library where the only solution
    is to shut down the application and run recovery (for example, if
    Berkeley DB is unable to allocate heap memory).  In such cases, the
    Berkeley DB methods will throw a {@link com.sleepycat.jni.db.RunRecoveryException RunRecoveryException}.
    <p>
    It is often easier to simply exit the application when such errors    occur rather than gracefully return up the stack.  The panic
    callback function is a function called when    {@link com.sleepycat.jni.db.RunRecoveryException RunRecoveryException} is about to be thrown from a from a
    Berkeley DB method. 
    <p>
    @param environment
    The enclosing database environment handle.
    <p>
    @param e
    The {@link com.sleepycat.jni.db.DatabaseException DatabaseException} that would have been thrown to
    the calling method.
    */
    void panic(Environment environment, DatabaseException e);
}
