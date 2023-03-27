package com.nobugfound.gita2.service;

import com.nobugfound.gita2.model.Language;
import com.nobugfound.gita2.repository.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LanguageServiceImpl implements LanguageService{

    @Autowired
    LanguageRepository languageRepository;
    @Override
    public String save(Language language) {
        return languageRepository.save(language).getLanguageId();
    }
}
