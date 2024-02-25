package app.mohl.backend.services;

import app.mohl.backend.data.Combination;
import app.mohl.backend.data.CombinationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CombinationsService {

    private final CombinationsRepository combinationsRepository;

    @Autowired
    public CombinationsService(CombinationsRepository combinationsRepository) {
        this.combinationsRepository = combinationsRepository;
    }

    public Combination findCombination(String first, String second) {
        return combinationsRepository.findCombinationByFirstAndSecond(first, second);
    }
}