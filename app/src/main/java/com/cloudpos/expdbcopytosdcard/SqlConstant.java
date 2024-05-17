package com.cloudpos.expdbcopytosdcard;

public class SqlConstant {
    public static final String SQL_CREATE_TABLE = "CREATE TABLE testcases( testcase_id TEXT PRIMARY KEY, "
            + "package_name TEXT,"
            + "class_name TEXT,"
            + "method_name TEXT, "
            + "result INTEGER DEFAULT 0, "
            + "start_time TEXT DEFAULT NONE, "
            + "end_time TEXT DEFAULT NONE, " + "selected INTEGER DEFAULT 1); ";
}
