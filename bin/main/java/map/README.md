# MAP

<p align="center">
<img src="../../../../assets/image/map-interface-hierarchy.png" alt="Map interface hierarchy Java"><br>
<a href="https://data-flair.training/blogs/collection-framework-in-java/">Hierarchy of Collection Framework in Java </a>
</p>

- A interface `Map` é usada para mapear dados na forma de chaves e valores.
- O `Map` do Java é um objeto que mapeia chaves para valores.
- Um `Map` não pode conter chaves duplicadas: cada chave pode mapear no máximo um valor.
- A plataforma Java possui três implementações gerais de `Map`: `HashMap`, `TreeMap` e `LinkedHashMap`.
- As operações básicas do `Map` são: `put` (inserir ou atualizar), `get` (obter), `containsKey` (verificar se contém uma chave), `containsValue` (verificar se contém um valor), `size` (obter o tamanho) e `isEmpty` (verificar se está vazio).

> ##### *HashTable* é uma implementação antiga da interface Map no Java que é sincronizada e thread-safe, tornando-a adequada para uso em ambientes concorrentes. Ela não permite chaves ou valores nulos e os elementos não são mantidos em uma ordem específica.

> ##### *LinkedHashMap*, por outro lado, é uma implementação da interface Map que preserva a ordem de inserção dos elementos. Cada elemento possui referências ao próximo e ao anterior, formando uma lista encadeada. Isso permite que os elementos sejam iterados na ordem em que foram inseridos. Além disso, o LinkedHashMap também permite chaves ou valores nulos.

> ##### *HashMap* é uma implementação da interface Map que não mantém uma ordem específica dos elementos. Ele armazena os elementos internamente usando uma função de hash para melhorar a eficiência das operações de pesquisa e acesso. O HashMap também permite chaves ou valores nulos.

### Referências:

[1] "Collections in Java Tutorial." DigitalOcean Community. Disponível em: https://www.digitalocean.com/community/tutorials/collections-in-java-tutorial.

[2] "Java™ Platform, Standard Edition 17 API Specification - Class Map." Oracle. Disponível em: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Map.html.

## Fixando os Conhecimentos

Exercícios:

1. Operações Básicas com Map
2. Pesquisa em Map
3. Ordenação nas Map

## Operações Básicas com Map

### 1.  Dicionário

<p>
Crie uma classe chamada "Dicionario" que utilize um Map para armazenar palavras e suas respectivas definições. Implemente os seguintes métodos:

- `adicionarPalavra(String palavra, String definicao)`: Adiciona uma palavra e sua definição ao dicionário, associando a palavra à sua definição correspondente.
- `removerPalavra(String palavra)`: Remove uma palavra do dicionário, dado o termo a ser removido.
- `exibirPalavras()`: Exibe todas as palavras e suas definições do dicionário, mostrando cada palavra seguida de sua respectiva definição.
- `pesquisarPorPalavra(String palavra)`: Pesquisa uma palavra no dicionário e retorna sua definição correspondente.
</p>


## Pesquisa em Map

### 1. Contagem de Palavras

<p>
Crie uma classe chamada "ContagemPalavras" que utilize um Map para armazenar as palavras e a quantidade de vezes que cada palavra aparece em um texto. Implemente os seguintes métodos:

- `adicionarPalavra(String palavra, Integer contagem)`: Adiciona uma palavra à contagem.
- `removerPalavra(String palavra)`: Remove uma palavra da contagem, se estiver presente.
- `exibirContagemPalavras()`: Exibe todas as palavras e suas respectivas contagens.
- `encontrarPalavraMaisFrequente()`: Encontra a palavra mais frequente no texto e retorna a palavra e sua contagem.
</p>

## Ordenação nos Map

### 1. Livraria Online

<p>
Crie uma classe chamada "LivrariaOnline" que representa uma livraria online. Essa classe utiliza um Map para armazenar os livros disponíveis na livraria, utilizando o link da obra na Amazon Marketplace como chave e um objeto da classe "Livro" como valor. A classe "Livro" possui atributos como título, autor e preço. Através da classe "LivrariaOnline", implemente os seguintes métodos:

- `adicionarLivro(String link, String titulo, String autor, private double preco)`: Adiciona um livro à livraria, utilizando o ISBN como chave no Map.
- `removerLivro(String titulo)`: Remove um livro da livraria, dado o titulo do livro.
- `exibirLivrosOrdenadosPorPreco()`: Exibe os livros da livraria em ordem crescente de preço.
- `pesquisarLivrosPorAutor(String autor)`: Retorna uma lista de todos os livros escritos por um determinado autor.
- `obterLivroMaisCaro()`: Retorna o livro mais caro disponível na livraria.
- `exibirLivroMaisBarato()`: Retorna o livro mais barato disponível na livraria.
</p>

