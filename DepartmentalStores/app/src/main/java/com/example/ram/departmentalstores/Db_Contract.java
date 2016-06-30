package com.example.ram.departmentalstores;

import android.provider.BaseColumns;

/**
 * Created by ram on 27/5/16.
 */
public class Db_Contract {

    public Db_Contract() {
    }

    public static class Lists implements BaseColumns {

        public static final String TABLE_NAME_LISTS = "lists";

        public static final String Category = "Category";
        public static final String Subcategory = "Subcategory";

        public static final String TEXT_TYPE = " TEXT";
        public static final String COMMA_SEP = ",";


        public static final String CREATE_TABLE_LISTS =

                "CREATE TABLE " + Lists.TABLE_NAME_LISTS + "( " +
                        Lists._ID + " INTEGER PRIMARY KEY, " +
                        Lists.Category + TEXT_TYPE + COMMA_SEP +
                        Lists.Subcategory + TEXT_TYPE + ")";

        public static final String DELETE_TABLE_LISTS =
                "DROP TABLE IF EXISTS " + Lists.TABLE_NAME_LISTS;
    }

}

