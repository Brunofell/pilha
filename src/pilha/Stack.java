package pilha;

public class Stack<T> implements Pilhas<T> {

    private T[] pilha;
    private int top;


    public Stack() {
        this.top = -1;
        this.pilha = (T[]) new Object[5];
    }

    @Override
    public boolean isEmpty() {
        if (this. top == -1) {
            return true;
        }
        return false;

    }
    @Override
    public void add(T valor) {
        if (this.top < this.pilha.length - 1) {
            this.pilha[++top] = valor;
        }
    }
    public T remove() {
        if (isEmpty()) {
            return null;
        }
        return this.pilha[this.top --];
    }

    @Override
    public boolean isFull() {
        if (this. top != -1) {
            return true;
        }
        return false;
    }

    public void clear(Stack p){
        while (!isEmpty()){
            System.out.println(p.remove());
        }
    }


    public static void main(String[] args) {
        Stack p = new Stack();
        p.add("Bruno");
        p.add("Thiago ");
        p.add("Helena ");
        p.add("Otávio ");
        p.add(10);

        p.isEmpty();
        p.clear(p);
        System.out.println();

        p.add("elio");
        p.add(",arid");
        p.add("Helena ");
        p.add("Otávio ");
        p.add(10);
        p.clear(p);


    }
}
