/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import model.Comment;
import model.Note;

/**
 *
 * @author Student
 */
@Named(value = "noteBean")
@SessionScoped
public class NoteBean implements Serializable {

    private List<Note> notes;
    private int id;
    private Note note;
    
    @PostConstruct
    public void init()
    {
        notes = new ArrayList();
        Note note = new Note("Jak zrobić dobre zdjęcie","Jak zrobić dobre zdjęcie");
        note.add(new Comment("ktos","Trochę mało treści"));
        note.add(new Comment("aaa","Ciekawy wpis"));
        note.add(new Comment("Ania","Ja robię ładne zdjęcia"));
        notes.add(note);
        Note note2 = new Note("Jaki kupić aparat","Jaki kupić aparat");
        notes.add(note2);
    }

    public List<Note> getNotes() {
        return notes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        this.note = find(id);
    }
    
    public Note find(int id)
    {
        for(Note note : notes)
        {
            if(id==note.getId())
            {
                return note;
            }
        }
        return null;
    }

    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }
    
    public NoteBean() {
    }

    public void add(Note note) {
        notes.add(note);
    }
    
    public void addComment(Comment c)
    {
        note.add(c);
    }
}
