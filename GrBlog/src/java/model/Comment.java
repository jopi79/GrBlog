/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Student
 */
public class Comment {
    private static int count = 0;
    private int id;
    private String signature;
    private String content;
    private Date date;

    public Comment(String signature, String content) {
        this.signature = signature;
        this.content = content;
        date = new Date();
        id = ++count;
    }

    public int getId() {
        return id;
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
