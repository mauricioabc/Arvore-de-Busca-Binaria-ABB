package abb;

public class Main {

    public static void main(String args[]) {
        
        ABB abb = new ABB();
        
        Nodo novoNodo = new Nodo(14);
        abb.insere(abb.getNodoRaiz(), novoNodo);

        novoNodo = new Nodo(4);
        abb.insere(abb.getNodoRaiz(), novoNodo);
        
        novoNodo = new Nodo(1);
        abb.insere(abb.getNodoRaiz(), novoNodo);
        
        novoNodo = new Nodo(9);
        abb.insere(abb.getNodoRaiz(), novoNodo);
        
        novoNodo = new Nodo(15);
        abb.insere(abb.getNodoRaiz(), novoNodo);
        
        System.out.println("ABB: " + abb.toString());
        
        System.out.println("Ordem: ");
        abb.ordem(abb.getNodoRaiz());
        
        System.out.println(" ");
        
        System.out.println("Pre-Ordem: ");
        abb.preordem(abb.getNodoRaiz());
        
        System.out.println(" ");
        
        System.out.println("Pos-Ordem: ");
        abb.posordem(abb.getNodoRaiz());
        
        System.out.println(" ");

        abb.remove(abb.getNodoRaiz(), 4);
        
        System.out.println("ABB: " + abb.toString());
        
        System.out.println("Ordem: ");
        abb.ordem(abb.getNodoRaiz());
        
        System.out.println(" ");
        
    }
}

