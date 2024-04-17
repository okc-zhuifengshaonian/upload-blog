package com.example.axios;

import lombok.Data;

@Data
public class Blog {
    private String title;       //标题
    /**
     * 探店的文字描述
     */
    private String content;

    /**
     * 探店的照片，最多9张，多张以","隔开
     */
    private String images;

    @Override
    public String toString() {
        return "Blog{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", images='" + images + '\'' +
                '}';
    }
}
