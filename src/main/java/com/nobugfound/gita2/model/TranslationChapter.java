package com.nobugfound.gita2.model;

import java.util.List;

public class TranslationChapter {

    private int chapterNum;
    private List<TranslationVerse> verses;

    public TranslationChapter(int chapterNum, List<TranslationVerse> verses) {
        this.chapterNum = chapterNum;
        this.verses = verses;
    }

    public TranslationChapter() {
    }

    public int getChapterNum() {
        return chapterNum;
    }

    public void setChapterNum(int chapterNum) {
        this.chapterNum = chapterNum;
    }

    public List<TranslationVerse> getVerses() {
        return verses;
    }

    public void setVerses(List<TranslationVerse> verses) {
        this.verses = verses;
    }
}
