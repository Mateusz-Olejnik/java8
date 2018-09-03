package cwiczenia;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PersonApp {
    public static void main(String[] args) {
        Person person1 = new Person("Mateusz" , "Olejnik",26);
        Person person2 = new Person("Jan" , "Kowalski" , 50);
        Person person3 = new Person("Agnieszka", "Nowak", 23);
        Person person4 = new Person("Tomasz", "Kowalski", 35);
        Person person5 = new Person("Michał", "Nowak", 28);
        Person person6 = new Person("Patrycja","Kowalska", 18);

        List<Person> people = Arrays.asList(person1, person2, person3, person4, person5, person6);

//        Consumer cons = person -> System.out.println(person);

        consumeList(people,(person -> System.out.println(person)));
//        consumeList(people,System.out::println);
    }

    static <T> void consumeList(List<T> list, Consumer<T> consumer){
        for (T object : list){
            consumer.accept(object);
        }
    }

}
