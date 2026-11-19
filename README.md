# 🌳 Exercício – Árvore Binária de Busca (ABB)

## 📌 Descrição

Este projeto consiste na implementação de uma **Árvore Binária de Busca (ABB)** em Java, capaz de armazenar valores do tipo `Integer` e realizar operações básicas de inserção, busca e remoção.

A implementação utiliza estrutura de nós e métodos recursivos, sem o uso de estruturas prontas da biblioteca Java, como `TreeSet` ou `TreeMap`.

## 🎯 Objetivos

- Implementar uma Árvore Binária de Busca em Java.
- Desenvolver operações recursivas de inserção, busca e remoção.
- Compreender o funcionamento e as propriedades de uma ABB.
- Tratar corretamente os diferentes casos de remoção de nós.

## 📁 Estrutura do projeto

O projeto é composto por exatamente três classes:

| Arquivo | Descrição |
|---|---|
| `No.java` | Representa um nó da árvore, armazenando um valor `Integer` e referências para os filhos esquerdo e direito. |
| `Arvore.java` | Contém a referência para a raiz e implementa as operações da árvore. |
| `Main.java` | Classe principal, responsável por demonstrar o funcionamento da implementação. |

## ⚙️ Funcionalidades

A classe `Arvore.java` implementa os seguintes métodos:

- **`inserir(Integer valor)`**: insere um novo valor na posição correta da árvore. Valores duplicados não são permitidos.
- **`buscar(Integer valor)`**: verifica se determinado valor está presente na árvore, retornando `true` ou `false`.
- **`remover(Integer valor)`**: remove um valor da árvore, caso ele exista.
- **`emOrdem()`**: percorre e imprime os valores da árvore em ordem crescente.

### 🗑️ Casos de remoção

A operação de remoção contempla os três casos possíveis:

1. **Nó folha:** remoção de um nó que não possui filhos.
2. **Nó com um filho:** remoção de um nó que possui apenas um filho, mantendo a ligação com a subárvore existente.
3. **Nó com dois filhos:** substituição do valor do nó pelo seu sucessor (menor valor da subárvore direita) ou antecessor (maior valor da subárvore esquerda), seguida da remoção do nó substituto.

## 🧪 Demonstração (Main.java)

A classe principal demonstra o funcionamento da árvore por meio das seguintes operações:

1. Inserção de pelo menos 10 valores.
2. Impressão dos elementos em ordem crescente.
3. Busca de um valor existente na árvore.
4. Busca de um valor inexistente na árvore.
5. Remoção de um nó folha.
6. Remoção de um nó com apenas um filho.
7. Remoção de um nó com dois filhos.
8. Impressão da árvore após cada operação de remoção.

## 📋 Regras e restrições

- Não são permitidos valores `null`.
- A inserção e a remoção não devem realizar operações quando receberem `null`.
- A busca deve retornar `false` quando receber `null`.
- Valores duplicados não devem ser inseridos.
- Não devem ser utilizadas estruturas prontas de árvores da biblioteca Java.
- As operações da árvore devem ser implementadas de forma recursiva.

## ▶️ Como executar

É necessário ter o **Java JDK** instalado e configurado.

No terminal, dentro da pasta do projeto, execute:

**1. Compilar os arquivos:**

```bash
  javac No.java Arvore.java Main.java
```

**2. Executar o programa:**

```bash 
  java Main
```

## 📚 Tecnologias utilizadas

- Java
- Programação Orientada a Objetos
- Recursividade
- Estrutura de Dados – Árvore Binária de Busca

---

**Atividade:** Exercício Árvores  
**Tema:** Árvore Binária de Busca (ABB)

