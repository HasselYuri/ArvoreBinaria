public class Arvore {

    private No raiz;

    public Arvore() {
        this.raiz = null;
    }

    public void inserir(Integer valor){
        if(valor == null){
            return;
        }
        raiz = inserir(raiz, valor);
    }

    private No inserir(No atual, Integer valor){
        if(atual == null){
            return new No(valor);
        }

        int compara = valor.compareTo(atual.valor);

        if(compara < 0){
            atual.noEsq = inserir(atual.noEsq, valor);
        } else if(compara > 0){
            atual.noDir = inserir(atual.noDir, valor);
        }

        return atual;
    }

    public boolean buscar(Integer valor) {
        if (valor == null) {
            return false;
        }
        return buscar(raiz, valor);
    }

    private boolean buscar(No atual, Integer valor) {
        if (atual == null) {
            return false;
        }
        int cmp = valor.compareTo(atual.valor);
        if (cmp == 0) {
            return true;
        }
        if (cmp < 0) {
            return buscar(atual.noEsq, valor);
        }
        return buscar(atual.noDir, valor);
    }

    public void remover(Integer valor) {
        if (valor == null) {
            return;
        }
        raiz = remover(raiz, valor);
    }

    private No remover(No atual, Integer valor) {
        if (atual == null) {
            return null;
        }

        int cmp = valor.compareTo(atual.valor);
        if (cmp < 0) {
            atual.noEsq = remover(atual.noEsq, valor);
        } else if (cmp > 0) {
            atual.noDir = remover(atual.noDir, valor);
        } else {

            if (atual.noEsq == null && atual.noDir == null) {
                return null;
            }
            if (atual.noEsq == null) {
                return atual.noDir;
            }
            if (atual.noDir == null) {
                return atual.noEsq;
            }
            No sucessor = menor(atual.noDir);
            atual.valor = sucessor.valor;
            atual.noDir = remover(atual.noDir, sucessor.valor);
        }
        return atual;
    }

    private No menor(No atual) {
        if (atual.noEsq == null) {
            return atual;
        }
        return menor(atual.noEsq);
    }

    public void emOrdem() {
        if (raiz == null) {
            System.out.println("(arvore vazia)");
            return;
        }
        emOrdem(raiz);
        System.out.println();
    }

    private void emOrdem(No atual) {
        if (atual == null) {
            return;
        }
        emOrdem(atual.noEsq);
        System.out.print(atual.valor + " ");
        emOrdem(atual.noDir);
    }


}
