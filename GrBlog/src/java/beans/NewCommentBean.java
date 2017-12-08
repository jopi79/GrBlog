/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import model.Comment;

/**
 *
 * @author Student
 */
@Named(value = "newCommentBean")
@RequestScoped
public class NewCommentBean {

    private String content,signature;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
    
    @Inject
    NoteBean noteBean;
    public void add()
    {
        Comment comment = new Comment(signature,content);
        noteBean.addComment(comment);
        signature = "";
        content = "";
    }
    
    public NewCommentBean() {
    }
    
}
