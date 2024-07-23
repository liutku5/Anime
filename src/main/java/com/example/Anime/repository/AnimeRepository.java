package com.example.Anime.repository;

import com.example.Anime.models.Anime;
import org.springframework.data.repository.CrudRepository;

public interface AnimeRepository extends CrudRepository<Anime,Long> {
}
