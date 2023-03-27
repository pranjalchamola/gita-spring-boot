package com.nobugfound.gita2.repository;

import com.nobugfound.gita2.model.Translation;
import com.nobugfound.gita2.model.TranslatorName;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TranslatorNameRepository extends MongoRepository<TranslatorName,String> {
    Translation findByAuthorName(String AuthorName);
}
