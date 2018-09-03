package cwiczenia;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        //   numbers.stream().forEach(number -> System.out.println(number));
//
//    numbers.stream()
//            .filter(number -> number%2==0)
//            .map(number -> number*2)
//            .forEach(System.out::println);


//        List<Integer> list = numbers.stream()
//                .filter(number -> number % 2 == 0)
//                .map(number -> number * 2)
//                .collect(Collectors.toList());
        //liczby > 10 , liczby * 10 , znajdz najmniejsza liczbe z podanych


        List<Integer> integers = numbers.stream()
                .filter(number -> number > 10)
                .map(number -> number * 10)
                .collect(Collectors.toList());
        System.out.println(integers.stream().min(Integer::compareTo).get());

        //drugi sposob
//        Integer integer = numbers.stream()
//                .filter(number -> number > 10)
//                .map(number -> number * 10)
//                .min(Integer::compareTo)
//                .get();
//        System.out.println(integer);



        List<String> listOfNames = Arrays.asList("Mateusz","Ola", "Bartek", "Karolina","Adrian", "Ewelina");

        //imiona wiecej niz 5 liter , wszystkie od upperCase'a (do wielkich liter),
        // dokleic @ do kazdego imienia, ograniczyc do 2 osob, wyswietlic te dwie osoby

        listOfNames.stream()
                .filter(name -> name.length()>5)
                .map(name -> name.toUpperCase())
                .map(name -> '@'+name)
                .limit(2)
                .forEach(System.out::println);
    }


}
