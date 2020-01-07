package ecutb.peter;

public class toString_test {

    private String regNumber;
    private String brand;
    private String color;


    public toString_test(String regNumber, String brand, String color) {
        this.regNumber = regNumber;
        this.brand = brand;
        this.color = color;
    }

    @Override
    public String toString(){
        return "Reg. nr: " + regNumber + "\nBrand: " + brand + "\nColor: " + color;
    }


}
