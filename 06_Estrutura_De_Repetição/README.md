# 🔄 06. Estruturas de Repetição (Parte 1)

Este módulo marca o início dos estudos sobre laços de repetição em Java. Os projetos aqui focam na utilização do laço `for` para processamento de dados, automação de contagens e geração de combinações lógicas.

## 📝 Projetos Neste Módulo:

### 📊 Processamento de Dados e Estatística

* `AnalisadorDeValores`
    * **Descrição:** Recebe 5 números do usuário e gera um relatório estatístico completo.
    * **Lógica de Negócio:** Calcula soma, média, identifica nulos, números divisíveis por 5 e realiza a soma específica de valores pares.
    * **Destaque Técnico:** Uso de `DecimalFormat` para tratar a precisão da média.

* `CadastroSeletorDePessoas`
    * **Descrição:** Um sistema de triagem populacional que filtra perfis específicos (ex: homens maiores de 18 com cabelos castanhos).
    * **Lógica de Negócio:** Utiliza um laço `do-while` para manter o sistema rodando e loops `while(true)` aninhados para validação rigorosa de entrada (sexo e resposta de continuidade).
    * **Destaque Técnico:** Implementação de sanitização de dados com `equalsIgnoreCase`.

### ⏲️ Automação de Fluxo e Contagens

* `ContagemInteligente`
    * **Descrição:** Um contador dinâmico que detecta automaticamente se deve realizar uma contagem crescente ou regressiva.
    * **Destaque Técnico:** Uso da classe `StringJoiner` para formatar a saída de texto com delimitadores, garantindo um visual limpo no console.

* `ContadorDe10a0`
    * **Descrição:** Simulação de um cronômetro regressivo com pausa programada.
    * **Destaque Técnico:** Aplicação de `TimeUnit.SECONDS.sleep(1)` para controle de tempo real, demonstrando o manuseio de `InterruptedException`.

### 🧬 Algoritmos Combinatórios

* `Combinacoes`
    * **Descrição:** Gera pares ordenados de números (Matriz de combinação) utilizando laços aninhados.
    * **Destaque Técnico:** Estudo de **Nested Loops** (laço dentro de laço) e sua execução sequencial cronometrada.

## 🛠️ Tecnologias e Conceitos Explorados:

* **Controle de Fluxo:** Laços `for`, `do-while` e `while` com interrupções controladas (`break`).
* **Validação de Entrada:** Loops infinitos para forçar a entrada correta de dados pelo usuário.
* **Format
