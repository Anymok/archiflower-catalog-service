package fr.archiflower.catalog.controller;

import fr.archiflower.catalog.entity.Flower;
import fr.archiflower.catalog.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
public class CatalogController {

    @Autowired
    private CatalogService catalogService;
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/api/catalog")
    public Page<Flower> getCatalog(@RequestParam(name="page", required = false, defaultValue = "1") int page, @RequestParam(name="size", required = false, defaultValue = "10") int size) {
        Pageable pageable = PageRequest.of(page - 1, size);
        return catalogService.getCatalog(pageable);
    }
}
