public class Main{

    public static void main(String args[]) {
        Stack p = new Stack();
        p.empilhar("Dado");
        p.empilhar("Frango com catupiry ");
        p.empilhar("Calabresa ");
        p.empilhar("Quatro queijos ");
        p.empilhar(10);
        while (p.pilhaVazia() == false) {
            System.out.println(p.desempilhar());
        }
    }
}

