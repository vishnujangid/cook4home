package com.cook4home.response;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CookResponse {
    Long id;
    String name;
    Integer age;
    Integer experience;
    String area;
    Integer rating;
}
