package com.nobugfound.gita2.service;

import com.nobugfound.gita2.model.Translation;
import com.nobugfound.gita2.repository.TranslationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TranslationServiceImpl implements TranslationService{

    @Autowired
    TranslationRepository translationRepository;
    @Override
    public int save(Translation translation) {
        return translationRepository.save(translation).getResourceId();
    }
}
