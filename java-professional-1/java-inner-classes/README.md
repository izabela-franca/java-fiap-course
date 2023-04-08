# :memo: Inner Classes / Nested Classes

- Quando temos uma classe dentro de outra classes;
- Existem diferentes tipos de Inner Classes: regular(ou nested) inner class, 
static inner (ou nested) class, local (ou method) inner class e anonymous inner class.

### :pushpin: Regular Inner Class

- Útil quando queremos encapsular uma classe;
- Possui acesso aos atributos da outer class (classe na qual ela está inserida);
- Por possuir este acesso, não há necessidade de passar parâmetros;
- Exemplo:

- ![img_3](https://user-images.githubusercontent.com/101933646/230068885-41ddce7f-a3f9-4d2d-8052-b58580d3ded7.png)


- É possível instanciar uma Inner Class fora da sua Outer Class, para isso basta criá-la como pública;
    - Para instância-la primeiro precisamos instanciar a Outer Class, e então: OuterClass.InnerClass innerClass = outterclass.new InnerClass();
    -![img_2](https://user-images.githubusercontent.com/101933646/230068927-6d067194-20b7-4904-88d7-8ebfa6f149c0.png)

### :pushpin: Static Nested Class
- A Outer Class e a Static Class não tem, ou seja, a Static class não utiliza nenhum atributo da Outer Class;
- ![image](https://user-images.githubusercontent.com/101933646/230398442-276af78f-a5c4-40ad-980e-46f524c058c2.png)

### :pushpin: (Method) Local Inner Class 
- É uma classe criada dentro de um método;
- A classe existirá APENAS dentro do método onde foi criada;
- ![image](https://user-images.githubusercontent.com/101933646/230722306-75916793-5139-4e8d-ba47-231def75c28e.png)
- Local Inner Classes conseguem acessar atributos de suas Outer Classes e as variáveis(finais)locais dos métodos onde foram criadas;  

### :pushpin: Anonymous l Inner Class 
- É a base da Programação Funcional do Java (Expressões Lambda e Sream API;
- É uma classe que não tem nome;
- Muito utilizado quando não precisamos da classe, e sim da sua instância;
- ![image](https://user-images.githubusercontent.com/101933646/230723378-02e6d529-cb70-4534-b39d-063abed21ad3.png)
- Não é necessário criar uma classe, precisamos apenas criar a chamada para instanciar a classe anônima;
- Não pode ser instanciada mais de uma vez;
- Além de serem criadas para implementar interfaces, anonymous classes também pode ser criadas para herança;
