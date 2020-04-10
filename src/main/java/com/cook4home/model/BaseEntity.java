package com.cook4home.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * Created by Vishnu.jangid on 09/04/2020 AD .
 */

@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@MappedSuperclass
public class BaseEntity {
    Date createdAt;
    Date updatedAt;
    Date deletedAt;
}
