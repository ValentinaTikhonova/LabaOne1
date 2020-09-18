/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labaone1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class LabaOne1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = input (); //Строка c первым числом
        String s2 = input (); //Строка cо вторым числом
        String s3 = input (); //Строка c третьим числом
        int sum = sum (s1,s2,s3); //Вызов метода суммы числе
        int com = composition (s1,s2,s3);//Вызов метода произведения чисел
        //Печать результата операций суммы и произведения
        System.out.println("Сумма чисел = " + sum);
        System.out.println("Произведение чисел = " + com);
              
    }
    
    // Метод, реализующий ввод входной строки символов
    private static String input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        return in.next();

    }
     // Метод, реализующий сумму чисел введенных пользователем
    private static Integer sum(String s, String s1, String s2) {
        int i = Integer. parseInt(s);
        int j = Integer. parseInt(s1);
        int k = Integer. parseInt(s2);
        int m = i + j + k;
        return m;

    }
         // Метод, реализующий произведение чисел введенных пользователем
    private static Integer composition(String s, String s1, String s2) {
        int i = Integer. parseInt(s);
        int j = Integer. parseInt(s1);
        int k = Integer. parseInt(s2);
        int m = i * j * k;
        return m;

    }
    }
    
