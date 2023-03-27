package com.nobugfound.gita2.repository;

import com.nobugfound.gita2.model.Language;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LanguageRepository extends MongoRepository<Language,String> {
}
