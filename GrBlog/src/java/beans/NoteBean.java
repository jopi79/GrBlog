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
import model.Note;

/**
 *
 * @author Student
 */
@Named(value = "noteBean")
@SessionScoped
public class NoteBean implements Serializable {

    private List<Note> notes;
    
    @PostConstruct
    public void init()
    {
        notes = new ArrayList();
        notes.add(new Note("Jak zrobić dobre zdjęcie","Jak zrobić dobre zdjęcie"));
        notes.add(new Note("Jaki kupić aparat","Jaki kupić aparat"));
    }

    public List<Note> getNotes() {
        return notes;
    }
    
    public NoteBean() {
    }
    
}