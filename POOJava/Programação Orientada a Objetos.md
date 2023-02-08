# Programação Orientada a Objetos
___

* Introdução:

Mentor: Thiago Leite e Carvalho

Objetivos do curso: Compreender todos os conceitos relativos à orientação a Objetos (OO);
Baseado no livro de mesmo título escrito pelo mentor. 

* Percurso:
  * Aula 1: Por que usar? 
  * Aula 2: Fundamentos 
  * Aula 3: A estrutura 
  * Aula 4: As relações 
  * Aula 5: A Organização 
  * Aula 6: Próximos passos

---
  
### AULA 1 - Por que usar?



* Paradigma Estruturado x Paradigma Orientado à Objetos

| Paradigma Estruturado               | Paradigma Orientado à Objetos                             |
|-------------------------------------|-----------------------------------------------------------|
| Representação mais simplista        | Representação mais realista                               |
| Linguagem C                         | Linguagem Java                                            |
| Foco em operações (funções) e dados | Foca na modelagem de entidades e na interação entre estas |
| Manipulação de dados brutos         | Maior abstração que nas linguagens estruturadas           |
| Foco em "como fazer"                | Foco no "o que fazer"                                     |

* Vantagens da POO:
  * Melhor coesão: unidades de códigos com responsabilidades específicas 
  * Melhor acoplamento: bons acompamentos são flexíveis em POO. 
  * Diminuição do Gap semântico: diminuição da diferença de representação entre o mundo real e do mundo computacional. 
  * Coletor de lixo: as linguagens orientadas a objetos possuem mecanismos que vão limpando objetos que não são </br>
utilizadas para liberar a memória do computador. 


![img.png](img.png)

---
### AULA 2 - FUNDAMENTOS

* Definição de Orientação a Objetos: </br>
Análise, projeto e programação baseados na composição e interação entre diversas unidades de software chamadas de objetos.

* Pilares:
  * Abstração: capacidade de pensar nas características mais essenciais e deixar de lado as caracteristicas mais específicas. 
Processo pelo qual se isolam as características mais comuns de um grupo de objetos. </br> 
    * Por exemplo: Cadeira possui encosto, assento e pernas.
Podemos ter diversos tipos de cadeira a partir dessa abstração: cadeira de praia, cadeira de sala de aula, possuem as </br>
caracteristicas comuns do grupo e algumas específicas. 
  * Reuso: capacidade de criar novas unidades de código a partir de outras já existentes.
  * Encapsulamento: Capacidade de esconder complexidades e proteger dados (evitar acessos indevidos).

**EXERCÍCIO:** <br>
Levando em consideração uma loja online de livros, modele uma entidade livro. </br>
Livro: Quantidade de páginas, tema, edição, assunto, titulo, sub-titulo,  autor, ano de publicação, editora, ISBN. </br>
Livro (Essencial): Quantidade de páginas, ISBN, assunto, título, autor e editora.  
Livro (Editora): Quantidade de páginas, tipo de papel, tipo de capa, peso, acabamento, coloração, gramatura, ISBN, sub-título.</br>
Obs. A necessidade da modelagem influencia na caracterização da entidade. </br>
É importante pensar no que é necessário para a aplicação a ser desenvolvida. 

---
### AULA 3 - ESTRUTURA BÁSICA DA OO
* A estrutura básica é composta por:
  * Classe
  * Atributo
  * Método
  * Objeto 
  * Mensagem 
<br></br>

* **CLASSE (Molde, base):**
  * Unidade mínima, básica da implementação do paradigma da programação orientada a objetos.
  * Abstrai um conjunto de objetos com características similares. 
  * Define o comportamento de seus objetos através de métodos e s esrados possíveis destes objetos através de atributos
  * Descreve os serviços providos por seus objetos e quais informações eles podem armazenar </br>
  <br>
  * Dicas (Como identificar):  
    * Substantivo
    * Nome significativos
    * Contexto deve ser considerado
    <br> <br>
  * Códigos:
    <br> 
~~~java
// JAVA - Exemplo de classe
class Carro {

}
~~~
~~~ C#
// C# - Exemplo de classe
class Carro {

}
~~~

~~~ Python
// Python - Exemplo de classe
class Carro :
  pass
~~~
 * **ATRIBUTOS**:
   * Elemento de uma classe
   * Define a estrutura de dados da classe
   * Representa suas características e faz parte dos objetos criados a partir da classe 
   
   <br>
   Observação - Atributo (Classe - próprio e peculiar a alguém ou a alguma coisa) x Variável (Método - sujeito a variações)
   
   <br> <br>
   
   * Dicas:
     * Substantivos e adjetivos (caracterização)
     * Nome significativos
     * Contexto deve ser considerado
     * Abstração
     * Tipo de dado adequado
       <br> <br>
   * Códigos:
     <br>
~~~java
// JAVA - Exemplo de classe com atributo
class Carro {
    int portas;
}
~~~
~~~ C#
// C# - Exemplo de classe
class Carro {
  int portas;
}
~~~

~~~ Python
// Python - Exemplo de classe
class Carro :
  portas = 0
~~~
* EXERCÍCIO:
  <br>
~~~java
// JAVA - Exemplo de classe com atributo
class Carro {
    int portas;
    int capacidadeTanque;
    String cor;
    String modelo;
}
~~~

* **MÉTODO**:
  * Porção de código (sub-rotina) disponibilizada pela classe
  * Executado quando se é feita uma requisição a ele
  * Identifica quais serviços, ações, que a classe oferece. 
  * Define e realiza um determinado comportamento
   <br> <br>
  * Criação:
    * Java e C#:
      * Visibilidade
      * Retorno
      * Nome
      * Parâmetros
        <br> <br>
    * Phyton:
      * def
      * Nome
      * Parâmetros
        <br> <br>
  * Dicas:
    * Verbos (ações)
    * Nome significativos
    * Contexto deve ser considerado
      <br> <br>
  * Códigos:
    <br>
~~~java
// JAVA - Exemplo de classe com atributo
class Carro {
    void frear (){
      ...
    }
}
~~~
~~~ C#
// C# - Exemplo de classe
class Carro {
    void frear (){
        ...
    }
}
~~~

~~~ Python
// Python - Exemplo de classe
class Carro :
  def frear ()
~~~

* MÉTODOS ESPECIAIS:
  * Construtor: Cria objetos a partir da classe e providenciar valores iniciais, parâmetros. 
      <br>
~~~java
// JAVA - Exemplo de classe com construtor
class Carro {
    Carro (){
      ...
    }
}
~~~
~~~ C#
// C# - Exemplo de classe com construtor
class Carro {
    Carro (){
        ...
    }
}
~~~
~~~ Python
// Python - Exemplo de classe com construtor
class Carro :
  def __init__(self):
  ...
~~~
* Destrutor: Auxilia na destruição de um método. Utilizado para liberar possiveis recursos que não estão sendo utilizados.
  <br>
~~~java
// JAVA - Exemplo de classe com destrutor
class Carro {
    void finalize (){
      ...
    }
}
~~~
~~~ C#
// C# - Exemplo de classe com destrutor
class Carro {
    ~Carro (){
        ...
    }
}
~~~
~~~ Python
// Python - Exemplo de classe com destrutor
class Carro :
  def __del__(self):
  ...
~~~
* Sobrecarga: Mudar a assinauda de acordo com a necessidade. 
  - Assinatura: nome + parâmetros
  - Ajuda a manter a bastração alvo mudando apenas os parâmetros (representar comportamentos diferentes)
    <br>
~~~java
// JAVA - Exemplo de métodos e sobrecargas
m1 ()
m1 (int i)
m1 (float f)
m1 (String s, long l)
~~~
~~~ C#
// C# - Exemplo de métodos e sobrecargas
M1 ()
M1 (int i)
M1 (float f)
M1 (String s, long l)
~~~


* EXERCÍCIO:
  <br>

~~~java
// JAVA - Exemplo de classe com atributos, gets e sets e métodos.
class Carro {
  // Atributos
  int capacidadeTanque;
  String cor;
  String modelo;
  // Construtores
  Carro () {
      // cria apenas o objeto carro
  }
  Carro (String cor, string modelo, int capacidadeTanque) {
      this.cor = cor;
      this.modelo = modelo;
      this.capacidadeTanque = capacidadeTanque;
  }
  // Gets e Sets
  void setCor(String cor) {
    this.cor = cor;
  }

  String getCor() {
    return cor;
  }

  void setModelo(String modelo) {
    this.modelo = modelo;
  }

  String getModelo() {
    return modelo;
  }

  void setCapacidadeTanque(int capacidadeTanque) {
    this.capacidadeTanque = capacidadeTanque;
  }

  int getCapacidadeTanque() {
    return capacidadeTanque;
  }
  // Métodos
  double valorTotalTanque (double valorCombustivel) {
      return capacidadeTanque * valorCombustivel;
  }
}
~~~

* **OBJETO**:
  * Representação de um conceito/entidade do mundo real
  * Executa os métodos, armazenam os valores
  * Instancia das classes (estáticas)
<br> <br>
  * Criação:
~~~java
// JAVA - Criação de objeto
Carro carro = new Carro();
~~~
~~~ C#
// C# - Criação de objeto
Carro carro = new Carro ();
}
~~~
~~~ Python
// Python - Criação de objeto
carro = Carro ()
~~~  
* **MENSAGEM**:
  * Processo de ativação de um método de um objeto
  * Requisição (chamada) do método para execução
  * Pode ser direcionada diretamente à classe caso a requisição seja a um método estático
    <br> <br>
  * * Criação:
~~~java
// JAVA - Criação de mensagem
Carro carro = new Carro ();
carro.<método>; // mensagem para o objeto

Carro.<método; // mensagem para a classe
~~~
~~~ C#
// C# - Criação de mensagem
Carro carro = new Carro ();
carro.<método>; 

Carro.<método; 
}
~~~
~~~ Python
// Python - Criação de mensagem
carro = Carro ()
carro.<método>

Carro.<método>
~~~  

* Conceitos a serem explorados:
  - Instância x Estático: atributos e métodos
  - Estado de um Objeto
  - Identidade de um Objeto
  - Representação numérica de um Objeto
  - Representação padrão de um objeto
<br><br>

* EXERCÍCIO:
  <br>
  - Criar objetos da classe "Carro" utilizando métodos set/get para definir os valores dos atributos, exibir esses <br> 
valores "get" e passar uma mensagem para o cáculo total para encher o tanque.<br>
  - Resolução nos arquivos: "Aplicacao.java" e "Carro.java".

