# 🔄 03. Conversores e Unidades

Este módulo foca no desenvolvimento de aplicações simples para converter valores e medidas. O objetivo principal foi praticar a manipulação de diferentes tipos numéricos (`float`, `double`), realizar cálculos de conversão e formatar a saída de dados para o usuário.

### 📋 Projetos Neste Módulo:

* **`ConverterRealEmDolar`**
    * **Descrição:** Lê um valor em Reais e converte para Dólares, usando uma cotação fixa.
    * **Destaque Técnico:** Demonstração de formatação de moeda. Usei `DecimalFormat` e `DecimalFormatSymbols(Locale.US)` para garantir que o resultado final fosse exibido com ponto como separador decimal (padrão americano: `US$0.00`), o que é uma boa prática de localização.

* **`DistanciaEmMetros`**
    * **Descrição:** Lê uma medida em metros e calcula automaticamente as conversões para toda a escala de unidades de comprimento (Km, Hm, Dam, Dm, Cm, MM).
    * **Destaque Técnico:** Manipulação extensiva do tipo `double` e uso detalhado de comentários no código para explicar as relações matemáticas de cada unidade (ex: 1 Km = 1.000 metros). Isso demonstra cuidado com a legibilidade do código.

### 🛠 Tecnologias e Conceitos Explorados:

* **Manipulação de Dados:** Uso de tipos primitivos `float` (para valores monetários simples) e `double` (para maior precisão em distâncias).
* **Formatação de Saída:** Uso avançado de `DecimalFormat` para controle de casas decimais.
* **Localização (Locale):** Configuração do ambiente para formatação padrão dos EUA.
* **Entrada de Dados:** Uso contínuo da classe `Scanner` com tratamento correto dos tipos numéricos (`nextFloat`, `nextDouble`).

---
*Estes exercícios fazem parte da minha jornada de estudos baseada no curso "Java para Iniciantes" do Curso em Vídeo (Prof. Gustavo Guanabara).*
