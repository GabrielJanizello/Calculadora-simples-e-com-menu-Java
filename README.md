# Projeto Calculadora Java — Início do Aprendizado

Este repositório contém dois projetos iniciais de **calculadora em Java**, desenvolvidos como primeiros passos no aprendizado da linguagem. A ideia é evoluir este projeto simples ao longo do tempo, incorporando funcionalidades mais complexas, como um programa de **gerenciamento de despesas**, que permita registrar, listar e calcular gastos.

---

## 📌 Estrutura do Projeto

O projeto contém duas versões da calculadora:

1. **Calculadora Simples**
2. **Calculadora com Menu**

### 1. Calculadora Simples

- **Objetivo:** Permitir operações matemáticas básicas (adição, subtração, multiplicação e divisão) de forma direta.
- **Funcionalidades principais:**
  - Leitura de números do usuário usando `Scanner`.
  - Realização de operações básicas (`+`, `-`, `*`, `/`) com validação de divisão por zero.
  - Tratamento de erros de entrada usando `InputMismatchException`.
  - Loop contínuo até que o usuário digite `"sair"`.

**Trecho de aprendizado técnico:**
- Uso de **loops `while`** para repetição até condição de saída.
- Uso de **`switch-case`** moderno com `->` para selecionar operações.
- Tratamento de exceções com `try-catch` para evitar que entradas inválidas quebrem o programa.
- Comparação de strings com `equalsIgnoreCase` para permitir entradas flexíveis ("Sair", "SAIR", "sair").

---

### 2. Calculadora com Menu

- **Objetivo:** Estruturar melhor o programa, separando funcionalidades e oferecendo um menu interativo.
- **Funcionalidades principais:**
  - Menu que lista opções de operação (somar, subtrair, multiplicar, dividir e sair).
  - Leitura de duas entradas numéricas do usuário por operação.
  - Métodos separados para cada operação matemática (`somar`, `subtrair`, `multiplicar`, `dividir`).
  - Loop principal até o usuário escolher sair (`opcao == 5`).
  - Tratamento de exceção para entradas inválidas.
  - Mensagem clara para divisão por zero.

**Trecho de aprendizado técnico:**
- Criação de **métodos separados** para modularizar o código, facilitando manutenção e reuso.
- Uso de **`switch-case`** para controlar fluxo baseado em opções do usuário.
- Estruturação de código **orientado a procedimentos**, preparando para futuros conceitos de programação orientada a objetos.
- Uso de **docstrings e comentários** para explicar cada parte do código.

---

## 📚 O que foi aprendido

Durante o desenvolvimento destas primeiras calculadoras, os principais conceitos praticados foram:

1. **Entrada e saída de dados**
   - Uso da classe `Scanner` para capturar dados do usuário.
   - Validação e tratamento de entradas incorretas.
2. **Estruturas de controle**
   - Loops (`while`) para repetição de operações.
   - Condições (`if`, `switch-case`) para lógica de operações.
3. **Tratamento de exceções**
   - Evitar erros em tempo de execução com `try-catch`.
   - Garantir que o programa continue rodando mesmo após entradas inválidas.
4. **Modularização**
   - Separação de funções em métodos específicos para operações matemáticas.
   - Estruturação clara do fluxo de execução.
5. **Boas práticas**
   - Fechar o `Scanner` no final do programa.
   - Uso de mensagens claras e instruções amigáveis para o usuário.

---

## 🔜 Próximos passos

O projeto será expandido para se tornar um **programa completo de registro e controle de despesas**, permitindo:

- Inserir novas despesas.
- Listar despesas por categoria ou data.
- Calcular totais e gerar relatórios simples.
- Explorar conceitos de **POO (Programação Orientada a Objetos)** e persistência de dados.

---

