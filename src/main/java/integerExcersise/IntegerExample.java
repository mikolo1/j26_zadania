package integerExcersise;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class IntegerExample {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        Scanner skaner = new Scanner(System.in);
        while (integerList.size() < 5) {
            System.out.println("Podaj liczbę do wpisania na listę: ");
            int cyfra = skaner.nextInt();
            integerList.add(cyfra);
        }

        Random generator = new Random();
        while (integerList.size() < 10) {

            integerList.add(generator.nextInt(100));
        }

        System.out.println("Elementy listy: ");
        for (Integer i : integerList) {
            System.out.println(i);
        }

        int suma = 0;
        for (Integer i : integerList) {
            suma += i;
        }

        System.out.println("Suma to: " + suma + ", Srednia to: " + suma / (double)integerList.size());
    }
}
