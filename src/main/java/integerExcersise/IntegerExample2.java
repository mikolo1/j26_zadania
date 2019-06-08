package integerExcersise;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class IntegerExample2 {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        Scanner skaner = new Scanner(System.in);
        System.out.println("Ile elementów chcesz wpisać ręcznie?");
        int recznie = skaner.nextInt();

        while (integerList.size() < recznie) {
            System.out.println("Podaj liczbę do wpisania na listę: ");
            int cyfra = skaner.nextInt();
            integerList.add(cyfra);
        }

        Random generator = new Random();
        System.out.println("Ile elementów chcesz wylosować?");
        int losowo = skaner.nextInt();
        while (integerList.size() < recznie + losowo) {

            integerList.add(generator.nextInt(100));
        }

        System.out.println("Elementy listy: ");
        for (Integer i : integerList) {
            System.out.println(i);
        }

        double suma = 0;
        for (Integer i : integerList) {
            suma += i;
        }

        System.out.println("Suma to: " + suma + ",srednia to: " + suma / integerList.size());
    }
}
