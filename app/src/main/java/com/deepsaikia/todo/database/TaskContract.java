package com.deepsaikia.todo.database;

import android.provider.BaseColumns;

public class TaskContract {
    public static final String DB_NAME = "com.deepsaikia.todo.database";
    public static final int DB_VERSION = 1;

    public static class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }
}