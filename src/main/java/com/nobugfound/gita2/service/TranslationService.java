package com.nobugfound.gita2.service;

import com.nobugfound.gita2.model.Translation;
import org.springframework.stereotype.Component;

@Component
public interface TranslationService {

    int save(Translation translation);

}
