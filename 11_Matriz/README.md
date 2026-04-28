## 📦 11. Matrizes

Este módulo marca o aprofundamento em **Estruturas de Dados Multidimensionais**, focando na manipulação de tabelas (linhas e colunas) para resolver problemas complexos, processar dados estatísticos e criar lógicas de jogos interativos.

### 📝 Projetos Neste Módulo:

### 🎮 Jogos e Entretenimento

* #### **`JogoDaVelhaMatriz`** (⭐ Destaque de Lógica)
    * **Descrição**: Implementação completa do clássico Jogo da Velha para dois jogadores.
    * **Destaque Técnico**: Modularização da verificação de vitória em uma classe externa (`verificadorVencedor`), validando horizontal, vertical e diagonais em uma matriz `3x3`.

---

### 🛠️ Manipulação de Dados e Menus

* #### **`MenuMatrizes`**
    * **Descrição**: Painel interativo para visualização seletiva de elementos de uma matriz `4x4`.
    * **Destaque Técnico**: Lógica de filtragem para exibir apenas a **Diagonal Principal**, **Triângulo Superior** ou **Triângulo Inferior**.

* #### **`ValoresMatriz`**
    * **Descrição**: Analisador estatístico que processa uma matriz preenchida automaticamente.
    * **Destaque Técnico**: Cálculos de soma de diagonais, produto de linhas específicas (`long`), busca de maior valor em colunas e média aritmética global.

---

### 🔢 Algoritmos e Estruturas Base

* #### **`matrizIdentidade`**
    * **Descrição**: Gerador automático de Matriz Identidade de ordem 3.
    * **Destaque Técnico**: Uso de condicionais `if (i == j)` dentro de laços aninhados para atribuição binária.

* #### **`matrizPar`**
    * **Descrição**: Scanner de valores pares com destaque visual na exibição da tabela.
    * **Destaque Técnico**: Uso do operador de módulo `%` para identificação e contagem (`totPar`) de elementos.

* #### **`LerMatriz`**
    * **Descrição**: Exercício de fixação para entrada e saída de dados multidimensionais (`3x2`).

---

### 🛠️ Tecnologias e Conceitos Explorados:

* **Matrizes (Arrays 2D)**: Armazenamento e indexação de dados em grades de linhas e colunas.
* **Laços Aninhados**: Uso intensivo de `for` dentro de `for` para varredura completa de estruturas.
* **Classe Random**: Geração de massas de dados aleatórios para testes de algoritmos.
* **Interface de Console**: Formatação avançada com `System.out.printf` e `.repeat()` para criação de menus e tabelas.

---

*Estes exercícios fazem parte da minha jornada de estudos baseada no curso "Java para Iniciantes" do Curso em Vídeo (Prof. Gustavo Guanabara).*
