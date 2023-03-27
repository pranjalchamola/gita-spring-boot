package com.nobugfound.gita2.service;

import com.nobugfound.gita2.model.Chapter;
import com.nobugfound.gita2.model.TranslationChapter;
import com.nobugfound.gita2.repository.ChapterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChapterServiceImpl implements ChapterService{

    @Autowired
    private ChapterRepository chapterRepository;
    @Override
    public String save(Chapter chapter) {
        return chapterRepository.save(chapter).getChapterId();
    }
}
