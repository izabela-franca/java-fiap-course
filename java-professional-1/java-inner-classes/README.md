# Inner Classes / Nested Classes

- Quando temos uma classe dentro de outra classes;
- Existem diferentes tipos de Inner Classes: regular(ou nested) inner class, 
static inner (ou nested) class, local (ou method) inner class e anonymous inner class.

### Regular Inner Class

- Útil quando queremos encapsular uma classe;
- Possui acesso aos atributos da outer class (classe na qual ela está inserida);
- Por possuir este acesso, não há necessidade de passar parâmetros;
- Exemplo:

![img_3.png](img_3.png)

- É possível instanciar uma Inner Class fora da sua Outer Class, para isso basta criá-la como pública;
    - Para instância-la primeiro precisamos instanciar a Outer Class, e então: OuterClass.InnerClass innerClass = outterclass.new InnerClass();
    - ![img_2.png](img_2.png)

  