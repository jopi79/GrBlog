/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author Student
 */
@Entity
public class Comment implements Serializable {
    //private static int count = 0;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, 
            generator = "Comment_SEQ")
    @SequenceGenerator(name = "Comment_SEQ", sequenceName = "Comment_SEQ")
    private int id;
    private String signature;
    private String content;
    @Column(name="add_date")
    private Date date;

    @ManyToOne(cascade = CascadeType.ALL)
    private Note note;
    
    
    public Comment() {
    }

    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }

    
    
    public Comment(String signature, String content) {
        this.signature = signature;
        this.content = content;
        date = new Date();
        //id = ++count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSignature() {
        return signature;
    }

    public String getContent() {
        return content;
    }

    public Date getDate() {
        return date;
    }
    
    
    
}
