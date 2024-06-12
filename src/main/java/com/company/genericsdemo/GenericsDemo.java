/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.company.genericsdemo;

/**
 *
 * @author kamau
 */
public class GenericsDemo {

    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.print(element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] integers = { 1, 2, 3, 4, 5 };
        Double[] doubles = { 1.1, 2.2, 3.3, 4.4 };
        Character[] characters = { 'H', 'E', 'L', 'L', 'O' };
        
        System.out.println("Integers");
      printArray(integers);
      
      System.out.println("doubles");
      printArray(doubles);
      
      System.out.println("Characters");
      printArray(characters);
    }
}
