package Exercises_From_StartIt.homework_4.exercise_1;

public class Ford extends Car{
    private int year;
    private double manufacturerDiscount;

    public Ford(double speed, double regularPrice, String color, int year,
        double manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getManufacturerDiscount() {
        return manufacturerDiscount;
    }

    public void setManufacturerDiscount(double manufacturerDiscount) {
        this.manufacturerDiscount = manufacturerDiscount;
    }

    @Override
    public double getSalePrice(double regularPrice) {
        return super.getSalePrice(regularPrice - manufacturerDiscount);
    }
}
