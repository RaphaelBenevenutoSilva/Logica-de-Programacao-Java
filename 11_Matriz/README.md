## 📂 11. Matrizes

Este módulo foca no estudo de **arrays multidimensionais** em Java. Os exercícios exploram desde a leitura básica até a implementação de lógica de jogos e manipulação de diagonais.

---

### 🎮 Lógica de Jogos

#### **JogoDaVelhaMatriz**
* **Descrição**: Implementação completa do clássico Jogo da Velha para dois jogadores (X e O).
* **Destaque Técnico**: Uso de uma matriz 3x3 para o tabuleiro e separação da lógica de validação de vitória em uma classe auxiliar (`verificadorVencedor`), verificando linhas, colunas e diagonais.

---

### 🛠️ Manipulação e Menus Interativos

#### **MenuMatrizes**
* **Descrição**: Sistema interativo que permite escolher diferentes formas de visualizar uma matriz 4x4.
* **Destaque Técnico**: Implementação de filtros para exibir apenas a Diagonal Principal, o Triângulo Superior ou o Triângulo Inferior usando `switch` e `do-while`.

#### **ValoresMatriz**
* **Descrição**: Realiza cálculos estatísticos em uma matriz 4x4 preenchida aleatoriamente.
* **Destaque Técnico**: Cálculo da soma da diagonal principal, produto da segunda linha, maior valor da terceira coluna e média aritmética total.

---

### 🔢 Estruturas Fundamentais

#### **matrizIdentidade**
* **Descrição**: Gera automaticamente uma matriz identidade de ordem 3.
* **Destaque Técnico**: Uso de loops aninhados com a condição `if (i == j)` para atribuir o valor 1 apenas à diagonal principal.

#### **matrizPar**
* **Descrição**: Identifica e destaca visualmente os números pares em uma matriz 3x3.
* **Destaque Técnico**: Uso do operador de resto (`%`) para filtragem e contagem total de ocorrências pares.

#### **LerMatriz**
* **Descrição**: Exercício base para entender a entrada de dados em matrizes.
* **Destaque Técnico**: Captura de valores via `Scanner` para preencher uma matriz 3x2 e exibição formatada.

---

### 🚀 Tecnologias e Conceitos

* **Arrays Multidimensionais**: Manipulação de índices de linhas e colunas.
* **Loops Aninhados**: Uso de `for` dentro de `for` para percorrer as estruturas.
* **Classe Random**: Geração de números aleatórios para testes rápidos.
* **Interface de Console**: Uso de `.repeat()` e `printf` para organizar a saída.

---

*Estes exercícios fazem parte da minha jornada de estudos baseada no curso "Java para Iniciantes" do Curso em Vídeo (Prof. Gustavo Guanabara).*
