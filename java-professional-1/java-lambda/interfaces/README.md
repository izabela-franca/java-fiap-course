## Interfaces

* Ao utilizarmos Lambda Expressions é necessário usar uma Functional Interface, porém podemos utilizar um série de interfaces já prontas ao invés de criá-las;

### Consumer
* Recebe um único parâmetro e não retorna nada;
* Estrutura:
  - ![img_7.png](img/img_7.png)
* Exemplo:
  - ![img.png](img/img.png)

### BiConsumer
* Recebe dois parâmetros, de tipos diferentes, e não retorna nada;
* Estrutura:
  - ![img_8.png](img/img_8.png)
* Exemplo:
  - ![img_1.png](img/img_1.png)

### Predicate
* Recebe um parâmetro e retorna um boolean;
* Estrutura:
  - ![img_9.png](img/img_9.png)
* Exemplo: 
  - ![img_2.png](img/img_2.png)

### Function
* Recebe um parâmetro de um tipo e retorna de outro (pode ser o mesmo, ou não);
* Muito utilizada quando precisamos mapear tipos de dados;
* Estrutura:
  - ![img_5.png](img/img_5.png)
* Exemplo:
  - ![img_3.png](img/img_3.png)

### BiFunction
* Recebe dois parâmetros de entrada com um retorno;
* É como se combinassem os dois parâmetros para um retorno único;
* Estrutura: 
  - ![img_6.png](img/img_6.png)
* Exemplo:
  - ![img_10.png](img/img_10.png)

### Supplier
* Apenas retorna algo, por isso possui apenas o método get();
* Funciona como um provedor de informação;
* Estrutura:
  - ![img_12.png](img/img_12.png)
* Exemplo: 
  - ![img_11.png](img/img_11.png)

### Runnable
* Não retorna nada e nem recebe parâmetros;
* Possui apenas o método run();
* Utilizado quando queremos usar uma Lambda Expression sem parâmetros, com o único objetivo de executar um bloco de código;