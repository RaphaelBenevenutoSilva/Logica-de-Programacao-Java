# 🔄 06. Estruturas de Repetição (Parte 2)

Este módulo aprofunda o uso de loops em Java, focando especialmente na estrutura `do-while` e em algoritmos matemáticos mais complexos. O objetivo foi criar interfaces de menu interativas e sistemas que garantem a execução de pelo menos um bloco de código antes da verificação condicional.

## 📝 Projetos Neste Módulo:

* **MenuContador & MenuContadorSwitch:**
    * **Descrição:** Implementação de um menu interativo que permite ao usuário escolher entre contagem crescente (1 a 10) ou decrescente (10 a 1).
    * **Destaque Técnico:** Comparação entre o uso de `if-else` vs `switch-case` dentro de um laço `do-while` para gerenciar as opções do sistema.

* **FatorialDeUmNumero:**
    * **Descrição:** Cálculo matemático de fatorial utilizando um laço `for` decrescente.
    * **Destaque Técnico:** Uso do tipo `long` para a variável de resultado, garantindo suporte a números maiores que o limite do `int`.

* **DesejaContinuarSimOuNao (⭐ Destaque de Validação):**
    * **Descrição:** Um somador de números acumulativo que pergunta ao usuário se ele deseja continuar após cada operação.
    * **Destaque Técnico:** Implementação de um **loop de validação aninhado** que só aceita as entradas "S" ou "N", tratando erros de digitação com `equalsIgnoreCase`.

* **Do1:**
    * **Descrição:** Exemplo fundamental da estrutura `do-while`.
    * **Destaque Técnico:** Demonstração da garantia de execução inicial do bloco de código, independente da condição ser verdadeira ou falsa logo de início.

## 🛠️ Tecnologias e Conceitos Explorados:

* **Estrutura Do-While:** Implementação de fluxos onde o teste da condição é feito após a execução do bloco.
* **Acumuladores e Contadores:** Uso avançado de variáveis para somar valores (`total += numero`) e controlar iterações.
* **Interface de Console:** Criação de menus visuais utilizando `.repeat()` para formatação de divisórias.
* **Robustez de Código:** Uso de loops infinitos controlados por `break` para sanitização de entradas do usuário.

---
*Estes exercícios fazem parte da minha jornada de estudos baseada no curso "Java para Iniciantes" do Curso em Vídeo (Prof. Gustavo Guanabara).*
