package com.ajsantos.mongodbcrudexample.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;

    private Gender gender;
    private Address address;
    private ZonedDateTime created;
    private List<String> favouriteSubjects = new ArrayList<>();
    private BigDecimal totalSpentInBooks;
}
