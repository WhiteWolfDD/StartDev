/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Random;

/**
 *
 * @author user
 */
public class Task5 {
    public void run() {
        System.out.println("----- Задача 5 ------");
        System.out.println("Создаем ДВУХМЕРНЫЙ массив  из 10х5 ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");
        Random random = new Random();
        int myArr[][] = new int[10][5];
        for (int[] myArr1 : myArr) {
            for (int j = 0; j < myArr1.length; j++) {
                myArr1[j] = random.nextInt(49 + 1);
            }
        }
        for (int[] myArr1 : myArr) {
            System.out.println();
            for (int j = 0; j < myArr1.length; j++) {
                System.out.printf(myArr1[j] + " ");
            }
            System.out.println(); 
        }
        System.out.println("----- конец задачи 5 ------");
    }
}
