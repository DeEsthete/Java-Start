package iterator.ex1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Ivan", "Ivanovich", "Ivanov", 17, "A3"));
        persons.add(new Person("Stepan", "Stepanovich", "Stepanov", 17, "A2"));
        persons.add(new Person("Alexey", "Alexeevich", "Alexeev", 17, "B1"));

        System.out.println("До сортировки: ");
        persons.listIterator().forEachRemaining(p -> System.out.println(p));
        System.out.println("После сортировки по фамилии: ");
        persons.sort(Person.getComparator(ComparableField.LAST_NAME));
        persons.listIterator().forEachRemaining(p -> System.out.println(p));
        System.out.println("После сортировки по группе: ");
        persons.sort(Person.getComparator(ComparableField.GROUP_NAME));
        persons.listIterator().forEachRemaining(p -> System.out.println(p));
    }
}