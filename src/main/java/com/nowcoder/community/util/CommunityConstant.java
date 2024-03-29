package com.nowcoder.community.util;

public interface CommunityConstant {
    /**
     * 激活成功
     */
    int ACTIVATION_SUCCSEE =0;
    /**
     * 重复激活
     */
    int ACTIVATION_REPEAT=1;
    /**
     * 激活失败
     */
    int ACTIVATION_FAILURE=2;
    /**
     * 默认状态的登录凭证的超时时间
     */
    int DEFAULT_EXPERED_SECONDS = 3600 * 12;
    /**
     * 记住我状态的登录凭证的超时时间
     */
    int REMEMBER_EXPERED_SECONDS = 3600 * 24 * 100;

    /**
     * 评论的实体类型：帖子，评论帖子
     */
    int ENTITY_TYPE_POST = 1;

    /**
     * 评论的实体类型：评论，回复评论
     */
    int ENTITY_TYPE_COMMENT = 2;

    /**
     * 实体类型：用户
     */
    int ENTITY_TYPE_USER = 3;

}

