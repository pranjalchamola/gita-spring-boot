package com.nobugfound.gita2.service;

import com.nobugfound.gita2.model.TranslatorName;
import org.springframework.stereotype.Component;

@Component
public interface TranslatorNameService {
    String save(TranslatorName translatorName);
}
