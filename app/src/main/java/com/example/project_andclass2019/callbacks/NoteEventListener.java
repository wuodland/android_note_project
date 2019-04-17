package com.example.project_andclass2019.callbacks;
import com.example.project_andclass2019.model.Note;
public interface NoteEventListener {
    void onNoteClick(Note note);
    void onNoteLongClick(Note note);
}