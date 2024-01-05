package agh.ics.oop.project.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimulationTest {

    @BeforeEach
    void init(){
    }
    @Test
    void spawnPlantsTest(){
        SimulationConfiguration config = new SimulationConfiguration(20,20,53,3,7,60,60,5, 10, 1, 3,100, true);
        Simulation sim = new Simulation(config);
        sim.setUp();
        HashMap<Vector2d, Tile> tiles = sim.getMap().getTiles();
        int cnt = 0;
        for(Tile tile : tiles.values()){
            if(tile.getPlant() != null) cnt += 1;
        }
        assertEquals(cnt, config.getInitialPlantCount());
    }

    @Test
    void spawnAnimalsTest(){
        SimulationConfiguration config = new SimulationConfiguration(20,20,53,3,7,60,60,5, 10, 1, 3,100, true);
        Simulation sim = new Simulation(config);
        sim.setUp();
        HashMap<Vector2d, Tile> tiles = sim.getMap().getTiles();
        int cnt = 0;
        for(Tile tile : tiles.values()){
            cnt += tile.getAnimals().size();
        }
        assertEquals(cnt, config.getInitialAnimalCount());
    }

}
