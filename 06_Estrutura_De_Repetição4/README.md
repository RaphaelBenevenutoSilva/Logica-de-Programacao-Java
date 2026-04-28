# 🔄 06. Estruturas de Repetição (Parte 4)

Este módulo finaliza o estudo de estruturas de repetição, focando na otimização de algoritmos clássicos e na escrita de **"Código Limpo" (Clean Code)**. O objetivo foi aplicar padrões matemáticos famosos e refatorar códigos antigos para torná-los mais legíveis, eficientes e robustos contra erros de entrada.

## 📝 Projetos Neste Módulo:

### 🧮 Algoritmos Matemáticos e Lógica
* **`ValorFibonacci`**:
    * **Descrição:** Algoritmo que gera os primeiros 15 termos da famosa Sequência de Fibonacci.
    * **Destaque Técnico:** Implementação de lógica de substituição de variáveis (`n1 = n2; n2 = n3;`) para manter o processamento sequencial na memória.
* **`SomaFatorialQuerContinuarSimOuNao`**:
    * **Descrição:** Calcula o fatorial de múltiplos números em sequência, de acordo com a vontade do usuário.
    * **Destaque Técnico:** Uso de laços aninhados para **validação de resposta**, garantindo que o programa só avance se o usuário digitar exatamente "S" ou "N".
* **`Tabuada`**:
    * **Descrição:** Gerador de tabuada automática para qualquer número informado pelo usuário.
    * **Destaque Técnico:** Uso de `System.out.printf` para garantir uma saída visualmente alinhada e organizada no console.

### 🧹 Refatoração e Controle Dinâmico
* **`SomaDeTodosOsValoresDigitadosCodigoLimpo`** (⭐ Destaque de Refatoração):
    * **Descrição:** Uma versão evoluída do somador de valores, focada totalmente em legibilidade.
    * **Destaque Técnico:** Substituição de blocos complexos de `if-else` pela biblioteca `Math` (`Math.max` e `Math.min`) e uso de `Integer.MIN_VALUE` para inicialização técnica correta.
* **`ValorePares`**:
    * **Descrição:** Exibe uma contagem regressiva apenas com números pares a partir de um valor dado.
    * **Destaque Técnico:** Lógica de ajuste automático (se o número inserido for ímpar, o sistema subtrai 1 antes de iniciar) e decremento customizado (`c -= 2`).
* **`UsuarioEscolheAteQueNumeroEleQuer`**:
    * **Descrição:** Contador onde o usuário define o limite final e o valor do "salto" (incremento).
    * **Destaque Técnico:** Controle dinâmico de variáveis de iteração dentro de um laço `while`.

## 🛠️ Tecnologias e Conceitos Explorados:

* **Clean Code:** Práticas de simplificação de lógica e melhoria na nomenclatura de variáveis.
* **Bibliotecas Java:** Uso de `java.lang.Math` para otimizar comparações numéricas.
* **Algoritmos Clássicos:** Implementação de Sequência de Fibonacci e Fatorial.
* **Validação Robusta:** Uso de `while(true)` e interrupções de laço para garantir integridade dos dados de entrada.

---
*Estes exercícios fazem parte da minha jornada de estudos baseada no curso "Java para Iniciantes" do Curso em Vídeo (Prof. Gustavo Guanabara).*
