package com.nobugfound.gita2.model;

import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;

@Data
public class Translation {

    @Id
    private int resourceId;
    private String authorName;
    private List<TranslationChapter> chapterList;

    public Translation(int resourceId, String authorName, List<TranslationChapter> chapterList) {
        this.resourceId = resourceId;
        this.authorName = authorName;
        this.chapterList = chapterList;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public List<TranslationChapter> getChapterList() {
        return chapterList;
    }

    public void setChapterList(List<TranslationChapter> chapterList) {
        this.chapterList = chapterList;
    }

    public Translation() {
    }
}

