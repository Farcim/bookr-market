package ru.example.bookmarket.dto;

import lombok.Builder;
import lombok.Data;
import ru.example.bookmarket.model.Author;

import java.util.Set;

@Data
@Builder
public class BookDTO  {
    private Long id;
    private String name;
    private Set<Author> author;
    private Integer price;
}
