package sim.customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(0, "Pavlov", "Evgeniy", "Ivanovich", "Ulica", "0931-4444-1111-2222", "ABC1");
        Customer customer1 = new Customer(1, "Ivanov", "Ivan", "Ivanovich", "UlicaIvana", "9999-1111-2222-3333", "DCV2");
        Customer customer2 = new Customer(2, "Stepanov", "Stepan", "Stepanovich", "UlicaStepana", "0000-0000-1111-1111", "GFG2");

        Customer[] customers = new Customer[]{customer, customer1, customer2};

        System.out.println("В алфавитном порядке");
        Arrays.stream(customers).sorted(new SortByLastName()).forEach(System.out::println);
        String start = "5555-5555-5555-5555";
        String end = "8888-8888-8888-8888";
        System.out.println("В интервале от " + start + " до " + end);
        Arrays.stream(customers)
                .filter(c -> c.getCreditCardNumber().compareTo(start) >= 0 && c.getCreditCardNumber().compareTo(end) <= 0)
                .forEach(System.out::println);
    }
}

class SortByLastName implements Comparator<Customer>
{
    // Used for sorting in ascending order of
    // roll number
    public int compare(Customer a, Customer b)
    {
        return a.getLastName().charAt(0) - b.getLastName().charAt(0);
    }
}