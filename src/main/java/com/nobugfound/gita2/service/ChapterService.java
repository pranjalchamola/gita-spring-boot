package com.nobugfound.gita2.service;


import com.nobugfound.gita2.model.Chapter;
import org.springframework.stereotype.Component;

@Component
public interface ChapterService {
    String save(Chapter chapter);
}
