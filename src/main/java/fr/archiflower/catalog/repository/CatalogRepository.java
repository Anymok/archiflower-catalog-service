package fr.archiflower.catalog.repository;

import fr.archiflower.catalog.entity.Flower;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CatalogRepository extends PagingAndSortingRepository<Flower, UUID> {


    Page<Flower> findAll(Pageable pageable);

}
