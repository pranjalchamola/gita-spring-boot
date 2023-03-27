package com.nobugfound.gita2.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
public class TranslatorName {
    private int resourceId;
    private String authorName;

    private String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public TranslatorName() {
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
}
