# 🔄 06. Estruturas de Repetição (Parte 4)

Este módulo finaliza o estudo de estruturas de repetição, focando na otimização de algoritmos clássicos e na escrita de "Código Limpo" (Clean Code). O objetivo foi aplicar padrões matemáticos famosos, como a Sequência de Fibonacci, e refatorar códigos antigos para torná-los mais legíveis e eficientes.

## 📝 Projetos Neste Módulo:

* **`SomaDeTodosOsValoresDigitadosCodigoLimpo`** (⭐ Destaque de Refatoração):
    * **Descrição:** Uma versão evoluída do somador de valores, focada em legibilidade.
    * **Destaque Técnico:** Uso da biblioteca `Math` (`Math.max` e `Math.min`) para substituir blocos complexos de `if-else` e inicialização com `Integer.MIN_VALUE` para comparações precisas.

* **`ValorFibonacci`**:
    * **Descrição:** Algoritmo que gera os primeiros 15 termos da famosa Sequência de Fibonacci.
    * **Destaque Técnico:** Implementação de lógica de substituição de variáveis (`n1 = n2; n2 = n3;`) para processamento sequencial.

* **`SomaFatorialQuerContinuarSimOuNao`**:
    * **Descrição:** Calcula o fatorial de múltiplos números em sequência, de acordo com a vontade do usuário.
    * **Destaque Técnico:** Uso de um `do-while` principal com um `while(true)` interno para **validação de resposta**, garantindo que o programa só aceite "S" ou "N".

* **`Tabuada`**:
    * **Descrição:** Gerador de tabuada automática para qualquer número informado.
    * **Destaque Técnico:** Uso de `System.out.printf` para formatação alinhada da saída no console.

* **`UsuarioEscolheAteQueNumeroEleQuer`**:
    * **Descrição:** Um contador customizável onde o usuário define o limite final e o valor do incremento (salto).
    * **Destaque Técnico:** Controle dinâmico de variáveis dentro de um laço `while`.

* **`ValorePares`**:
    * **Descrição:** Exibe uma contagem regressiva apenas com números pares a partir de um valor dado.
    * **Destaque Técnico:** Lógica de ajuste automático (se o número for ímpar, o programa subtrai 1 antes de iniciar) e decremento customizado (`c -= 2`).

## 🛠️ Tecnologias e Conceitos Explorados:

* **Clean Code:** Práticas de simplificação de lógica e nomenclatura de variáveis.
* **Bibliotecas Java:** Uso avançado de `java.lang.Math` e constantes de classe como `Integer.MAX_VALUE`.
* **Algoritmos Matemáticos:** Implementação de progressões e fatoriais.
* **Validação Robusta:** Estruturas de repetição aninhadas para tratamento de erros de entrada do usuário.

---
*Estes exercícios fazem parte da minha jornada de estudos baseada no curso "Java para Iniciantes" do Curso em Vídeo (Prof. Gustavo Guanabara).*
