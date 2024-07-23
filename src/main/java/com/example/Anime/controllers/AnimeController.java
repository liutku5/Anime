package com.example.Anime.controllers;

import com.example.Anime.models.Anime;
import com.example.Anime.services.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/anime")
public class AnimeController {

    @Autowired
    private AnimeService animeService;

    @GetMapping
    public Iterable<Anime> getAllAnime(){
        return animeService.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Anime> getAnimeById(@PathVariable Long id){
        Optional<Anime> anime = animeService.findById(id);
        if(anime.isPresent()){
            return ResponseEntity.ok(anime.get());
        }else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping
    public Anime createAnime(@RequestBody Anime anime){
        return animeService.save(anime);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Anime> updateAnime(@PathVariable Long id, @RequestBody Anime animeDetails){
        Optional<Anime> anime = animeService.findById(id);
        if(anime.isPresent()){
            Anime updateAnime = anime.get();
            updateAnime.setNameJP(animeDetails.getNameJP());
            updateAnime.setNameEN(animeDetails.getNameEN());
            updateAnime.setReleaseDate(animeDetails.getReleaseDate());
            updateAnime.setSourceId(animeDetails.getSourceId());
            updateAnime.setEpisodes(animeDetails.getEpisodes());
            updateAnime.setDescription(animeDetails.getDescription());
            updateAnime.setStudio(animeDetails.getStudio());
            return ResponseEntity.ok(animeService.save(updateAnime));
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAnime(@PathVariable Long id){
        animeService.deleteById(id);
        return ResponseEntity.noContent().build();
    }


}























