import fila.Fila;
import pilha.Stack;

public class Main{

    public static void main(String args[]) {

        Stack p = new Stack();
        p.add("Bruno");
        p.add("Thiago ");
        p.add("Helena ");
        p.add("Otávio ");
        p.add(10);

        while (p.isEmpty() == false) {
            System.out.println(p.remove());
        }






    }
}
