package task_3_1;

import java.util.HashMap;
import java.util.Map;

public class CountMapImplementation<T> implements CountMap<T> {

    private Map<T, Integer> map = new HashMap<>();


    @Override
    public void add(T t) {
        map.put(t, map.getOrDefault(t, 0) + 1);
    }

    @Override
    public int getCount(T t) {
        return map.get(t);
    }

    @Override
    public int remove(T t) {
        return map.remove(t);
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public void addAll(CountMap<T> source) {
        Map<T, Integer> sourceInMap = source.toMap();
        sourceInMap.forEach((key, value) -> map.put(key, map.getOrDefault(key, 0) + value));
    }

    @Override
    public Map toMap() {
        return map;
    }

    @Override
    public void toMap(Map destination) {
        destination.putAll(map);
    }
}
