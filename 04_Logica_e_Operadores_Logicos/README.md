# ⚖️ 04. Lógica e Operadores Lógicos

Este módulo marca a transição crucial da aritmética para a **lógica de programação**. O objetivo principal foi entender como o Java avalia expressões, toma decisões e lida com o tipo de dado `boolean` (verdadeiro ou falso). Aqui, explorei os operadores relacionais, lógicos e a precedência entre eles.

### 📋 Projetos Neste Módulo:

* **`FalsoOuVerdadeiro`**
    * **Descrição:** Uma demonstração prática de como o Java avalia expressões comparativas diretamente no console.
    * **Destaque Técnico:** Demonstração da tipagem forte. O projeto mostra que o resultado de comparações (como `a >= 2`) é nativamente um tipo `boolean`. Também implementa a tradução direta de uma expressão de lógica proposicional usando os operadores nativos `!`, `==` e `||` (não, igual, ou).

* **`TiposDeTriangulos` (Avançado)**
    * **Descrição:** Um programa que lê três lados de um triângulo, verifica se eles podem formar um triângulo e, em caso afirmativo, classifica-o como Equilátero ou Escaleno.
    * **Destaque Técnico (Lógica Complexa):** Este projeto é um excelente exercício de aplicação da "Lógica de Programação". Ele resolve um problema geométrico real usando apenas comparações e operadores lógicos (`&&` para E). Destaque para:
        * Implementação da regra geométrica: `(l1 < l2 + l3) && (l2 < l1 + l3) && (l3 < l1 + l2)`.
        * Uso inteligente do **Operador Ternário** `(podeFormar ? "VERDADEIRO" : "FALSO")` para formatar a saída para o usuário de forma elegante, substituindo a necessidade de blocos `if-else` mais complexos neste estágio.

### 🛠 Tecnologias e Conceitos Explorados:

* **Tipo de Dado:** Uso extensivo do tipo primitivo `boolean`.
* **Operadores Relacionais:** `==` (igual), `!=` (diferente), `>=` (maior ou igual), `<` (menor).
* **Operadores Lógicos:** `!` (NÃO/Negação), `||` (OU/Disjunção), `&&` (E/Conjunção).
* **Sintaxe e Açúcar Sintático:** Uso do Operador Ternário (`condition ? true : false`).

---
*Estes exercícios fazem parte da minha jornada de estudos baseada no curso "Java para Iniciantes" do Curso em Vídeo (Prof. Gustavo Guanabara).*
