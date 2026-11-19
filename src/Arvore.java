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
}
