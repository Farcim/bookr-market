package ru.example.bookmarket.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Builder
@Data
public class AuthorDTO {
    private Long id;
    private String name;
    private Set<GenreDTO> genres;

}
