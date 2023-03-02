package com.transperfectassessment.searchservice.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Book {
    private String id;
    private String title;
    private String author;
    private String category;
}
