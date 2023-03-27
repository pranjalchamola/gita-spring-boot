package com.nobugfound.gita2.model;

public class TranslationVerse {

    private int verseId;
    private String text;
    private String language;
    private String resourceName;

    public TranslationVerse(int verseId, String text, String language, String resourceName) {
        this.verseId = verseId;
        this.text = text;
        this.language = language;
        this.resourceName = resourceName;
    }

    public int getVerseId() {
        return verseId;
    }

    public void setVerseId(int verseId) {
        this.verseId = verseId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public TranslationVerse() {
    }
}
