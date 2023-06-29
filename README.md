# Supermercado do Zé - Aplicação de Controle de Compras

Bem-vindo ao Supermercado do Zé! Esta é uma aplicação em Java que simula um supermercado, permitindo cadastrar produtos, listar produtos disponíveis, adicionar produtos ao carrinho de compras, visualizar o carrinho e finalizar a compra. Siga as instruções abaixo para utilizar a aplicação corretamente.

## Requisitos do Sistema

- Computador com Java Development Kit (JDK) instalado.
- Ambiente de desenvolvimento Java (por exemplo, Eclipse, IntelliJ IDEA).
- Conhecimentos básicos em programação com Java.

## Como Usar

1. Abra o ambiente de desenvolvimento e crie um novo projeto Java.

2. Crie um pacote chamado `Modelo` e, dentro dele, crie a classe `Produto` com os atributos `nome`, `preco` e `id`. Implemente os métodos necessários para obter e definir os valores dos atributos.

3. Crie uma classe chamada `Utils` para definir um método `doubleToString` que formate um número `double` para uma representação de string.

4. Na classe `Mercado`, implemente a lógica para cadastrar produtos, listar produtos disponíveis, adicionar produtos ao carrinho, visualizar o carrinho e finalizar a compra.

5. No método `main`, crie um menu utilizando a classe `Scanner` para receber a opção escolhida pelo usuário. Implemente a lógica de cada opção no método `menu`. As opções disponíveis são:

   - Opção 1: Cadastrar produtos - solicita ao usuário o nome e preço do produto, cria uma instância de `Produto` e adiciona à lista de produtos.
   - Opção 2: Listar produtos - exibe na tela todos os produtos cadastrados.
   - Opção 3: Comprar produtos - exibe os produtos disponíveis e solicita ao usuário o código do produto desejado. Adiciona o produto ao carrinho de compras.
   - Opção 4: Ver carrinho - exibe os produtos presentes no carrinho de compras.
   - Opção 5: Sair - finaliza a execução do programa.

6. Execute a aplicação e utilize o menu para interagir com o supermercado, cadastrando produtos, comprando, verificando o carrinho e finalizando a compra.

## Contribuição
 Se você identificar algum problema ou desejar contribuir para o projeto, fique à vontade para abrir uma issue ou enviar um pull request no repositório do GitHub.


Esperamos que a aplicação do Supermercado do Zé seja útil para você. Boas compras!
