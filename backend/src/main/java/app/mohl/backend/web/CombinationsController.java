package app.mohl.backend.web;

import app.mohl.backend.model.Combination;
import app.mohl.backend.service.CombinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/combinations")
public class CombinationsController {

    private final CombinationsService combinationsService;

    @Autowired
    public CombinationsController(CombinationsService combinationsService) {
        this.combinationsService = combinationsService;
    }

    @GetMapping("/combinations/{first}/{second}")
    public Combination getCombination(@PathVariable String first, @PathVariable String second) {
        return combinationsService.findCombination(first, second);
    }
}