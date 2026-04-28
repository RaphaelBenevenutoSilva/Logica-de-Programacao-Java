# 🔄 03. Conversores e Unidades

Este módulo foca no desenvolvimento de algoritmos para conversão de moedas e medidas. Os projetos exploram a manipulação de tipos numéricos (`float`, `double`), formatação de valores monetários seguindo padrões internacionais (Locale) e o uso de estruturas de repetição para múltiplas operações.

## 📝 Projetos Neste Módulo:

### 💵 Conversão de Moedas

* **`ConverterRealEmDolar`**:
    * **Descrição:** Um conversor simples que transforma valores de Real para Dólar utilizando uma cotação fixa.
    * **Destaque Técnico:** Uso de `DecimalFormatSymbols` para garantir que o formato numérico siga o padrão americano (ponto em vez de vírgula).
* **`ValorEmReais`**:
    * **Descrição:** Sistema que solicita 5 valores em sequência para conversão monetária.
    * **Destaque Técnico:** Implementação de validação de entrada com `hasNextDouble()` para evitar que o programa quebre caso o usuário digite letras.
* **`ValorEmReaisQuantasVezesEuQuero`** (⭐ Destaque de Flexibilidade):
    * **Descrição:** Evolução do conversor onde o usuário define previamente quantas conversões deseja realizar.
    * **Destaque Técnico:** Uso dinâmico de `NumberFormat.getCurrencyInstance()` para exibir automaticamente os símbolos de R$ e US$.

### 📏 Medidas e Distâncias

* **`DistanciaEmMetros`**:
    * **Descrição:** Transforma uma distância lida em metros para todas as outras unidades de medida (Km, Hm, Dam, dm, cm, mm).
    * **Destaque Técnico:** Aplicação de lógica matemática para deslocamento de casas decimais (divisões e multiplicações por potências de 10).

## 🛠️ Tecnologias e Conceitos Explorados:

* **Manipulação de Locale:** Configuração do sistema para interpretar e exibir moedas de diferentes países (`Locale.US` e `pt-BR`).
* **Tratamento de Dados:** Uso de loops `while` combinados com verificadores de tipo para "limpar" o buffer do Scanner e evitar erros.
* **Saída Formatada:** Aplicação de `DecimalFormat` e `printf` para controle total da exibição de casas decimais.
* **Estruturas de Repetição:** Uso do laço `for` para automatizar tarefas repetitivas de cálculo.

---

*Estes exercícios fazem parte da minha jornada de estudos baseada no curso "Java para Iniciantes" do Curso em Vídeo (Prof. Gustavo Guanabara).*
