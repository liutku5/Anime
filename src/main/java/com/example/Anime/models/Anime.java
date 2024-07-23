package com.example.Anime.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "anime")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Anime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name_jp")
    private String name_jp;

    @Column(name = "name_en")
    private String name_en;

    @Column(name = "release_date")
    private long release_date;

    @Column(name = "source_id")
    private long source_id;

    @Column(name = "episodes")
    private int episodes;

    @Column(name = "discription")
    private String discription;

    @Column(name = "studio")
    private String studio;

}
