package com.hora.computers;

public class Computer {
    //region Atributy
    private String model;
    private double weight;
    private double diagonalOfMonitor;
    private boolean isCompanyComputer;
    //endregion

    //region Konstruktory

    public Computer(String model, double weight, double diagonalOfMonitor, boolean isCompanyComputer) {
        this.model = model;
        this.weight = weight;
        this.diagonalOfMonitor = diagonalOfMonitor;
        this.isCompanyComputer = isCompanyComputer;
    }

    public Computer() {

    }

//endregion


    //region Metody

    public String getModel() {
        return model;
    }

    public void setModel(String modelVal) {
        this.model = modelVal;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weightVal) {
        this.weight = weightVal;
    }

    public double getDiagonalOfMonitor() {
        return diagonalOfMonitor;
    }

    public void setDiagonalOfMonitor(double diagonalOfMonitor) {
        this.diagonalOfMonitor = diagonalOfMonitor;
    }

    public boolean isCompanyComputer() {
        return isCompanyComputer;
    }

    public void setCompanyComputer(boolean companyComputer) {
        isCompanyComputer = companyComputer;
    }


    //endregion


    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", weight=" + weight +
                ", diagonalOfMonitor=" + diagonalOfMonitor +
                ", isCompanyComputer=" + isCompanyComputer +
                '}';
    }
}
