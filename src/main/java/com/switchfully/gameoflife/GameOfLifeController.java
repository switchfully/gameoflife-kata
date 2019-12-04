package com.switchfully.gameoflife;

import com.switchfully.gameoflife.kata.GameOfLife;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gameoflife")
public class GameOfLifeController {

    @PostMapping(value = "/world")
    public List<List<Boolean>> getWorld(@RequestBody List<List<Boolean>> currentWorld) {
        return new GameOfLife().generateNextWorld(currentWorld);
    }
}
