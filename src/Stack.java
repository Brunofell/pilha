public class Stack implements Pilhas{

    public Object[] pilha;
    public int top;

    public Stack() {
        this.top = -1;
        this.pilha = new Object[5];
    }

    @Override
    public boolean pilhaVazia() {
        if (this. top == -1) {
            return true;
        }
        return false;
    }

    @Override
    public int tamanho() {
        if (this.pilhaVazia()) {
            return 0;
        }
        return this.top + 1;
    }

    @Override
    public void empilhar(Object valor) {
        // push
        if (this.top < this.pilha.length - 1) {
            this.pilha[++top] = valor;
        }
    }

    public Object desempilhar() {
        //pop
        if (pilhaVazia()) {
            return null;
        }
        return this.pilha[this.top --];
    }





}

