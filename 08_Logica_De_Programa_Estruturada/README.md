# 🛠️ 08. Rotinas: Procedimentos e Passagem de Parâmetros

Este módulo explora a **Modularização** em Java, substituindo grandes blocos de código no `main` por procedimentos (`static void`) reutilizáveis. O foco foi entender como organizar o código em rotinas lógicas, como enviar dados para essas funções e a diferença fundamental entre passar valores ou referências de objetos.

## 📝 Projetos Neste Módulo:

* **`DetectorDePesadoFeitoPeloGermini`** (⭐ Destaque de Modularização):
    * **Descrição:** Um sistema interativo que monitora o maior peso entre 5 pessoas, com interface atualizada em tempo real.
    * **Destaque Técnico:** Uso de um procedimento customizado chamado `Topo(m, p)` para desenhar o cabeçalho dinâmico, recebendo parâmetros para exibir o recordista atual sem repetir código no laço principal.

* **`PassagemDeParametro`**:
    * **Descrição:** Experimento técnico para demonstrar a **Passagem por Referência** em Java usando objetos.
    * **Destaque Técnico:** Uso de uma `static class RefInt` para permitir que as alterações feitas dentro do método `soma` persistam nas variáveis originais do `main`, alterando o estado global do objeto.

* **`ParOuImparProcedimentos`**:
    * **Descrição:** Uma rotina simples que recebe um valor inteiro e imprime diretamente no console se ele é par ou ímpar.
    * **Destaque Técnico:** Implementação de um procedimento que encapsula a lógica aritmética de resto de divisão (`%`), tornando o `main` mais limpo e focado na entrada de dados.

* **`PassagemDeParametroPorValor`**:
    * **Descrição:** Demonstração do comportamento padrão do Java para tipos primitivos.
    * **Destaque Técnico:** Prova de conceito mostrando que, ao passar um `int`, o método recebe apenas uma **cópia** do valor, mantendo as variáveis originais do `main` intactas.

* **`DetectorDePesado`**:
    * **Descrição:** Versão original do detector de peso, implementada de forma linear para comparação de evolução com a versão modularizada.
    * **Destaque Técnico:** Uso de `teclado.nextLine()` para limpeza de buffer após a leitura de números, evitando erros de captura de strings.

## 🛠️ Tecnologias e Conceitos Explorados:

* **Procedimentos (static void):** Criação de rotinas que executam tarefas específicas sem retornar valores.
* **Passagem de Parâmetros:** Diferenciação prática entre passagem por valor (cópia) e por referência (endereço de memória).
* **Escopo de Variáveis:** Gerenciamento de variáveis locais versus variáveis passadas entre métodos.
* **Refatoração:** Transformação de código linear em código estruturado e reutilizável.

---
*Estes exercícios fazem parte da minha jornada de estudos baseada no curso "Java para Iniciantes" do Curso em Vídeo (Prof. Gustavo Guanabara).*
