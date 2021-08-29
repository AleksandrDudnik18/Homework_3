package task_3_2;

import java.util.*;

import static task_3_2.CollectionUtils.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> source = newArrayList();
        source.addAll(Arrays.asList(1, 7, 8, 10, 5, 3, 27));
        System.out.println("(newArrayList) source is:");
        print(source);

        List<Integer> receiver = newArrayList();
        addAll(source, receiver);
        System.out.println("\n(addAll) receiver is:");
        print(receiver);

        System.out.println("\n(indexOf) index of element 10 in receiver is: " + indexOf(receiver, 10));

        System.out.println("\n(limit) limit of 3 is: " + limit(receiver, 3));

        System.out.println("\n(add) add number 77 to list: ");
        add(receiver, 77);
        print(receiver);

        System.out.println("\n(removeAll) remove all from first list of second list");
        removeAll(receiver, source);
        print(receiver);

        System.out.println("\n(containsAll) contains all from first list of second list");
        addAll(source, receiver);
        System.out.println("\nsource is:");
        print(source);
        System.out.println("\nreceiver is:");
        print(receiver);
        System.out.println();
        System.out.println(containsAll(source, receiver));
        System.out.println(containsAll(receiver, source));

        System.out.println("\n(containsAny)");
        System.out.println(containsAny(source, receiver));

        System.out.println("\n(range)");
        print(range(receiver, 5, 10));

        System.out.println("\n(range sorted naturalOrder)");
        print(range(receiver, 5, 10, Comparator.naturalOrder()));

        System.out.println("\n(range sorted reverseOrder)");
        print(range(receiver, 5, 10, Comparator.reverseOrder()));

    }

}
