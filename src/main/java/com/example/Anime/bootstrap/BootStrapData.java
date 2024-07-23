package com.example.Anime.bootstrap;

import com.example.Anime.repository.AnimeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final AnimeRepository animeRepository;
    private Logger logger = LoggerFactory.getLogger(BootStrapData.class);

    public BootStrapData(AnimeRepository animeRepository){
        this.animeRepository = animeRepository;
    }
    @Override
    public void run(String... args) {
        System.out.println("labas");

    }
}
