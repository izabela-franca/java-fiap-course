# Lambda Expressions

- Utilizam o paradigma de programação funcional (focada em funções que podem ser utilizadas como parâmetros e retornadas);
- O conceitos de Lambda Expressions são baseados nas Anonymous Inner Classes;
- Sempre que temos uma Anonymous Inner Class de uma interface que implementa um método (apenas um, ou seja, uma Functional interface), podemos transformá-la em uma Lambda Expression;
- Estrutura: nome = (parâmetros) -> {corpo};
- ![img.png](img/img.png)
- Para simplificar ainda mais podemos:
  - omitir o tipo dos dados (se não houber ambiguidade);
  - remover o return e as chaves, se houver apenas uma linha de código;
  - ![img_1.png](img/img_1.png)
  - ![img_2.png](img/img_2.png)

- Podemos usar Lambda Expressions como parâmetros:
- ![img_3.png](img/img_3.png)

### Method Reference

- Usado quando a lambda expression tem apenas uma linha de código e na sua execução o parâmetro é usado;
- Oculta-se o parâmetro;
- ![img_4.png](img/img_4.png)
- Também pode ser usado em um construtor:
- ![img_5.png](img/img_5.png)

### Closures

- Lambda Expression que não depende apenas dos parâmetros que ela recebe, mas também, de uma variável definida fora dela;
- ![img_6.png](img/img_6.png)
- Quando uma Lambda Expression usa um atributo e não uma variável local, a mesma pode ser alterada, não é preciso ser final;

