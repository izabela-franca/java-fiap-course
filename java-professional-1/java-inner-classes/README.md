# :memo: Inner Classes / Nested Classes

- Quando temos uma classe dentro de outra classes;
- Existem diferentes tipos de Inner Classes: regular(ou nested) inner class, 
static inner (ou nested) class, local (ou method) inner class e anonymous inner class.

### :pushpin: Regular Inner Class

- Útil quando queremos encapsular uma classe;
- Possui acesso aos atributos da outer class (classe na qual ela está inserida);
- Por possuir este acesso, não há necessidade de passar parâmetros;
- Exemplo:

![img_3](https://user-images.githubusercontent.com/101933646/230068885-41ddce7f-a3f9-4d2d-8052-b58580d3ded7.png)


- É possível instanciar uma Inner Class fora da sua Outer Class, para isso basta criá-la como pública;
    - Para instância-la primeiro precisamos instanciar a Outer Class, e então: OuterClass.InnerClass innerClass = outterclass.new InnerClass();
    -![img_2](https://user-images.githubusercontent.com/101933646/230068927-6d067194-20b7-4904-88d7-8ebfa6f149c0.png)

### Static Nested Class
- A Outer Class e a Static Class não tem, ou seja, a Static class não utiliza nenhum atributo da Outer Class;
- ![image](https://user-images.githubusercontent.com/101933646/230398442-276af78f-a5c4-40ad-980e-46f524c058c2.png)

  
