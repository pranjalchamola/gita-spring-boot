package com.nobugfound.gita2.controller;

import com.nobugfound.gita2.model.Chapter;
import com.nobugfound.gita2.repository.ChapterRepository;
import com.nobugfound.gita2.service.ChapterService;
import com.nobugfound.gita2.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/chapter")
public class ChapterController {

    @Autowired
    private ChapterService chapterService;

    @Autowired
    private LanguageService languageService;

    @Autowired
    private ChapterRepository chapterRepository;


    //@PostMapping
    //public String save(@RequestBody Chapter chapter)
//    {
//        return chapterService.save(chapter);
//    }

    @GetMapping
    public List<Chapter> getAllChapter()
    {
        System.out.println("In chapters");
        return chapterRepository.findAll();
    }

    @GetMapping("number/{id}")
    public Chapter getChapter(@PathVariable String id)
    {
        List<Chapter> chapters = chapterRepository.findOneByChapterId(id);
        if (chapters.size() == 1) {
            return chapters.get(0);
        } else {
            // Handle case when chapter is not found or multiple chapters are found
            return chapters.get(0);
        }
    }

//    @GetMapping("/test")
//    public void test()
//    {
//        Language lan=new Language();
//        for(int i=1;i<11;i++)
//        {
//            lan.setLanguageId(String.valueOf(i));
//            lan.setLanguageName(".");
//            languageService.save(lan);
//        }
//    }

}
