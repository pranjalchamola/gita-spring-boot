package com.nobugfound.gita2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class GitaVerse {

    private int id;
    @JsonProperty("verse_number")
    private int verseNumber;
    @JsonProperty("chapter_number")
    private int chapterNumber;
    private String text;

    private String slug;

    private String transliteration;

    private String word_meanings;

    public String getTransliteration() {
        return transliteration;
    }

    public void setTransliteration(String transliteration) {
        this.transliteration = transliteration;
    }

    public String getWord_meanings() {
        return word_meanings;
    }

    public void setWord_meanings(String word_meanings) {
        this.word_meanings = word_meanings;
    }

    private List<GitaTranslation> translations;
    private List<GitaCommentary> commentaries;

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public GitaVerse() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVerseNumber() {
        return verseNumber;
    }

    public void setVerseNumber(int verseNumber) {
        this.verseNumber = verseNumber;
    }

    public int getChapterNumber() {
        return chapterNumber;
    }

    public void setChapterNumber(int chapterNumber) {
        this.chapterNumber = chapterNumber;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<GitaTranslation> getTranslations() {
        return translations;
    }

    public void setTranslations(List<GitaTranslation> translations) {
        this.translations = translations;
    }

    public List<GitaCommentary> getCommentaries() {
        return commentaries;
    }

    public void setCommentaries(List<GitaCommentary> commentaries) {
        this.commentaries = commentaries;
    }

    public static class GitaTranslation {

        private int id;
        private String description;

        @JsonProperty("author_name")
        private String authorName;
        private String language;

        public GitaTranslation() {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getAuthorName() {
            return authorName;
        }

        public void setAuthorName(String authorName) {
            this.authorName = authorName;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }
    }

    public static class GitaCommentary {

        private int id;

        public GitaCommentary() {
        }

        private String description;

        @JsonProperty("author_name")
        private String authorName;
        private String language;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getAuthorName() {
            return authorName;
        }

        public void setAuthorName(String authorName) {
            this.authorName = authorName;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }
    }
}
