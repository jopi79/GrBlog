/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author Student
 */
@Entity
public class Note implements Serializable {

    //private static int count = 0;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, 
            generator = "Note_SEQ")
    @SequenceGenerator(name = "Note_SEQ", sequenceName = "Note_SEQ")
    private int id;
    private String title;
    private String content;
    
    @Column(name="add_date")
    private Date date;
    
    @OneToMany(mappedBy="note", 
            fetch=FetchType.EAGER,
            cascade = {CascadeType.ALL})
    private List<Comment> comments;

    public Note() {
    }

    
    
    public Note(String title, String content) {
        this.title = title;
        this.content = content;
        date = new Date();
        //id = ++count;
        comments = new ArrayList();
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void add(Comment comment) {
        comments.add(comment);
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Date getDate() {
        return date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void delete(int commentId)
    {
        Iterator<Comment> i = comments.iterator();
        while(i.hasNext())
        {
            Comment comment = i.next();
            if(commentId==comment.getId())
            {
                i.remove();
                return;
            }
        }
    }
}
