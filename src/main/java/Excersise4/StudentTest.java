package Excersise4;

import java.util.ArrayList;
import java.util.List;

import static Excersise4.Plec.FEMALE;
import static Excersise4.Plec.MALE;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> studentList =  new ArrayList<>();
        studentList.add(new Student(1,"Jan", "Kowalski", MALE));
        studentList.add(new Student(2,"Tomasz", "Tomaszewski", MALE));
        studentList.add(new Student(3,"Anna", "Piękna", FEMALE));
        studentList.add(new Student(4,"Jola", "Szybka", FEMALE));

        System.out.println("Wszyscy:");
        studentList.forEach(System.out::println);

        System.out.println("\nMężczyźni:");
        studentList.stream().filter(a->a.Plec==MALE).forEach(System.out::println);

        System.out.println("\nKobiety:");
        studentList.stream().filter(a->a.Plec==FEMALE).forEach(System.out::println);

        System.out.println("\nNr indeksów:");
        studentList.stream().map(a->a.getNr_indeksu()).forEach(System.out::println);


    }
}
