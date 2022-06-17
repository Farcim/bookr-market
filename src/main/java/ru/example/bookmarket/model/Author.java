package ru.example.bookmarket.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Builder
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"name"}))
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToMany
    private Set<Genre> genres;
    //secondarytable//
}
