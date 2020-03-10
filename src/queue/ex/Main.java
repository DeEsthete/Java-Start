package queue.ex;

import java.util.*;

public class Main {
    private static Market market = new Market();

    public static void main(String[] args) {
        //START INIT
        List<Deque<Consumer>> queues = new ArrayList<>(); // PLACE FOR QUEUES
        Deque<Consumer> firstQueue = new LinkedList<>(); // PLACE FOR ADDED CONSUMERS
        firstQueue.add(new Consumer("Василий", "Васильев", 9999));
        firstQueue.add(new Consumer("Иван", "Иванов", 5000));
        firstQueue.add(new Consumer("Степан", "Степанов", 1200));
        queues.add(firstQueue);
        //END INIT

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Choose your command: ");
            String choice = scanner.next();
            switch (choice) {
                case "ap": //ADD NEW CONSUMER
                    System.out.print("Firt name: ");
                    String firstName = scanner.next();
                    System.out.print("Last name: ");
                    String lastName = scanner.next();
                    System.out.print("Money: ");
                    int money = scanner.nextInt();
                    Consumer consumer = new Consumer(firstName, lastName, money);

                    List<Deque<Consumer>> queuesClone = new ArrayList<>();
                    queues.listIterator().forEachRemaining(queuesClone::add);
                    Collections.sort(queuesClone, (o1, o2) -> o1.size() - o2.size());
                    queuesClone.get(0).addLast(consumer);

                    consumersDistribution(queues);
                    System.out.println("New consumer added");
                    break;
                case "aq": // ADD NEW QUEUE
                    queues.add(new LinkedList<>());
                    consumersDistribution(queues);
                    System.out.println("New firstQueue added");
                    break;
                case "sh": // SHOW QUEUES
                    queues.listIterator()
                            .forEachRemaining(q -> {
                                System.out.println("\n" + "QUEUE: " + queues.indexOf(q));
                                q.iterator().forEachRemaining(System.out::println);
                            });
                    break;
                case "pa": // ACCEPT PAY OF QUEUE
                    queues.listIterator().forEachRemaining(Main::acceptQueue);
                    break;
            }
        }
    }

    private static void consumersDistribution(List<Deque<Consumer>> queues) {
        for (int i = 0; i < queues.size(); i++) {
            int biggestSize = -1;
            Deque<Consumer> biggest = null;
            int smallestSize = 2147483647;
            Deque<Consumer> smallest = null;
            for (Deque<Consumer> queue : queues) {
                if (biggestSize < queue.size()) {
                    biggest = queue;
                    biggestSize = biggest.size();
                }
                if (smallestSize > queue.size()) {
                    smallest = queue;
                    smallestSize = smallest.size();
                }
            }
            if (biggestSize > smallestSize) {
                smallest.addLast(biggest.removeLast());
            }
        }
    }

    private static void acceptQueue(Deque<Consumer> queue) {
        int iterationCount = queue.size();
        for (int i = 0; i < iterationCount; i++) {
            market.payAccept(queue.poll(), Items.getRandom());
        }
    }
}