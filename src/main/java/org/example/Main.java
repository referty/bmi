package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gu
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите сначала ваш вес, после введите ваш рост.");
        Scanner inputHandler = new Scanner(System.in);
        String weight = inputHandler.nextLine();
        String height = inputHandler.nextLine();
        double w;
        double h;
        double bmi;
        try {
            w = Double.parseDouble(weight);
            h = Double.parseDouble(height) / 100;
        } catch (NumberFormatException e) {
            System.out.println("НЕВЕРНО БЛЯТЬ");
            return;
        }
        bmi = Math.round(w * 100 / Math.pow (h,2) ) / 100f;
        System.out.printf("%.2f\n",bmi);
        if (bmi < 18.5) {
            System.out.println("Почти Андей Савин(слегка худее)");
        }
        if (bmi < 25 && bmi >=18.5){
            System.out.println("Поздравляю вы как Андрей Савин");
        }
        if (bmi < 30 && bmi >=25){
            System.out.println("К сожалению, вы пухлее Андрея Савина.");
        }
        if (bmi >= 30){
            System.out.println("Я безумно вам сочувствую, но вы даже не приблизились, а даже очень сильно привысили вес Андрюшки Савина...");
        }
    }
}


