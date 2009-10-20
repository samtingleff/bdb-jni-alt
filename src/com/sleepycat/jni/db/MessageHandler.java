/*-
 * See the file LICENSE for redistribution information.
 *
 * Copyright (c) 1997,2008 Oracle.  All rights reserved.
 *
 * $Id: MessageHandler.java,v 12.7 2008/01/17 05:04:53 mjc Exp $
 */
package com.sleepycat.jni.db;

/**
An interface specifying a callback function to be called to display
informational messages.
*/
public interface MessageHandler {
    /**
    A callback function to be called to display informational messages.
    <p>
    There are interfaces in the Berkeley DB library which either directly
    output informational messages or statistical information, or configure
    the library to output such messages when performing other operations,
    {@link com.sleepycat.jni.db.EnvironmentConfig#setVerboseDeadlock EnvironmentConfig.setVerboseDeadlock} for example.
    <p>
    The {@link com.sleepycat.jni.db.EnvironmentConfig#setMessageHandler EnvironmentConfig.setMessageHandler} and
    {@link com.sleepycat.jni.db.DatabaseConfig#setMessageHandler DatabaseConfig.setMessageHandler} methods are used to
    display these messages for the application.
    <p>                 
    @param environment  
    The enclosing database environment handle.
    <p>
    @param message
    An informational message string.
    */
    void message(Environment environment, String message);
}
