package com.nobugfound.gita2.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
public class Verse {
    private String verseId;
    private String verseKey;
    private String verseData;
    private List<Translation> translation;

    public Verse() {
    }

    public String getVerseId() {
        return verseId;
    }

    public void setVerseId(String verseId) {
        this.verseId = verseId;
    }

    public String getVerseKey() {
        return verseKey;
    }

    public void setVerseKey(String verseKey) {
        this.verseKey = verseKey;
    }

    public String getVerseData() {
        return verseData;
    }

    public void setVerseData(String verseData) {
        this.verseData = verseData;
    }

    public List<Translation> getTranslation() {
        return translation;
    }

    public void setTranslation(List<Translation> translation) {
        this.translation = translation;
    }
}
