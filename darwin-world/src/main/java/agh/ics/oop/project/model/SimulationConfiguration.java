package agh.ics.oop.project.model;

public class SimulationConfiguration {
    private final int mapSizeX;
    private final int mapSizeY;
    private final int initialPlantCount;
    private final int numberOfPlantsGrowingPerDay;
    private final int initialAnimalCount;
    private final int initialAnimalEnergy;
    private final int readyToReproduceEnergy;
    private final int genomeLength;

    public SimulationConfiguration(int mapSizeX, int mapSizeY, int initialPlantCount, int numberOfPlantsGrowingPerDay, int initialAnimalCount, int initialAnimalEnergy, int readyToReproduceEnergy, int genomeLength) {
        this.mapSizeX = mapSizeX;
        this.mapSizeY = mapSizeY;
        this.initialPlantCount = initialPlantCount;
        this.numberOfPlantsGrowingPerDay = numberOfPlantsGrowingPerDay;
        this.initialAnimalCount = initialAnimalCount;
        this.initialAnimalEnergy = initialAnimalEnergy;
        this.readyToReproduceEnergy = readyToReproduceEnergy;
        this.genomeLength = genomeLength;
    }

    public int getMapSizeX() {
        return mapSizeX;
    }

    public int getMapSizeY() {
        return mapSizeY;
    }

    public int getInitialPlantCount() {
        return initialPlantCount;
    }

    public int getNumberOfPlantsGrowingPerDay() {
        return numberOfPlantsGrowingPerDay;
    }

    public int getInitialAnimalCount() {
        return initialAnimalCount;
    }

    public int getInitialAnimalEnergy() {
        return initialAnimalEnergy;
    }

    public int getReadyToReproduceEnergy() {
        return readyToReproduceEnergy;
    }

    public int getGenomeLength() {
        return genomeLength;
    }
}
