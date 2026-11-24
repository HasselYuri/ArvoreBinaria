//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();

        arvore.inserir(50);
        arvore.inserir(30);
        arvore.inserir(70);
        arvore.inserir(20);
        arvore.inserir(40);
        arvore.inserir(60);
        arvore.inserir(80);
        arvore.inserir(10);
        arvore.inserir(45);
        arvore.inserir(75);

        arvore.inserir(40);
        arvore.inserir(null);

        System.out.println("=== Arvore apos as insercoes ===");
        arvore.emOrdem();

        System.out.println();
        System.out.println("=== Buscas ===");
        System.out.println("buscar(60) -> " + arvore.buscar(60));
        System.out.println("buscar(75) -> " + arvore.buscar(75));
        System.out.println("buscar(null) -> " + arvore.buscar(null));

        System.out.println();
        System.out.println("=== Remocao de no folha (10) ===");
        arvore.remover(10);
        arvore.emOrdem();

        System.out.println();
        System.out.println("=== Remocao de no com um filho (40, que tem apenas o filho 45) ===");
        arvore.remover(40);
        arvore.emOrdem();

        System.out.println();
        System.out.println("=== Remocao de no com dois filhos (50, a raiz; sucessor = 60) ===");
        arvore.remover(50);
        arvore.emOrdem();

        System.out.println();
        System.out.println("=== Remocao de valor inexistente (99) e de null ===");
        arvore.remover(99);
        arvore.remover(null);
        arvore.emOrdem();
    }
}