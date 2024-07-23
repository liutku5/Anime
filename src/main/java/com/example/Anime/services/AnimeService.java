package com.example.Anime.services;

import com.example.Anime.models.Anime;
import com.example.Anime.repository.AnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AnimeService {
    @Autowired
    private AnimeRepository animeRepository;

    public Iterable<Anime> findAll(){
        return animeRepository.findAll();
    }

    public Optional<Anime> findById(Long id){
        return animeRepository.findById(id);
    }

    public Anime save(Anime anime){
        return animeRepository.save(anime);
    }

    public void deleteById(long id){
        animeRepository.deleteById(id);
    }
}
