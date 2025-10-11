package ru.aston.hometask.taskoneone;

import java.util.Arrays;
import java.util.Collection;


public class CustomArrayList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public CustomArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public void add(T element) {
        ensureCapacity();
        elements[size++] = element;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        checkBounds(index);
        return (T) elements[index];
    }

    public T remove(int index) {
        checkBounds(index);
        T oldValue = get(index);
        shiftLeft(index);
        elements[--size] = null;
        return oldValue;
    }

    public boolean addAll(Collection<? extends T> collection) {
        ensureCapacity(collection.size());
        for (T item : collection) {
            elements[size++] = item;
        }
        return true;
    }

    private void checkBounds(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    private void ensureCapacity() {
        ensureCapacity(size + 1);
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            grow(minCapacity);
        }
    }

    private void grow(int minCapacity) {
        int oldCapacity = elements.length;
        int newCapacity = Math.max(oldCapacity * 2, minCapacity);
        elements = Arrays.copyOf(elements, newCapacity);
    }


    private void shiftLeft(int startIndex) {
        System.arraycopy(elements, startIndex + 1, elements, startIndex, size - startIndex - 1);
    }

    @Override
    public String toString() {
        return "ru.aston.hometask.dzoneone.CustomArrayList{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                '}';
    }
}
