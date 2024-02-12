package com.springmasterclass.jsonplaceholder;

import lombok.Data;

@Data
public class Post {
    private final Long userId;
    private final Long id;
    private final String title;
    private final String body;
}
