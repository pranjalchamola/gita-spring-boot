package com.nobugfound.gita2.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "language")
public class Language {
    @Id
    private String languageId;
    private String languageName;

    public Language(){}

}
