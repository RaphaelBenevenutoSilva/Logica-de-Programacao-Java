## 📂 11. Matrizes

Este módulo foca no estudo de arrays multidimensionais (matrizes) em Java. Os exercícios exploram desde a leitura básica e exibição de dados até a implementação de lógica de jogos, manipulação de diagonais e geração de valores aleatórios com a classe `Random`.

### Projetos Neste Módulo:

* **JogoDaVelhaMatriz**: 
    * **Descrição**: Implementação completa do clássico Jogo da Velha para dois jogadores (X e O).
    * **Destaque Técnico**: Uso de uma matriz 3x3 para o tabuleiro e separação da lógica de validação de vitória em uma classe auxiliar (`verificadorVencedor`), verificando linhas, colunas e diagonais.

* **MenuMatrizes**:
    * **Descrição**: Um sistema interativo que permite ao usuário escolher diferentes formas de visualizar uma matriz 4x4.
    * **Destaque Técnico**: Implementação de lógica para filtrar e exibir apenas a Diagonal Principal, o Triângulo Superior ou o Triângulo Inferior usando estruturas `switch` e `do-while`.

* **ValoresMatriz**:
    * **Descrição**: Realiza cálculos estatísticos e matemáticos em uma matriz 4x4 preenchida aleatoriamente.
    * **Destaque Técnico**: Cálculo da soma da diagonal principal, produto de uma linha específica, identificação do maior valor em uma coluna e média aritmética de todos os elementos.

* **MatrizIdentidade**:
    * **Descrição**: Gera automaticamente uma matriz identidade de ordem 3.
    * **Destaque Técnico**: Uso de estruturas de repetição aninhadas com condicional `if (i == j)` para atribuir o valor 1 apenas aos elementos da diagonal principal.

* **MatrizPar**:
    * **Descrição**: Analisa uma matriz 3x3 e identifica quais números são pares, destacando-os visualmente na saída do console.
    * **Destaque Técnico**: Uso do operador de resto (`%`) para identificação de números pares e contagem total de ocorrências.

* **LerMatriz**:
    * **Descrição**: Exercício fundamental para entender a entrada de dados em arrays multidimensionais.
    * **Destaque Técnico**: Captura de valores via teclado (`Scanner`) para preencher uma matriz 3x2 e posterior exibição formatada.

### Tecnologias e Conceitos Explorados:

* **
