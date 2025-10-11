package ru.aston.hometask.taskoneone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CustomHashSet<T> {

    private final List<T>[] buckets;
    private static final int INITIAL_SIZE = 16;

    @SuppressWarnings("unchecked")
    public CustomHashSet() {
        this.buckets = (List<T>[]) new ArrayList[INITIAL_SIZE];
    }

    public void add(T item) {
        if (item == null) throw new NullPointerException();
        int index = getIndex(item);

        if (buckets[index] == null) {
            buckets[index] = new ArrayList<>();
        }

        if (!buckets[index].contains(item)) {
            buckets[index].add(item);
        }
    }

    public void remove(T item) {
        if (item == null) return;
        int index = getIndex(item);

        if (buckets[index] != null) {
            buckets[index].remove(item);
        }
    }

    private int getIndex(T item) {
        return Math.abs(item.hashCode()) % INITIAL_SIZE;
    }

    @Override
    public String toString() {
        return Arrays.toString(buckets);
    }
}