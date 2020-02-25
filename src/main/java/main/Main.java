/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import student.Student;

/**
 *
 * @author java
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student novo = new Student("Petar", "Petrovic", 1990);
        novo.showdata();
    }
    
}
