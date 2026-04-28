# 🔄 03. Conversores e Unidades

Este módulo é um grande salto no desenvolvimento. Além de conversões aritméticas simples, os projetos aqui exploram o controle de fluxo, a validação robusta de entrada de dados e o uso profissional de internacionalização (`Locale`) e formatação de moedas. O objetivo foi criar aplicações de console que não apenas calculam, mas que também interagem de forma segura com o usuário.

### 📋 Projetos Neste Módulo:

* **`ConverterRealEmDolar`**
    * **Descrição:** Lê um valor em Reais e converte para Dólares com cotação fixa.
    * **Destaque Técnico:** Demonstração de formatação de moeda. Usei `DecimalFormat` e `DecimalFormatSymbols(Locale.US)` para garantir que o resultado final fosse exibido com ponto como separador decimal (padrão americano: `US$0.00`).

* **`DistanciaEmMetros`**
    * **Descrição:** Lê uma medida em metros e calcula automaticamente as conversões para toda a escala (Km, Hm, Dam, Dm, Cm, MM).
    * **Destaque Técnico:** Manipulação extensiva do tipo `double` e comentários detalhados no código para explicar as relações matemáticas de cada unidade.

* **`ValorEmReais`** (⭐ Destaque de Validação)
    * **Descrição:** Um conversor de Real para Dólar que roda exatamente 5 vezes usando um laço `for`.
    * **Destaque Técnico:** Implementação de **validação de entrada robusta**. O código usa `while (!teclado.hasNextDouble())` para verificar se o usuário digitou um número válido antes de prosseguir, descartando entradas inválidas sem quebrar o programa. Também usa `Locale` para configurar o Scanner para ler dados no formato brasileiro.

* **`ValorEmReaisQuantasVezesEuQuero`** (⭐ Destaque de Controle de Fluxo)
    * **Descrição:** Evolução do projeto anterior, onde o usuário define quantas conversões deseja realizar.
    * **Destaque Técnico:** Uso do tipo `double` para maior precisão e demonstração avançada de controle de fluxo. O laço `for` é controlado por uma variável informada pelo usuário (`qv`). Mantém a validação de dados (`hasNextDouble()`) e usa `NumberFormat` para exibir dinamicamente o símbolo da moeda local (`R$`).

### 🛠 Tecnologias e Conceitos Explorados:

* **Controle de Fluxo:** Laços de repetição `for` (com número fixo e dinâmico de iterações).
* **Validação de Dados:** Uso de `teclado.hasNextDouble()` para criar programas à prova de erros de input.
* **Internacionalização (i18n):** Uso das classes `java.util.Locale`, `java.util.Currency` e `java.text.NumberFormat` para lidar com múltiplos formatos de moeda.
* **Manipulação de Tipos:** Uso preciso de `float` e `double`.

---
*Estes exercícios fazem parte da minha jornada de estudos baseada no curso "Java para Iniciantes" do Curso em Vídeo (Prof. Gustavo Guanabara).*
