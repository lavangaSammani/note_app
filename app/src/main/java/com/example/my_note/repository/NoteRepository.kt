package com.example.my_note.repository

import com.example.my_note.database.NoteDatabase
import com.example.my_note.model.Note

class NoteRepository(private val db: NoteDatabase) {

    suspend fun insertNote(note : Note) = db.getNoteDao().insertNote(note)
    suspend fun deleteNote(note : Note) = db.getNoteDao().deleteNote(note)
    suspend fun updateNote(note : Note) = db.getNoteDao().updateNote(note)

    fun getAllNotes() = db.getNoteDao().getAllNote()
    fun searchNote(query: String?) = db.getNoteDao().searchNote(query)
}