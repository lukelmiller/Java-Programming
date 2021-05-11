/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversionapp;

/**
 *
 * @author lukemiller
 */
public class ConversionApp {

    public static void main(String[] args) {
        System.out.println("Feet        Meters");
        for(int i=0; i<11; i++){
            Double loopTest= footToMeter(i);
            System.out.println(i+ "           " + loopTest);
                
            
        }
        System.out.println("Meters      Feet");
        for(int i=20; i<66; i+=5){
            Double loopTest= meterToFeet(i);
            System.out.println(i+ "          " + loopTest);
        }
        
    }
    public static double footToMeter(double foot){

        double meter = 0.305 * foot;
        return meter;
    }
    public static double meterToFeet(double meter){
        
        double foot = 3.279 * meter;
        return foot;
    }
    
            

//    Feet      Meters        |     Meters                Feet
//
//    1.0       0.305           |     20.0                     65.574
//    2.0      0.610            |     25.0                     81.967
//    ...
//
//    9.0       2.745          |      60.0                     196.721
//    10.0    3.050           |      65.0                      213/115

}
