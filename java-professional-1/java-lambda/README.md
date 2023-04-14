# :memo: Lambda Expressions

- Utilizam o paradigma de programação funcional (focada em funções que podem ser utilizadas como parâmetros e retornadas);
- O conceitos de Lambda Expressions são baseados nas Anonymous Inner Classes;
- Sempre que temos uma Anonymous Inner Class de uma interface que implementa um método (apenas um, ou seja, uma Functional Interface), podemos transformá-la em uma Lambda Expression;
- Estrutura: nome = (parâmetros) -> {corpo};
- ![image](https://user-images.githubusercontent.com/101933646/231168972-13060757-e2a6-44c7-bdee-108e488d6060.png)
- Para simplificar ainda mais podemos:
  - omitir o tipo dos dados (se não houber ambiguidade);
  - remover o return e as chaves, se houver apenas uma linha de código;
  - ![image](https://user-images.githubusercontent.com/101933646/231170957-11d0124e-205a-483d-958e-dc129302b61e.png)
  - ![image](https://user-images.githubusercontent.com/101933646/231171410-3371c353-59bc-4b51-a1fa-7801e95e47bb.png)

- Podemos usar Lambda Expressions como parâmetros:
- ![image](https://user-images.githubusercontent.com/101933646/231768375-2642f589-4c9d-466b-8858-8417406ab676.png)

### :pushpin: Method Reference

- Usado quando a lambda expression tem apenas uma linha de código e na sua execução o parâmetro é usado;
- Oculta-se o parâmetro;
- ![image](https://user-images.githubusercontent.com/101933646/231770406-e42d67d2-bc34-4e68-a933-b1c82b57aaa0.png)
- Também pode ser usado em um construtor:
- ![image](https://user-images.githubusercontent.com/101933646/231772667-ec1066b0-f19a-422d-a620-4ba4ffb5cd4a.png)


### :pushpin: Closures

- Lambda Expression que não depende apenas dos parâmetros que ela recebe, mas também, de uma variável definida fora dela;
- ![image](https://user-images.githubusercontent.com/101933646/232053921-84d992bb-de05-41ae-b581-b3a681aceb19.png)
- Quando uma Lambda Expression usa um atributo e não uma variável local, a mesma pode ser alterada, não é preciso ser final;
