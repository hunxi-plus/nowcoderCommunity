package com.nowcoder.community.dao;

import com.nowcoder.community.entity.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CommentMapper {
    // 把评论选择出来，后两个参数用于分页
    List<Comment> selectCommentsByEntity(int entityType, int entityId, int offset, int limit);
    // 统计评论数量
    int selectCountByEntity(int entityType, int entityId);
    // 添加评论
    int insertComment(Comment comment);
}
