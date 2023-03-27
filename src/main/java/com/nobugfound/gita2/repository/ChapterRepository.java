package com.nobugfound.gita2.repository;

import com.nobugfound.gita2.model.Chapter;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChapterRepository extends MongoRepository<Chapter,String> {
    List<Chapter> findOneByChapterId(String chapterId);
}
