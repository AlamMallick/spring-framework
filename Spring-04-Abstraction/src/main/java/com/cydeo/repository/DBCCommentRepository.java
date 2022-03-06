package com.cydeo.repository;

import com.cydeo.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class DBCCommentRepository implements CommentRepository {
    public void storeComment(Comment comment) {
        System.out.println("Sending : " + comment.getText());
    }
}