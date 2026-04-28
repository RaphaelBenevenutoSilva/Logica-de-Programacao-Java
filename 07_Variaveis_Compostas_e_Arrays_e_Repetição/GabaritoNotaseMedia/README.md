# 📦 07. Variáveis Compostas (Arrays) e Repetição

Este módulo marca a introdução às **Estruturas de Dados**, focando no uso de **Arrays (Vetores)** para gerenciar grandes volumes de informações de forma organizada. O objetivo foi aplicar laços de repetição para percorrer coleções, realizar cálculos estatísticos em massa e criar sistemas mais complexos e modulares.

## 📝 Projetos Neste Módulo:

* **`BbbParedaoProgramaLimpo`** (⭐ Destaque de Engenharia de Software):
    * **Descrição:** Um simulador oficial de votação para o BBB 26, com sistema de pesos entre Voto Único (CPF) e Voto da Torcida.
    * **Destaque Técnico:** Aplicação de **Constantes** (`static final`), **Modularização com Métodos** (somar, calcular percentual, calcular média) e uso de Arrays para armazenar dados de múltiplos participantes simultaneamente.

* **`BbbParedao`**:
    * **Descrição:** A versão inicial do sistema de votação, focada na lógica de cálculo de médias ponderadas (70% para CPF e 30% para Torcida).
    * **Destaque Técnico:** Manipulação de Strings com `.replace(".", "")` para tratar entradas de números grandes formatados e uso de `System.out.printf` para gerar uma tabela de resultados profissional.

* **`GabaritoNotaseMedia`**:
    * **Descrição:** Um sistema de correção automática de provas que cadastra um gabarito oficial e avalia o desempenho de vários alunos.
    * **Destaque Técnico:** Uso de **Arrays de Tipos Diferentes** (`char[]` para gabarito e `double[]` para notas) e laços aninhados para comparar cada resposta dada com a resposta correta.

## 🛠️ Tecnologias e Conceitos Explorados:

* **Arrays Unidimensionais (Vetores):** Criação e manipulação de listas fixas para armazenar nomes, votos e notas.
* **Modularização:** Criação de métodos estáticos para reaproveitamento de código e organização (Clean Code).
* **Lógica de Pesos e Médias:** Implementação de cálculos matemáticos para resultados ponderados.
* **Tratamento de Dados:** Uso de `Long.parseLong` e manipulação de buffer do `Scanner` para garantir a integridade das entradas via console.

---
*Estes exercícios fazem parte da minha jornada de estudos baseada no curso "Java para Iniciantes" do Curso em Vídeo (Prof. Gustavo Guanabara).*
