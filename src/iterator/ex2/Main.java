package iterator.ex2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(-2);
        list.add(4);
        list.add(-3);
        list.add(5);
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size()-1; j++) {
                if (list.get(j) < 0) {
                    list.set(j, list.set(j+1, list.get(j)));
                }
            }
        }
        list.listIterator().forEachRemaining(i -> System.out.println(i));
    }
}