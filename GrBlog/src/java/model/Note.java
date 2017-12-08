/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Student
 */
public class Note {

    private static int count = 0;
    private int id;
    private String title;
    private String content;
    private Date date;
    private List<Comment> comments;

    public Note(String title, String content) {
        this.title = title;
        this.content = content;
        date = new Date();
        id = ++count;
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

}
