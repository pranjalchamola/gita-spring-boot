//package com.nobugfound.gita2.controller;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.nobugfound.gita2.model.*;
//import com.nobugfound.gita2.service.ChapterService;
//import com.nobugfound.gita2.service.CopyService;
//import com.nobugfound.gita2.service.TranslationService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.ArrayList;
//import java.util.List;
//
//
//@RestController
//public class CopyController {
//
//    private final CopyService copyService;
//
//
//    @Autowired
//    public ChapterService chapterService;
//    @Autowired
//    public CopyController(CopyService copyService) {
//        this.copyService = copyService;
//    }
//
//    @GetMapping("/copy")
//    public String copyData() throws JsonProcessingException {
//        test(48,1,"1 : Arjuna Vishad Yog");
//        test(73, 2,"2 : Sankhya Yog");
//        test(44, 3,"3 : Karm Yog");
//        test(43, 4,"4 : Gyan Karm Sanyas Yog");
//        test(30, 5,"5 : Karm Sanyas Yog");
//        test(48, 6,"6 : Dhyan Yog");
//        test(31, 7,"7 : Gyan Vigyan Yog");
//        test(29, 8,"8 : Akshar Brahma Yog");
//        test(35, 9,"9 : Raj Vidhya Raj Guhya Yog");
//        test(43, 10,"10 : Vibhuti Yog");
//        test(56, 11,"11 : Vishwaroop Darshan Yog");
//        test(21, 12,"12 : Bhakti Yog");
//        test(35, 13,"13 : Kshetra Kshetragya Vibhag Yog");
//        test(28, 14,"14 : Gunatray Vibhag Yog");
//        test(21, 15,"15 : Purushottam Yog");
//        test(25, 16,"16 : Daivasur Sampad Vibhag Yog");
//        test(29, 17,"17 : Shraddha Traya Vibhag Yog");
//        test(79, 18,"18 : Moksha Sanyas Yog");
//        return "Done";
//    }
//
//    private void test(int tempI,int tempChap, String chapName) throws JsonProcessingException {
//        Chapter chapter=new Chapter();
//        chapter.setChapterName(chapName);
//        List<Verse> listVerses=new ArrayList<>();
//        for (int i = 1; i < tempI; i++) {
//            Verse verse=new Verse();
//            ResponseEntity<String> answer = copyService.consumeApi(i,tempChap);
//            ObjectMapper objectMapper = new ObjectMapper();
//            GitaVerse response = objectMapper.readValue(answer.getBody(), GitaVerse.class);
//            verse.setVerseKey(response.getChapterNumber()+"."+response.getVerseNumber());
//            verse.setVerseId(String.valueOf(response.getVerseNumber()));
//            chapter.setChapterId(String.valueOf(response.getChapterNumber()));
//            verse.setVerseData(response.getText());
//            listVerses.add(verse);
//            System.out.println(verse.getVerseKey());
//        }
//
//        chapter.setVerse(listVerses);
//        //chapterService.save(chapter);
//    }
//
//}
