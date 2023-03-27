package com.nobugfound.gita2.service;

import com.nobugfound.gita2.model.Language;
import org.springframework.stereotype.Component;

@Component
public interface LanguageService {
    String save(Language language);
}
