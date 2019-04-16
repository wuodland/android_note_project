package com.example.project_andclass2019.db;

import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.content.Context;




public class NotesDB extends RoomDatabase {
    public abstract NotesDao notesDao();

    public static final String DATABSE_NAME = "notesDb";
    private static NotesDB instance;

    public static NotesDB getInstance(Context context) {
        if (instance == null)
            instance = Room.databaseBuilder(context, NotesDB.class, DATABSE_NAME)
                    .allowMainThreadQueries()
                    .build();
        return instance;
    }


}
