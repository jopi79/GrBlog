/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import model.Note;

/**
 *
 * @author Student
 */
@Named(value = "newNoteBean")
@RequestScoped
public class NewNoteBean {

    private String title, content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    @Inject
    private NoteBean noteBean;
    public String save()
    {
        Note note = new Note(title,content);
        noteBean.add(note);
        return null;
    }
    
    public NewNoteBean() {
    }
    
}
