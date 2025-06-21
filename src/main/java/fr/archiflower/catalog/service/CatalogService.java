package fr.archiflower.catalog.service;

import fr.archiflower.catalog.entity.Flower;
import fr.archiflower.catalog.repository.CatalogRepository;
import fr.archiflower.catalog.repository.FlowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CatalogService {

    @Autowired
    private CatalogRepository catalogRepository;

    @Autowired
    private FlowerRepository flowerRepository;

    public Page<Flower> getCatalog(Pageable pageable) {
        return catalogRepository.findAll(pageable);
    }
}
