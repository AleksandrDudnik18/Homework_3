package task_3_1;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        System.out.println("integer map: ");
        CountMap<Integer> mapOfInteger = new CountMapImplementation<>();

        mapOfInteger.add(10);
        mapOfInteger.add(10);
        mapOfInteger.add(5);
        mapOfInteger.add(6);
        mapOfInteger.add(5);
        mapOfInteger.add(10);

        mapOfInteger.toMap().forEach((key, value) -> System.out.println("key: " + key + ", value: " + value));

        System.out.println("\ndouble map: ");
        CountMap<Double> mapOfDouble = new CountMapImplementation<>();

        mapOfDouble.add(10.5);
        mapOfDouble.add(10.5);
        mapOfDouble.add(5.5);
        mapOfDouble.add(6.5);
        mapOfDouble.add(5.5);
        mapOfDouble.add(10.7);

        mapOfDouble.toMap().forEach((key, value) -> System.out.println("key: " + key + ", value: " + value));

        System.out.println("\ncopy map: ");

        Map<Double, Integer> mapForCopy = new HashMap<>();
        mapOfDouble.toMap(mapForCopy);

        mapForCopy.forEach((key, value) -> System.out.println("key: " + key + ", value: " + value));


    }

}
