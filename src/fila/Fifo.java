package fila;

public interface Fifo <T> {
    public void add(T data);
    public T remove();
    public void clear();
    public boolean isFull();
    public boolean isEmpty();

}

