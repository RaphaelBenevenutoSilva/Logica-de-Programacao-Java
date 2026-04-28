# ⚖️ 05. Estruturas Condicionais

Este diretório reúne projetos focados na tomada de decisão em Java. Aqui explorei desde condições simples e compostas até estruturas de seleção múltipla, tratamento de exceções e o uso moderno do `switch expression`.

## 📝 Projetos Neste Módulo:

### 🏥 Biometria e Cálculo de Indicadores

* `CalculoIMC`
    * **Descrição:** Calcula o Índice de Massa Corporal e classifica a situação do usuário (Peso ideal, Obesidade, etc.).
    * **Destaque Técnico:** Uso de `if-else if` encadeado para múltiplas faixas de valores e `Math.pow` para cálculos de potência.

* `MaiorIdade`
    * **Descrição:** Verifica se o usuário já atingiu a maioridade com base no ano atual e de nascimento.
    * **Destaque Técnico:** Lógica de comparação simples para fluxos de decisão binários.

### 💳 Gestão de Benefícios e Regras de Negócio

* `NovoSalario`
    * **Descrição:** Calcula o aumento salarial de um funcionário com base no número de dependentes.
    * **Destaque Técnico:** Implementação do **Switch Expression** (Java moderno), permitindo atribuir o resultado da condição diretamente a uma variável.

* `ProdutoPromocao`
    * **Descrição:** Simulador de venda de camisas de time com aplicação de descontos condicionais sobre o preço de vitrine.
    * **Destaque Técnico:** Uso de **Try-Catch** para tratamento de exceções e `yield` dentro do switch para retorno de valores em blocos complexos.

### 🤝 Sistemas de Arrecadação e Gestão Acadêmica

* `OpcaoCriancaEsperanca` & `OpcaoCriancaEsperancaUsandoSwitch`
    * **Descrição:** Interface de menu para seleção de valores de doação, comparando performance e legibilidade entre `if-else` e `switch`.
    * **Destaque Técnico:** Uso de `NumberFormat` para exibir valores no padrão monetário brasileiro (R$).

* `NotaAluno`
    * **Descrição:** Algoritmo de verificação de desempenho acadêmico para definição de status de aprovação.
    * **Destaque Técnico:** Uso de operadores lógicos (`&&`) para definir intervalos de aprovação.

### 🧮 Lógica Computacional e Testes de Mesa

* `ParImpar`
    * **Descrição:** Identifica se um número inteiro qualquer é par ou ímpar.
    * **Destaque Técnico:** Aplicação do operador de módulo (`%`) para análise de resto de divisão.

* `Teste`
    * **Descrição:** Exercício focado em funções matemáticas e transposição de lógica de algoritmos para código Java.
    * **Destaque Técnico:** Integração de métodos estáticos (`public static`) para realizar operações matemáticas customizadas.

## 🛠️ Tecnologias e Conceitos Explorados:

* **Switch Expression & Yield:** Controle de fluxo moderno e atribuição direta.
* **Locale & NumberFormat:** Internacionalização de saídas numéricas para moeda (pt-BR).
* **Tratamento de Erros:** Blocos `try-catch` para garantir a robustez contra entradas inválidas no console.
* **Operadores Lógicos:** Construção de condições complexas com `&&` e `||`.

---
*Estes exercícios fazem parte da minha jornada de estudos baseada no curso "Java para Iniciantes" do Curso em Vídeo (Prof. Gustavo Guanabara).*
