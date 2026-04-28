# 🛠️ 08. Rotinas: Procedimentos e Passagem de Parâmetros

Este módulo explora a **Modularização** em Java, substituindo grandes blocos de código no `main` por procedimentos (`static void`) reutilizáveis. O foco foi entender como organizar o código em rotinas lógicas, como enviar dados para essas funções e a diferença fundamental entre passar valores ou referências de objetos.

## 📝 Projetos Neste Módulo:

### ⚖️ Evolução: Detecção de Pesos
* **`DetectorDePesadoFeitoPeloGermini`** (⭐ Destaque de Modularização):
    * **Descrição:** Versão otimizada do detector de peso que utiliza um procedimento externo para o cabeçalho.
    * **Destaque Técnico:** Uso do procedimento `Topo(m, p)` para desenhar a interface dinamicamente, recebendo o maior peso e o nome do recordista como parâmetros, evitando repetição de código .
* **`DetectorDePesado`**:
    * **Descrição:** Versão linear original para análise de pesos de 5 pessoas.
    * **Destaque Técnico:** Lógica de comparação simples dentro do `main` e uso de `teclado.nextLine()` para garantir que o buffer do Scanner não pule a leitura dos nomes.

### 🔄 Lógica de Passagem de Dados
* **`PassagemDeParametro`**:
    * **Descrição:** Experimento técnico focado em **Passagem por Referência**.
    * **Destaque Técnico:** Uso de uma classe auxiliar `RefInt` para demonstrar como o Java manipula o endereço de memória de objetos, permitindo que o método altere o valor original das variáveis no `main`.
* **`PassagemDeParametroPorValor`**:
    * **Descrição:** Demonstração do comportamento de **Passagem por Valor** com tipos primitivos (`int`).
    * **Destaque Técnico:** Prova visual de que o método recebe apenas uma cópia do dado, mantendo a integridade das variáveis originais fora do escopo da função.

### 🔢 Utilitários
* **`ParOuImparProcedimentos`**:
    * **Descrição:** Rotina que automatiza a verificação de paridade de um número.
    * **Destaque Técnico:** Encapsulamento da lógica de resto de divisão (`%`) em um procedimento independente, simplificando a chamada no fluxo principal do programa.

## 🛠️ Tecnologias e Conceitos Explorados:

* **Procedimentos (`static void`):** Criação de rotinas que executam tarefas sem retorno de valor.
* **Passagem de Parâmetros:** Diferença prática entre cópia de valor (primitivos) e referência de objeto.
* **Organização de Código:** Redução de complexidade no `main` através da criação de sub-rotinas específicas.
* **Gerenciamento de Buffer:** Técnicas para evitar erros comuns de leitura com `Scanner` em Java.

---
*Estes exercícios fazem parte da minha jornada de estudos baseada no curso "Java para Iniciantes" do Curso em Vídeo (Prof. Gustavo Guanabara).*
