package fr.archiflower.catalog.service;

import fr.archiflower.catalog.entity.Flower;
import fr.archiflower.catalog.repository.FlowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class FlowerService {

    @Autowired
    private FlowerRepository flowerRepository;

    public Flower getFlowerById(UUID id) {
        return flowerRepository.findById(id).orElse(null);
    }

    public Iterable<Flower> getFlowersById(List<UUID> id) {
        return flowerRepository.findAllById(id);
    }

    public Flower addFlower(String name, String description, Integer price, String color) {
        Flower flower = new Flower(name, description, price, color);
        return flowerRepository.save(flower);
    }
}
