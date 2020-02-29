
package main;

import media.Radio;
import media.Television;
import student.Student;


public class Main {

    
    public static void main(String[] args) {
        Student novo = new Student("Petar", "Petrovic", 1990);
        novo.showdata();
        
      Television LG = new Television();  
        LG.setCurrentProgram(57);
        LG.setTurnOn(true);
        LG.setVolume(1);
        System.out.println("");
        System.out.println(LG.getCurrentProgram());
        System.out.println(LG.getTurnOn());
        System.out.println(LG.getVolume());
        
        Radio Hit = new Radio();
        Hit.setBand('f');
        Hit.setamFrequency(55);
        Hit.setfmFrequency(103.3);
        
        System.err.println("");
        System.out.println("FM Frequency is: " + Hit.getfmFrequency());
        System.out.println("AM Frequency is: " + Hit.getamFrequency());
        System.out.println("Band is: " + Hit.getband());   
        
    }
    
}
