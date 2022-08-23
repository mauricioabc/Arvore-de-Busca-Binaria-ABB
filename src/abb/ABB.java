package abb;

public class ABB {

    private Nodo abb;

    public ABB() {
        this.abb = null;
    }

    public void insere(Nodo raiz, Nodo novoNodo) {

        if (raiz == null) {
            this.abb = novoNodo;
        } else {
            if (novoNodo.getValor() < raiz.getValor()) {
                if (raiz.getFilhoEsquerda() == null) {
                    raiz.setFilhoEsquerda(novoNodo);
                } else {
                    insere(raiz.getFilhoEsquerda(), novoNodo);
                }
            } else {
                if (raiz.getFilhoDireita() == null) {
                    raiz.setFilhoDireita(novoNodo);
                } else {
                    insere(raiz.getFilhoDireita(), novoNodo);
                }
            }
        }
    }

    public Nodo pesquisa(Nodo raiz, int valorBusca) {

        if ((raiz == null) || (raiz.getValor() == valorBusca)) {
            return raiz;
        } else {
            if (valorBusca < raiz.getValor()) {
                return pesquisa(raiz.getFilhoEsquerda(), valorBusca);
            } else {
                return pesquisa(raiz.getFilhoDireita(), valorBusca);
            }
        }

    }

    public void remove(Nodo raiz, int valor){
        // Caso a àrvore não contenha elementos
        if (raiz == null) {
            System.out.println("Erro: Árvore vazia.");
        } else { 
        // Caso 1: Nodo folha
        Nodo pai = null;
            if (raiz.getValor() < valor) {
                if (raiz.getValor() == valor) {
                    pai.setFilhoEsquerda(null);
                } else {
                    if (raiz.getValor() < valor) {
                        pai = raiz;
                        remove(raiz.getFilhoEsquerda(), valor);
                    } else {
                        pai = raiz;
                        remove(raiz.getFilhoDireita(), valor);
                    }
                }
            } else {
                if (raiz.getValor() == valor) {
                    pai.setFilhoEsquerda(null);
                } else {
                    if (raiz.getValor() < valor) {
                        pai = raiz;
                        remove(raiz.getFilhoEsquerda(), valor);
                    } else {
                        pai = raiz;
                        remove(raiz.getFilhoDireita(), valor);
                    }
                }
            }
        
        
//             if (raiz.getFilhoDireita()== null && raiz.getFilhoEsquerda() == null){ 
//                    if(pai.getFilhoDireita() == raiz){
//                        pai.setFilhoDireita(null);               
//                    }
//                    else{
//                        pai.setFilhoEsquerda(null);
//                    }
//             } else {
//                 if (raiz.getValor() < valor) {
//                    remove(raiz.getFilhoEsquerda(), raiz, valor);  
//                 } else {
//                     remove(raiz.getFilhoDireita(), raiz, valor);
//                 }
//                 
//             }
            
        }
    }
    
    public void ordem(Nodo raiz) {
        
        if (raiz != null) {
            ordem(raiz.getFilhoEsquerda());
            System.out.print(raiz.getValor() + " ");
            ordem(raiz.getFilhoDireita());
        }
    }

    public void preordem(Nodo raiz) {
        
        if (raiz != null) {
            System.out.print(raiz.getValor() + " ");
            preordem(raiz.getFilhoEsquerda());
            preordem(raiz.getFilhoDireita());
        }
    }
    
    public void posordem(Nodo raiz) {
        
        if (raiz != null) {
            posordem(raiz.getFilhoEsquerda());
            posordem(raiz.getFilhoDireita());
            System.out.print(raiz.getValor() + " ");
        }
    }
    
    public Nodo getNodoRaiz() {
        return abb;
    }

    @Override
    public String toString() {
        return "ABB{" + "abb=" + abb + '}';
    }
    
    
}

