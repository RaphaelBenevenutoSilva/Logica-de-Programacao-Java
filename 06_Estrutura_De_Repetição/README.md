# 🔄 06. Estruturas de Repetição (Parte 1)

Este módulo foca na base das estruturas de repetição em Java, explorando principalmente o laço `for` e o uso de acumuladores. O objetivo foi resolver problemas clássicos de lógica, como contagens personalizadas, análise de dados de entrada e combinações de valores.

## 📝 Projetos Neste Módulo:

### 🖥️ Análise e Processamento de Dados

* **AnalisadorDeValores:**
    * **Descrição:** Um sistema que recebe 5 números e entrega um relatório detalhado (Soma, Média, Divisíveis por 5 e Nulos).
    * **Destaque Técnico:** Uso de operadores aritméticos de resto (`%`) para filtragem e `DecimalFormat` para garantir uma saída de média limpa.

* **CadastroSeletorDePessoas:**
    * **Descrição:** Um sistema de triagem que filtra pessoas por sexo, idade e cor de cabelo.
    * **Destaque Técnico:** Implementação de um **loop de validação robusto** para garantir que o usuário só digite "S" ou "N", tratando erros com `equalsIgnoreCase`.

### 🔢 Contagens e Lógica Matemática

* **ContagemInteligente:**
    * **Descrição:** Um contador que identifica se o início é maior que o fim (contagem regressiva) ou menor (contagem crescente) automaticamente.
    * **Destaque Técnico:** Uso de `StringJoiner` para formatar a lista de números separada por vírgulas, evitando aquela vírgula sobrando no final.

* **ContadorDe10a0:**
    * **Descrição:** Exercício clássico de contagem regressiva com pausa.
    * **Destaque Técnico:** Aplicação de `TimeUnit.SECONDS.sleep(1)` para simular o tempo real de um cronômetro.

* **Combinacoes:**
    * **Descrição:** Algoritmo que gera pares de números utilizando laços aninhados.
    * **Destaque Técnico:** Domínio de **Nested Loops** (um `for` dentro de outro) para percorrer múltiplas variáveis simultaneamente.

## 🛠️ Tecnologias e Conceitos Explorados:

* **Estrutura For:** Controle preciso de iterações com inicialização, condição e incremento/decremento.
* **StringJoiner:** Manipulação avançada de strings para saídas formatadas.
* **Tratamento de Exceções:** Uso de `try-catch` para lidar com interrupções de tempo (`InterruptedException`).
* **Acumuladores e Contadores:** Lógica de soma composta (`soma += valor`) e incremento de ocorrências.

---
*Estes exercícios fazem parte da minha jornada de estudos baseada no curso "Java para Iniciantes" do Curso em Vídeo (Prof. Gustavo Guanabara).* tipo assim quero o program assim, só que com os nomes dos programas arrumados
