package com.jojoldu.book.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Posts { // 기본적으로 클래스의 카멜케이스네이밍이 DB에는 언더스코에 네이밍으로 매칭된다.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder // 해당클래스의 빌더패턴클래스생성, 생성자상단에 선언시 생성자에 포함된 필드만 빌더에 포함
    public Posts(String author, String content, Long id, String title) {
        this.author = author;
        this.content = content;
        this.id = id;
        this.title = title;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
