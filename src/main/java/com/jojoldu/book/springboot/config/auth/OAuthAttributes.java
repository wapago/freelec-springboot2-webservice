package com.jojoldu.book.springboot.config.auth;

import lombok.Builder;
import lombok.Getter;

import java.util.Map;

@Getter
public class OAuthAttributes {
    private Map<String, Object> attributes;
    private String nameAttibuteKey;
    private String name;
    private String email;
    private String picture;

    @Builder
    public OAuthAttributes(Map<String, Object> attributes, String email, String name, String nameAttibuteKey, String picture) {
        this.attributes = attributes;
        this.email = email;
        this.name = name;
        this.nameAttibuteKey = nameAttibuteKey;
        this.picture = picture;
    }
}
