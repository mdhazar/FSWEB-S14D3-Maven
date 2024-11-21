package org.example.arge;

public class ElectricCar extends CarSkeleton {

    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize){
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public String startEngine(){
        System.out.println(getClass().getSimpleName());
        return "ElectricCar's engine is starting";
    }

    @Override
    public String drive(){
        this.runEngine();
        System.out.println(getClass().getSimpleName());
        return "ElectricCar is being drove";
    }
}