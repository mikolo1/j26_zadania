package integerExcersise;

import java.util.*;
import java.util.stream.Collectors;

public class IntegerExample3 {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        List<Integer> sortedList = new ArrayList<>();
        List<Integer> sortedList2 = new ArrayList<>();

        Random generator = new Random();
        System.out.println("Ile elementów chcesz wylosować?");
        while (integerList.size() < 10) {

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
        sortedList.addAll(integerList);
        Collections.sort(sortedList);
        sortedList2 = integerList.stream().sorted().collect(Collectors.toList());

        System.out.println("posortowane przez Collections:");
        sortedList.stream().forEach(System.out::println);
        System.out.println("posortowane lambdą");
        sortedList2.stream().forEach(System.out::println);

        double mediana;

        if(sortedList.size()%2 == 0){
            mediana = (sortedList.get(sortedList.size()/2)+sortedList.get((sortedList.size()/2)-1))/2;
        }else{
            mediana = sortedList.get(sortedList.size()/2);
        }
        System.out.println("Mediana: "+mediana);
        
    }
}
