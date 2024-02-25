package app.mohl.backend.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CombinationsRepository extends JpaRepository<Combination, Long> {
    Combination findCombinationByFirstAndSecond(String first, String second);
}