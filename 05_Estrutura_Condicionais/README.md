# ⚖️ 05. Estruturas Condicionais

Este diretório reúne projetos focados na tomada de decisão em Java. Aqui explorei desde condições simples e compostas até estruturas de seleção múltipla, tratamento de exceções e o uso moderno do `switch expression`.

## 📝 Projetos Neste Módulo:

### 🏥 Saúde e Biometria

* `CalculoIMC`
    * **Descrição:** Calcula o Índice de Massa Corporal e classifica a situação do usuário (Peso ideal, Obesidade, etc.).
    * **Destaque Técnico:** Uso de `if-else if` encadeado para múltiplas faixas de valores e `Math.pow` para cálculos de potência.

* `MaiorIdade`
    * **Descrição:** Verifica se o usuário já atingiu a maioridade com base no ano atual e de nascimento.
    * **Destaque Técnico:** Lógica de comparação simples para fluxos de decisão binários.

### 💰 Finanças e E-commerce

* `NovoSalario`
    * **Descrição:** Calcula o aumento salarial de um funcionário com base no número de dependentes.
    * **Destaque Técnico:** Implementação do **Switch Expression** (Java moderno), permitindo atribuir o resultado da condição diretamente a uma variável.

* `ProdutoPromocao`
    * **Descrição:** Simulador de venda de camisas de time (Real Madrid, Guarani, etc.) com cálculo automático de 5% de desconto.
    * **Destaque Técnico:** Uso de **Try-Catch** para tratamento de exceções e `yield` dentro do switch para retorno de valores em blocos complexos.

### 🎗️ Social e Educação

* `OpcaoCriancaEsperanca` & `OpcaoCriancaEsperancaUsandoSwitch`
    * **Descrição:** Menu interativo para doações, comparando duas formas de implementar a mesma lógica de escolha.
    * **Destaque Técnico:** Uso de `NumberFormat` para exibir valores no padrão monetário brasileiro (R$).

* `NotaAluno`
    * **Descrição:** Sistema escolar que define se o aluno foi aprovado, reprovado ou está em recuperação baseando-se na média.
    * **Destaque Técnico:** Uso de operadores lógicos (`&&`) para definir intervalos de aprovação.

### 🧮 Lógica e Matemática

* `ParImpar`
    * **Descrição:** Identifica se um número inteiro qualquer é par ou ímpar.
    * **Destaque Técnico:** Aplicação do operador de módulo (`%`) para análise de resto de divisão.

* `Teste`
    * **Descrição:** Exercício de tradução de algoritmo que utiliza funções matemáticas e laços de repetição.
    * **Destaque Técnico:** Integração de métodos estáticos (`public static`) para realizar operações matemáticas customizadas.

## 🛠️ Tecnologias e Conceitos Explorados:

* **Switch Expression & Yield:** Controle de fluxo moderno e atribuição direta.
* **Locale & NumberFormat:** Internacionalização de saídas numéricas para moeda (pt-BR).
* **Tratamento de Erros:** Blocos `try-catch` para garantir a robustez contra entradas inválidas no console.
* **Operadores Lógicos:** Construção de condições complexas com `&&` e `||`.

---
*Estes exercícios fazem parte da minha jornada de estudos baseada no curso "Java para Iniciantes" do Curso em Vídeo (Prof. Gustavo Guanabara).*
