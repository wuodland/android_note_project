package com.example.project_andclass2019.db;
import com.example.project_andclass2019.model.Note;
import java.util.List;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;
@Dao
public interface NotesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertNote(Note note);
    @Update
    void updateNote(Note note);
    @Delete
    void deleteNote(Note... note);
    @Query("SELECT * FROM notes")
    List<Note> getNotes();
    @Query("SELECT * FROM notes WHERE id = :noteId")
    Note getNoteById(int noteId);
    @Query("DELETE FROM notes WHERE id = :noteId")
    void deleteNoteById(int noteId);

}