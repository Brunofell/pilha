package fila;

public class Fila <T> implements Fifo<T> {

    private int top = -1;
    private T[] data;
    private int base = 0;

    public Fila(int size) {
        this.data = (T[]) new Object[size];
    }
    public void add(T item) {
        if (!isFull()) {
            top = move(top + 1);
            data[top] = item;
        } else {
            throw new IllegalStateException("A fila está cheia.");
        }
    }
    public T remove() {
        if (!isEmpty()) {
            T item = data[base];
            data[base] = null;
            base = move(base + 1);
            return item;
        } else {
            return null;
        }
    }
    public void clear() {
        for (int i = 0; i < data.length; i++) {
            data[i] = null;
        }
        top = -1;
        base = 0;
    }
    public boolean isFull() {
        return move(top + 1) == base;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    private int move(int position) {
        return position % data.length;
    }
    public static void main(String[] args) {
        Fila queue = new Fila<>(5);
        queue.add(10);
        queue.add(20);
        queue.add(30);


        System.out.println("Removed: " + queue.remove());
        System.out.println("Removed: " + queue.remove());

        queue.add(40);
        queue.add(50);

        while (!queue.isEmpty()) {
            System.out.println("Removed: " + queue.remove());
        }
    }


}

