# ⚖️ 05. Estruturas Condicionais

Este diretório reúne projetos focados na tomada de decisão em Java. Aqui explorei desde condições simples e compostas até estruturas de seleção múltipla e o uso moderno do `switch expression`.

## 📝 Projetos Neste Módulo:

### 🏥 Saúde e Demografia

* **CalculoIMC:**
    * **Descrição:** Calcula o Índice de Massa Corporal e classifica a situação do usuário (Peso ideal, Obesidade, etc.).
    * **Destaque Técnico:** Uso de `if-else if` encadeado para múltiplas faixas de valores e `Math.pow` para cálculos de potência.

* **MaiorIdade:**
    * **Descrição:** Verifica se o usuário já atingiu a maioridade penal com base no ano atual e de nascimento.
    * **Destaque Técnico:** Lógica simples de comparação (`idade >= 18`) para fluxos binários.

### 💰 Finanças e Doações

* **NovoSalario:**
    * **Descrição:** Calcula o aumento salarial de um funcionário com base no número de dependentes.
    * **Destaque Técnico:** Implementação do **Switch Expression** (Java moderno), permitindo atribuir o resultado da condição diretamente a uma variável.

* **OpcaoCriancaEsperanca (e Versão Switch):**
    * **Descrição:** Menu interativo para escolha de valores de doação.
    * **Destaque Técnico:** Comparação prática entre a mesma lógica usando `if-else` vs. `switch-case`, além da formatação de moeda para o padrão brasileiro (`pt-BR`).

* **ProdutoPromocao:**
    * **Descrição:** Simulador de e-commerce de camisas de time com cálculo automático de 5% de desconto.
    * **Destaque Técnico:** Uso de **Try-Catch** para tratamento de exceções, evitando que o programa trave caso o usuário digite um texto em vez de um número.

### 🧮 Lógica e Testes

* **NotaAluno:**
    * **Descrição:** Sistema escolar que define se o aluno foi aprovado, reprovado ou está em recuperação.
    * **Destaque Técnico:** Uso de operadores lógicos (`&&`) para definir intervalos exatos de notas.

* **ParImpar:**
    * **Descrição:** Verifica a paridade de um número inteiro.
    * **Destaque Técnico:** Aplicação do operador de módulo (`%`) para identificação de restos de divisão.

## 🛠️ Tecnologias e Conceitos Explorados:

* **Switch Case & Yield:** Controle de fluxo para seleções múltiplas e blocos de código em switches.
* **Locale & NumberFormat:** Internacionalização (i18n) para exibir valores monetários em Real (R$).
* **Operadores Lógicos:** Uso de
