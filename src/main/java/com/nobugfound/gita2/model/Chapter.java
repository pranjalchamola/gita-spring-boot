package com.nobugfound.gita2.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "chapter")
public class Chapter {
    @Id
    private String chapterId;

    private String chapterName;
    private List<Verse> verse;

    public String getChapterId() {
        return chapterId;
    }

    public void setChapterId(String chapterId) {
        this.chapterId = chapterId;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public List<Verse> getVerse() {
        return verse;
    }

    public void setVerse(List<Verse> verse) {
        this.verse = verse;
    }

    public Chapter() {
    }
}
