# 🔄 06. Estruturas de Repetição (Parte 3)

Este módulo consolida o uso de estruturas de repetição em Java, focando em algoritmos de análise de dados, identificação de padrões numéricos e manipulação de coleções dinâmicas. O objetivo foi resolver problemas lógicos que exigem maior controle sobre variáveis de acumulação e comparação.

## 📝 Projetos Neste Módulo:

### 👥 Gerenciamento e Cadastro
* **`ProjetoCadastroComSwitch`** (⭐ Destaque de Backend):
    * **Descrição:** Um sistema de gerenciamento de usuários completo via console.
    * **Destaque Técnico:** Uso de `ArrayList<Usuario>` para armazenamento dinâmico e um menu `switch-case` para operações de Cadastro, Listagem e Busca de usuários por nome.

### 📊 Lógica, Estatística e Filtros
* **`SomaDeTodosOsValoresDigitados`**:
    * **Descrição:** Processa uma sequência de números para entregar a soma total, o maior e o menor valor digitado.
    * **Destaque Técnico:** Inicialização de variáveis de comparação no primeiro ciclo do laço para garantir precisão estatística.
* **`NotasDosAlunosMelhorAproveitamento`**:
    * **Descrição:** Um sistema que lê nomes e notas de uma turma e identifica qual aluno teve o melhor desempenho.
    * **Destaque Técnico:** Lógica de comparação para atualização de variáveis de "maior valor" (`if (nota > maiorNota)`).
* **`NumeroPrimo`**:
    * **Descrição:** Algoritmo que identifica se um número é primo com base na quantidade de divisores encontrados.
    * **Destaque Técnico:** Uso de contador de ocorrências dentro de um laço para validar uma regra matemática específica.
* **`QuantosEntre0e10`** & **`QuantosNumerosSaoNegativos`**:
    * **Descrição:** Scripts focados em filtragem e contagem seletiva de valores dentro de um fluxo de dados.
    * **Destaque Técnico:** Aplicação de condicionais compostas (`&&`) e operadores de resto de divisão (`%`) dentro de laços `for`.

## 🛠️ Tecnologias e Conceitos Explorados:

* **Coleções Dinâmicas:** Introdução ao `ArrayList` para gerenciar dados que não possuem tamanho fixo.
* **Algoritmos de Busca:** Implementação de busca linear ignorando diferenças entre maiúsculas e minúsculas (`equalsIgnoreCase`).
* **Lógica de Comparação:** Técnicas para encontrar extremos (Mínimo/Máximo) em conjuntos de dados.
* **Tipagem de Dados:** Uso de `float` para precisão decimal em notas e `long` para grandes processamentos.

---
*Estes exercícios fazem parte da minha jornada de estudos baseada no curso "Java para Iniciantes" do Curso em Vídeo (Prof. Gustavo Guanabara).*
