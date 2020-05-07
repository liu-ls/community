package life.school.community.mapper;

import life.school.community.model.Comment;

public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}