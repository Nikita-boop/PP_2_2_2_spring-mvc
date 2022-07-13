package model;

public class Car {
    private String brand;
    private String model;
    private int series;

    public Car(String brand, String model, int series) {
        this.brand = brand;
        this.model = model;
        this.series = series;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return brand + " " + model + series;
    }
}
