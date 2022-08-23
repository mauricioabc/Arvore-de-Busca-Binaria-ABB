package abb;

public class Nodo {
    private Nodo filhoDireita;
    private Nodo filhoEsquerda;
    private int valor;

    public Nodo(int valor) {
        this.filhoDireita = null;
        this.filhoEsquerda = null;
        this.valor = valor;
    }
    
    public Nodo getFilhoDireita() {
        return filhoDireita;
    }

    public void setFilhoDireita(Nodo filhoDireita) {
        this.filhoDireita = filhoDireita;
    }

    public Nodo getFilhoEsquerda() {
        return filhoEsquerda;
    }

    public void setFilhoEsquerda(Nodo filhoEsquerda) {
        this.filhoEsquerda = filhoEsquerda;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Nodo{" + ", valor=" + valor
                       + ", filhoEsquerda=" + filhoEsquerda + " "
                       + "filhoDireita=" + filhoDireita + "}";
    }

}

