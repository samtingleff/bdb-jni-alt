/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.33
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.sleepycat.db.internal;

import com.sleepycat.db.*;

import java.util.Comparator;

public class Dbc {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Dbc(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Dbc obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* package */ synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      throw new UnsupportedOperationException("C++ destructor does not have public access");
    }
    swigCPtr = 0;
  }

	public synchronized void close() throws DatabaseException {
		try {
			close0();
		} finally {
			swigCPtr = 0;
		}
	}

  /* package */ void close0() { db_javaJNI.Dbc_close0(swigCPtr, this); }

  public int count(int flags) throws com.sleepycat.db.DatabaseException { return db_javaJNI.Dbc_count(swigCPtr, this, flags); }

  public int del(int flags) throws com.sleepycat.db.DatabaseException {
    return db_javaJNI.Dbc_del(swigCPtr, this, flags);
  }

  public Dbc dup(int flags) throws com.sleepycat.db.DatabaseException {
    long cPtr = db_javaJNI.Dbc_dup(swigCPtr, this, flags);
    return (cPtr == 0) ? null : new Dbc(cPtr, false);
  }

  public int get(com.sleepycat.db.DatabaseEntry key, com.sleepycat.db.DatabaseEntry data, int flags) throws com.sleepycat.db.DatabaseException {
    return db_javaJNI.Dbc_get(swigCPtr, this, key, data, flags);
  }

  public int get_priority() throws com.sleepycat.db.DatabaseException {
    return db_javaJNI.Dbc_get_priority(swigCPtr, this);
  }

  public int pget(com.sleepycat.db.DatabaseEntry key, com.sleepycat.db.DatabaseEntry pkey, com.sleepycat.db.DatabaseEntry data, int flags) throws com.sleepycat.db.DatabaseException {
    return db_javaJNI.Dbc_pget(swigCPtr, this, key, pkey, data, flags);
  }

  public int put(com.sleepycat.db.DatabaseEntry key, com.sleepycat.db.DatabaseEntry data, int flags) throws com.sleepycat.db.DatabaseException {
    return db_javaJNI.Dbc_put(swigCPtr, this, key, data, flags);
  }

  public void set_priority(int priority) throws com.sleepycat.db.DatabaseException { db_javaJNI.Dbc_set_priority(swigCPtr, this, priority); }

}
