package task_3_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionUtils {

    public static <T> void addAll(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }

    public static <T> List<T> newArrayList() {
        return new ArrayList<>();
    }

    public static <T> int indexOf(List<? extends T> source, T t) {
        return source.indexOf(t);
    }

    public static <T> List<T> limit(List<? extends T> source, int size) {
        return source.stream().limit(size).collect(Collectors.toList());
    }

    public static <T> void add(List<? super T> source, T t) {
        source.add(t);
    }

    public static <T> void removeAll(List<? super T> removeFrom, List<? extends T> c2) {
        removeFrom.removeAll(c2);
    }

    public static <T> boolean containsAll(List<? extends T> c1, List<? extends T> c2) {
        return c1.containsAll(c2);
    }

    public static <T> boolean containsAny(List<? extends T> c1, List<? super T> c2) {
        return c1.stream().anyMatch(c2::contains);
    }

    public static <T extends Comparable<T>> List<T> range(List<T> list, T min, T max) {
        List<T> newList = newArrayList();

        list.forEach(el -> {
            if(el.compareTo(min) >= 0 && max.compareTo(el) >= 0) {
                newList.add(el);
            }
        });

        return newList;
    }

    public static <T extends Comparable<T>> List<T> range(List<T> list, T min, T max, Comparator<T> comparator) {
        List<T> newList = newArrayList();

        list.forEach(el -> {
            if (el.compareTo(min) >= 0 && max.compareTo(el) >= 0) {
                newList.add(el);
            }

        });

        newList.sort(comparator);
        return newList;
    }

    public static <T> void print(List<? extends T> list) {
        list.forEach(el -> System.out.print(el + " "));
    }
}
