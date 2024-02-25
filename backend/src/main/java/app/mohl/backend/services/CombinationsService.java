package app.mohl.backend.services;

import app.mohl.backend.data.Combination;
import app.mohl.backend.data.CombinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CombinationsService {

    private final CombinationRepository combinationRepository;

    @Autowired
    public CombinationsService(CombinationRepository combinationRepository) {
        this.combinationRepository = combinationRepository;
    }

    public Combination findCombination(String first, String second) {
        return combinationRepository.findCombinationByFirstAndSecond(first, second);
    }
}