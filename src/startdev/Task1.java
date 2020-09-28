/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Scanner;

/**
 *
 * @author user
 */
class Task1 {
    public void run(){
        int Celcius;
        int d = 32;
        double c = 0;
        double Farengeith = 1.8;
        String s1, s2;
        System.out.println("----- Задача 1 ------");
        System.out.println("Введите число градусов по Цельсию: ");
        // решение задачи
        Celcius = new Scanner(System.in).nextInt(); 
        c = Celcius * Farengeith + d;
        System.out.println("По Фарингейту это будет: " + c);
        System.out.println("----- конец задачи 1 ------");
    }
}
