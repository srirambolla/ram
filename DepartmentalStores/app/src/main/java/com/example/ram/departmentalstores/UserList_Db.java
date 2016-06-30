package com.example.ram.departmentalstores;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;

public class UserList_Db {


    SQLiteDatabase writeToDb, readFromDb;


    public void createDefaultLists(Context context) {
        ListsDbHelper listsDb = new ListsDbHelper(context);

        writeToDb = listsDb.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(Db_Contract.Lists.Category, "staples");
        values.put(Db_Contract.Lists.Subcategory, "Dals&Pulses");

        writeToDb.insert(Db_Contract.Lists.TABLE_NAME_LISTS, null, values);

        values.put(Db_Contract.Lists.Category, "staples");
        values.put(Db_Contract.Lists.Subcategory, "Dry Fruits");
        writeToDb.insert(Db_Contract.Lists.TABLE_NAME_LISTS, null, values);

        values.put(Db_Contract.Lists.Category, "staples");
        values.put(Db_Contract.Lists.Subcategory, "Rice");
        writeToDb.insert(Db_Contract.Lists.TABLE_NAME_LISTS, null, values);

        values.put(Db_Contract.Lists.Category, "staples");
        values.put(Db_Contract.Lists.Subcategory, "Atta&Salt");
        writeToDb.insert(Db_Contract.Lists.TABLE_NAME_LISTS, null, values);

        values.put(Db_Contract.Lists.Category, "staples");
        values.put(Db_Contract.Lists.Subcategory, "Hours&sooji");
        writeToDb.insert(Db_Contract.Lists.TABLE_NAME_LISTS, null, values);

        values.put(Db_Contract.Lists.Category, "Bevaragaes");
        values.put(Db_Contract.Lists.Subcategory, "Soft Drinks");
        writeToDb.insert(Db_Contract.Lists.TABLE_NAME_LISTS, null, values);

        values.put(Db_Contract.Lists.Category, "Beverages");
        values.put(Db_Contract.Lists.Subcategory, "Fruit Juices");
        writeToDb.insert(Db_Contract.Lists.TABLE_NAME_LISTS, null, values);

        values.put(Db_Contract.Lists.Category, "Beverages");
        values.put(Db_Contract.Lists.Subcategory, "Syrups&Squashes");
        writeToDb.insert(Db_Contract.Lists.TABLE_NAME_LISTS, null, values);

        values.put(Db_Contract.Lists.Category, "Beverages");
        values.put(Db_Contract.Lists.Subcategory, "Energy Drinks");
        writeToDb.insert(Db_Contract.Lists.TABLE_NAME_LISTS, null, values);

        values.put(Db_Contract.Lists.Category, "Beverages");
        values.put(Db_Contract.Lists.Subcategory, "Tea&Coffe");
        writeToDb.insert(Db_Contract.Lists.TABLE_NAME_LISTS, null, values);

        values.put(Db_Contract.Lists.Category, "Branded Food");
        values.put(Db_Contract.Lists.Subcategory, "Noodles");
        writeToDb.insert(Db_Contract.Lists.TABLE_NAME_LISTS, null, values);

        values.put(Db_Contract.Lists.Category, "Branded Food");
        values.put(Db_Contract.Lists.Subcategory, "soops");
        writeToDb.insert(Db_Contract.Lists.TABLE_NAME_LISTS, null, values);

        values.put(Db_Contract.Lists.Category, "Branded Food");
        values.put(Db_Contract.Lists.Subcategory, "preservative");
        writeToDb.insert(Db_Contract.Lists.TABLE_NAME_LISTS, null, values);

        values.put(Db_Contract.Lists.Category, "Branded Food");
        values.put(Db_Contract.Lists.Subcategory, "Ketchup&sauces");
        writeToDb.insert(Db_Contract.Lists.TABLE_NAME_LISTS, null, values);

        values.put(Db_Contract.Lists.Category, "Branded Food");
        values.put(Db_Contract.Lists.Subcategory, "jams&honey");
        writeToDb.insert(Db_Contract.Lists.TABLE_NAME_LISTS, null, values);


        values.put(Db_Contract.Lists.Category, "House Holds");
        values.put(Db_Contract.Lists.Subcategory, "Toilets&Cleaner");
        writeToDb.insert(Db_Contract.Lists.TABLE_NAME_LISTS, null, values);

        values.put(Db_Contract.Lists.Category, "House Holds");
        values.put(Db_Contract.Lists.Subcategory, "Pooja Needs");
        writeToDb.insert(Db_Contract.Lists.TABLE_NAME_LISTS, null, values);

        values.put(Db_Contract.Lists.Category, "House Holds");
        values.put(Db_Contract.Lists.Subcategory, "Detergents&Soaps");
        writeToDb.insert(Db_Contract.Lists.TABLE_NAME_LISTS, null, values);

        values.put(Db_Contract.Lists.Category, "House Holds");
        values.put(Db_Contract.Lists.Subcategory, "Electricals");
        writeToDb.insert(Db_Contract.Lists.TABLE_NAME_LISTS, null, values);

        values.put(Db_Contract.Lists.Category, "House Holds");
        values.put(Db_Contract.Lists.Subcategory, "Pet care");
        writeToDb.insert(Db_Contract.Lists.TABLE_NAME_LISTS, null, values);

        values.put(Db_Contract.Lists.Category, "Personal Care");
        values.put(Db_Contract.Lists.Subcategory, "Skin care");
        writeToDb.insert(Db_Contract.Lists.TABLE_NAME_LISTS, null, values);

        values.put(Db_Contract.Lists.Category, "Personal Care");
        values.put(Db_Contract.Lists.Subcategory, "oral care");
        writeToDb.insert(Db_Contract.Lists.TABLE_NAME_LISTS, null, values);

        values.put(Db_Contract.Lists.Category, "Personal Care");
        values.put(Db_Contract.Lists.Subcategory, "Dental Care");
        writeToDb.insert(Db_Contract.Lists.TABLE_NAME_LISTS, null, values);

        values.put(Db_Contract.Lists.Category, "Personal Care");
        values.put(Db_Contract.Lists.Subcategory, "Shoe Care");
        writeToDb.insert(Db_Contract.Lists.TABLE_NAME_LISTS, null, values);

        values.put(Db_Contract.Lists.Category, "Personal Care");
        values.put(Db_Contract.Lists.Subcategory, "Baby Care");
        writeToDb.insert(Db_Contract.Lists.TABLE_NAME_LISTS, null, values);

        values.put(Db_Contract.Lists.Category, "Bread Dairy&Eggs");
        values.put(Db_Contract.Lists.Subcategory, "Dairy Foods");
        writeToDb.insert(Db_Contract.Lists.TABLE_NAME_LISTS, null, values);

        values.put(Db_Contract.Lists.Category, "Bread Dairy&Eggs");
        values.put(Db_Contract.Lists.Subcategory, "jFrozen Foods&vesg");
        writeToDb.insert(Db_Contract.Lists.TABLE_NAME_LISTS, null, values);

        values.put(Db_Contract.Lists.Category, "Bread Dairy&Eggs");
        values.put(Db_Contract.Lists.Subcategory, "ice creams");
        writeToDb.insert(Db_Contract.Lists.TABLE_NAME_LISTS, null, values);

        values.put(Db_Contract.Lists.Category, "Bread Dairy&Eggs");
        values.put(Db_Contract.Lists.Subcategory, "Sea Foods");
        writeToDb.insert(Db_Contract.Lists.TABLE_NAME_LISTS, null, values);

        values.put(Db_Contract.Lists.Category, "Bread Dairy&Eggs");
        values.put(Db_Contract.Lists.Subcategory, "Breads");
        writeToDb.insert(Db_Contract.Lists.TABLE_NAME_LISTS, null, values);

        values.put(Db_Contract.Lists.Category, "Yummy Foods");
        values.put(Db_Contract.Lists.Subcategory, "Snacks&Foods");
        writeToDb.insert(Db_Contract.Lists.TABLE_NAME_LISTS, null, values);

        values.put(Db_Contract.Lists.Category, "Yummy Foods");
        values.put(Db_Contract.Lists.Subcategory, "Namkeens");
        writeToDb.insert(Db_Contract.Lists.TABLE_NAME_LISTS, null, values);

        values.put(Db_Contract.Lists.Category, "Yummy Foods");
        values.put(Db_Contract.Lists.Subcategory, "Sweets");
        writeToDb.insert(Db_Contract.Lists.TABLE_NAME_LISTS, null, values);

        values.put(Db_Contract.Lists.Category, "Yummy Foods");
        values.put(Db_Contract.Lists.Subcategory, "Snacks");
        writeToDb.insert(Db_Contract.Lists.TABLE_NAME_LISTS, null, values);

        values.put(Db_Contract.Lists.Category, "Yummy Foods");
        values.put(Db_Contract.Lists.Subcategory, "Samosa");
        writeToDb.insert(Db_Contract.Lists.TABLE_NAME_LISTS, null, values);

        values.put(Db_Contract.Lists.Category, "Veggies&Fruits");
        values.put(Db_Contract.Lists.Subcategory, "Vegetables");
        writeToDb.insert(Db_Contract.Lists.TABLE_NAME_LISTS, null, values);


        values.put(Db_Contract.Lists.Category, "Veggies&Fruits");
        values.put(Db_Contract.Lists.Subcategory, "Fruits");
        writeToDb.insert(Db_Contract.Lists.TABLE_NAME_LISTS, null, values);

        values.put(Db_Contract.Lists.Category, "Frozen Meat");
        values.put(Db_Contract.Lists.Subcategory, "Meat");
        writeToDb.insert(Db_Contract.Lists.TABLE_NAME_LISTS, null, values);

        values.put(Db_Contract.Lists.Category, "Frozen Meat");
        values.put(Db_Contract.Lists.Subcategory, "Chicken");
        writeToDb.insert(Db_Contract.Lists.TABLE_NAME_LISTS, null, values);

        values.put(Db_Contract.Lists.Category, "Frozen Meat");
        values.put(Db_Contract.Lists.Subcategory, "Sea Foods");
        writeToDb.insert(Db_Contract.Lists.TABLE_NAME_LISTS, null, values);

        values.put(Db_Contract.Lists.Category, "Best Offers");
        values.put(Db_Contract.Lists.Subcategory, "");
        writeToDb.insert(Db_Contract.Lists.TABLE_NAME_LISTS, null, values);


        writeToDb.close();
    }

    public ArrayList<String> getCategoryInList( Context context) {

        ListsDbHelper listsDb = new ListsDbHelper(context);
        readFromDb = listsDb.getReadableDatabase();

        Cursor cursor = readFromDb.rawQuery("SELECT DISTINCT " +Db_Contract.Lists.Category+" FROM "+Db_Contract.Lists.TABLE_NAME_LISTS,null);
        ArrayList<String> categoryInThisList = fetchFromCursor(cursor);
        Log.v("List Group: ", categoryInThisList.toString());
        return categoryInThisList;
    }

    public ArrayList<String> getSubCategoryInList( Context context,String categoryName) {

        ListsDbHelper listsDb = new ListsDbHelper(context);
        readFromDb = listsDb.getReadableDatabase();

        //Cursor cursor = readFromDb.rawQuery("SELECT  " +Db_Contract.Lists.Subcategory+" FROM "+Db_Contract.Lists.TABLE_NAME_LISTS+" WHERE "  +Db_Contract.Lists.Category+ " = '" +categoryName+"'" ,null);
        Cursor cursor = readFromDb.query(Db_Contract.Lists.TABLE_NAME_LISTS, new String[]{Db_Contract.Lists.Subcategory}, Db_Contract.Lists.Category + "=?", new String[]{categoryName}, null, null, null);
        ArrayList<String> categoryInThisList = fetchFromCursor(cursor);
        Log.v("List Group: ", categoryInThisList.toString());
        return categoryInThisList;
    }

    public ArrayList<String> fetchFromCursor(Cursor cursor) {

        ArrayList<String> wordLists = new ArrayList<>();
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            wordLists.add(cursor.getString(0));
            cursor.moveToNext();
        }
        cursor.close();
        readFromDb.close();
        return wordLists;
    }

}
