package com.nobugfound.gita2.service;

import com.nobugfound.gita2.model.TranslatorName;
import com.nobugfound.gita2.repository.TranslatorNameRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TranslatorNameServiceImpl implements TranslatorNameService{

    @Autowired
    TranslatorNameRepository translatorNameRepository;
    @Override
    public String save(TranslatorName translatorName) {
        return translatorNameRepository.save(translatorName).getAuthorName();
    }
}
