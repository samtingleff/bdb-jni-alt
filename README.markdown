# bdb-jni-alt #

The BDB 4.7.25 Java source modified _only_ to add 'jni' to packages names, except in the com.sleepycat.db.internal package which contains unmodifiable JNI code.

Why? Some crazy people would like to use, or at least compile, BDB JNI code alongside BDB JE code.

Builde using build.xml.

See LICENSE for the original license from Oracle.
