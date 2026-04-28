# 🔄 06. Estruturas de Repetição

Este módulo marca a transição para algoritmos de alta eficiência. O objetivo foi dominar o controle de iterações utilizando as estruturas `for`, `while` e `do-while`. Os projetos aqui exploram desde contagens simples até o processamento complexo de dados com validações robustas e manipulação de tempo.

## 📝 Projetos Neste Módulo:

* **CadastroSeletorDePessoas (⭐ Destaque de Lógica e Validação)**
    * **Descrição:** Sistema de filtragem demográfica que coleta sexo, idade e cor de cabelo, gerando estatísticas específicas.
    * **Destaque Técnico:** Uso da estrutura `do-while` para garantir a execução inicial e loops internos `while(true)` com `break` para validar entradas de dados de forma rigorosa.

* **AnalisadorDeValores**
    * **Descrição:** Processa uma lista de números para calcular soma, média, valores nulos e somatório de pares.
    * **Destaque Técnico:** Implementação de acumuladores e contadores dentro de um laço `for`, com uso de `DecimalFormat` para precisão da média.

* **ContagemInteligente**
    * **Descrição:** Realiza contagens que se adaptam automaticamente (crescente ou decrescente) com base nos valores de início e fim.
    * **Destaque Técnico:** Uso da classe `StringJoiner` para formatar a saída dos números com vírgulas de forma elegante, demonstrando conhecimento de bibliotecas nativas do Java.

* **ContadorDe10a0**
    * **Descrição:** Uma contagem regressiva clássica de 10 até 0 com intervalo de tempo.
    * **Destaque Técnico:** Implementação da biblioteca `java.util.concurrent.TimeUnit` para criar pausas de 1 segundo entre os números, tornando o código mais legível que o uso de milissegundos puros.

* **Combinacoes**
    * **Descrição:** Gera todas as combinações possíveis entre dois conjuntos de números.
    * **Destaque Técnico:** Domínio de **Laços Aninhados** (um `for` dentro de outro), conceito fundamental para trabalhar com matrizes e algoritmos de busca.

## 🛠️ Tecnologias e Conceitos Explorados:

* **Controle de Iteração:** Domínio prático de `for` (iteração contada), `while` (iteração condicional) e `do-while` (iteração com teste no fim).
* **Robustez e Tempo:** Uso de `try-catch` para lidar com interrupções de thread e a classe `TimeUnit` para controle de execução.
* **Manipulação de Strings:** Formatação avançada de saídas no console usando `StringJoiner` e `printf`.
* **Lógica de Acumulação:** Uso inteligente de variáveis para somar e contar ocorrências dentro de loops.

---
*Estes exercícios fazem parte da minha jornada de estudos baseada no curso "Java para Iniciantes" do Curso em Vídeo (Prof. Gustavo Guanabara).*
