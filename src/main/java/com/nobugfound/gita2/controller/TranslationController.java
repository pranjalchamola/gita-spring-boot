package com.nobugfound.gita2.controller;

import com.nobugfound.gita2.model.Language;
import com.nobugfound.gita2.model.Translation;
import com.nobugfound.gita2.model.TranslationChapter;
import com.nobugfound.gita2.model.TranslatorName;
import com.nobugfound.gita2.repository.TranslationRepository;
import com.nobugfound.gita2.repository.TranslatorNameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/translation")
public class TranslationController {

    @Autowired
    private TranslationRepository translationRepository;

    @Autowired
    private TranslatorNameRepository translatorNameRepository;


    @GetMapping()
    public List<Translation> getAllTranslations(){
        return translationRepository.findAll();
    }

    @GetMapping("/listName")
    public List<Translation> getAllTranslationNames(){
        return translationRepository.findAll();
    }

    @GetMapping("/byAuthor/{author}/{chapter}")
    public List<TranslationChapter> getBychapterAndAuthor(@PathVariable String author, @PathVariable String chapter){
        if(!author.isEmpty() && !chapter.isEmpty()) {
            List<TranslationChapter> translationChapterList = new ArrayList<>();
            String[] separatedAuthors = author.split(",");
            System.out.println(separatedAuthors);
            int id = 0;
            for (String separatedAuthor : separatedAuthors) {
                id=translatorNameRepository.findByAuthorName(separatedAuthor).getResourceId();
                Translation trans = translationRepository.findByresourceId(id);
                int chap = Integer.valueOf(chapter);
                translationChapterList.add(trans.getChapterList().get(chap - 1));
            }


            return translationChapterList;
        }
        else return null;
    }

    @GetMapping("/addAuthors")
    public void addAuthor(){
        List<Translation> translation=translationRepository.findAll();
        TranslatorName translatorName=new TranslatorName();
        for (Translation trans:translation
             ) {
            translatorName.setAuthorName(trans.getAuthorName());
            translatorName.setResourceId(trans.getResourceId());
            translatorName.setLanguage(trans.getChapterList().get(0).getVerses().get(0).getLanguage());
            translatorNameRepository.save(translatorName);
        }

    }

    @GetMapping("/getAuthors")
    public List<TranslatorName> getAuthor(){
        return translatorNameRepository.findAll();
    }


}
