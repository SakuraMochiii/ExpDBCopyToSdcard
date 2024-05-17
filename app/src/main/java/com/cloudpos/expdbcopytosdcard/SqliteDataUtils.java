package com.cloudpos.expdbcopytosdcard;

import android.content.Context;

public class SqliteDataUtils {
    public static final String DB_FILE_NAME = "testDB";

    private static SqliteDataUtils instance;
    private DataBaseHelper dbHelper;

    private SqliteDataUtils(Context context) {
        dbHelper = new DataBaseHelper(context, DB_FILE_NAME, null, 1);
        dbHelper.getWritableDatabase();
        dbHelper.getReadableDatabase();
    }

    public static SqliteDataUtils getInstance(Context context) {
        if (instance == null) {
            instance = new SqliteDataUtils(context);
        }
        return instance;
    }

}
