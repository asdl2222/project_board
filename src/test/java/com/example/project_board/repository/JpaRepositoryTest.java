package com.example.project_board.repository;

import com.example.project_board.config.JpaConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("JPA connection test")
@Import(JpaConfig.class)
@DataJpaTest
class JpaRepositoryTest {
    public JpaRepositoryTest(@Autowired ArticleRepository articleRepository, @Autowired ArticleCommentRepository articleCommentRepository) {
        this.articleRepository = articleRepository;
        this.articleCommentRepository = articleCommentRepository;
    }

    private final ArticleRepository articleRepository;
    private final ArticleCommentRepository articleCommentRepository;

    @Test
    void given_whenSelecting_thenWorksFine() {
        // Given

        // When

        // Then

    }
}