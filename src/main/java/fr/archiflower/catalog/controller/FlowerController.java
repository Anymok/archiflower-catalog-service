package fr.archiflower.catalog.controller;

import fr.archiflower.catalog.entity.Flower;
import fr.archiflower.catalog.service.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@CrossOrigin(origins = "*")
@RestController
public class FlowerController {

    @Autowired
    private FlowerService flowerService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/api/flower/{id}")
    public Flower getFlower(@PathVariable UUID id) {
        return flowerService.getFlowerById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/api/flower/list")
    public Iterable<Flower> getFlowersById(@RequestBody List<UUID> id_list) {
        return flowerService.getFlowersById(id_list);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/api/flower")
    public Flower createFlower(
            @RequestParam(value="name") String name,
            @RequestParam(value="description") String description,
            @RequestParam(value="price") Integer price,
            @RequestParam(value="color") String color
    ) {
        return flowerService.addFlower(name, description, price, color);
    }
}
