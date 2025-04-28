📁 Projeto: Contagem de Dígitos Específicos (Recursivo)

📌 Descrição: >
  Aplicação em Java que recebe dois números inteiros:
  - Um número principal entre 10 e 999999
  - Um número entre 0 e 9
  A função recursiva calcula quantas vezes o segundo número aparece no primeiro.

🗂️ Estrutura de Arquivos:

📄 src/controller/Qtdnumerosegundo.java:
  - Contém a função recursiva responsável por contar a quantidade de vezes que o segundo número aparece no primeiro.

📄 src/viewer/Principal.java:
  - Responsável pela interação com o usuário (entrada via JOptionPane) e exibição do resultado.

🧠 Lógica da Recursividade:

método: qtdN2(int n1, int n2)
explicação:
  - ✋ Condição de parada: Quando `n1 == 0`, significa que todos os dígitos foram verificados e a função retorna 0.
  - 🔁 Relação recursiva: Verifica se o último dígito (`n1 % 10`) é igual a `n2`, soma 1 se for, e chama recursivamente `qtdN2(n1/10, n2)` para o restante dos dígitos.

💬 Exemplos de Execução:

entrada:
  - Primeiro número: 523578
  - Segundo número: 5
saída:
  - A quantidade de vezes que o número 5 aparece em 523578 é: 2

entrada:
  - Primeiro número: 836363
  - Segundo número: 3
saída:
  - A quantidade de vezes que o número 3 aparece em 836363 é: 3

📥 Entrada:

- O usuário insere dois números via JOptionPane:
  - Primeiro número: um inteiro de 10 a 999999
  - Segundo número: um inteiro de 0 a 9
- A entrada é validada na `main` (não na função recursiva).

📤 Saída:

- Exibe, via JOptionPane, quantas vezes o segundo número aparece no primeiro.

📌 Observações:

- A cada chamada recursiva, o número principal (`n1`) é dividido por 10 para remover o último dígito.
- Verificação direta do último dígito usando módulo (`%`).
- Código modular, limpo e bem comentado para facilitar o entendimento e a manutenção.

👨‍💻 Autor: Criado por Lucas Bezerra de Macedo.
