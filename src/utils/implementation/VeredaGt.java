package utils.implementation;

import utils.vehicle.Vehicle;

public class VeredaGt implements Vehicle {
    private final float MAX_ENERGY = 1.0f;
    private float currentCharge = 0.0f;

    private int movementCount = 0;

    private float energyDelta;

    private String licensePlate;

    public VeredaGt(float energyDelta, String licensePlate){
        if (ensureIsValidEnergyDelta(energyDelta)) this.energyDelta = energyDelta;
        this.licensePlate = licensePlate;
        this.currentCharge = this.MAX_ENERGY;
    }

    @Override
    public float energyLevel() {
        return percentageTransformer(this.currentCharge);
    }

    @Override
    public void recharge() {
        this.currentCharge = this.MAX_ENERGY;
    }

    @Override
    public void move() {
        this.currentCharge -= this.energyDelta;
        this.movementCount ++;
    }

    @Override
    public String status() {
        return "El vehículo: " + this.licensePlate + "\n" +
                "Tiene un nivel de carga de: " + energyLevel()  + " %\n" +
                "y se ha movido: " + this.movementCount;
    }

    private float percentageTransformer(float value){
        if (value > 1.0){
            System.out.println("The value needs to be lower  or equal to 1");
        }
        return value * 100;
    }

    private  boolean ensureIsValidEnergyDelta(float energy){
        if(energy > 1){
            System.out.println("Add a value between 0.0 and 0.9");
            return false;
        }
        return true;
    }
}
