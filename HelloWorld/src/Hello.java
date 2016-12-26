//Created by jesus marco del carmen on 12/24/16.

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello Marco");

        //whole numbers
        byte mbyte = 65;
        short mshort = 12;
        int mint = 100000;
        long mlong = (mbyte + mshort + mint + 10 * 50000);
        //print long Number
        System.out.println("Long number : " + mlong);


        //Float and Decimals
        //Double has width of 64 (8 bytes)
        float mfloat = (5.0000f / 2f);
        System.out.println("My float: " + mfloat);


        double lbs = 200d;
        double conversion = 0.45359237d;
        double kilograms = lbs * conversion;

        System.out.println("Kilograms: " + kilograms);

    }
}