package com.sleepycat.jni.db;

public interface ForeignMultiKeyNullifier {
    boolean nullifyForeignKey(SecondaryDatabase secondary, DatabaseEntry key, DatabaseEntry data, DatabaseEntry secKey)
	    throws DatabaseException;
}
