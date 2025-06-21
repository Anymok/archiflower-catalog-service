package fr.archiflower.catalog.repository;

import fr.archiflower.catalog.entity.Flower;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository

public interface FlowerRepository extends CrudRepository<Flower, UUID> {
}
