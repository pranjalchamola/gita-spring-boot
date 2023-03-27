package com.nobugfound.gita2.repository;

import com.nobugfound.gita2.model.Translation;
import com.nobugfound.gita2.model.TranslationChapter;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TranslationRepository extends MongoRepository<Translation,String> {
    Translation findByresourceId(int resourceId);
}
