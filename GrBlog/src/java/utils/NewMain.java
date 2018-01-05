/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import model.Comment;
import model.Note;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author Student
 */
public class NewMain {

    
    private static void createDB() {
        AnnotationConfiguration config = 
                new AnnotationConfiguration();
        config.addAnnotatedClass(Comment.class);
        config.addAnnotatedClass(Note.class);
        config.configure("hibernate.cfg.xml");
        new SchemaExport(config).create(true, true);
    }
    
    public static void main(String[] args) {
        createDB();
    }
    
}
