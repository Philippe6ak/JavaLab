package ru.itis.javalab.models;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
public class Product {
    private Long id;
    private String title;
    private Double price;
    private User owner;
}
