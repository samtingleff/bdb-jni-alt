package com.sleepycat.jni.db;

public interface ForeignKeyNullifier {
    boolean nullifyForeignKey(SecondaryDatabase secondary, DatabaseEntry data)
	    throws DatabaseException;
}
