package com.example.project_andclass2019.callbacks;
import com.example.project_andclass2019.model.Note;


public interface NoteEventListener {
    /**
     * call wen Note clicked.
     *
     * @param note: Note item
     */
    void onNoteClick(Note note);

    /**
     * call wen long Click to Note.
     *
     * @param note : item
     */
    void onNoteLongClick(Note note);
}