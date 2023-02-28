# Collections
___

### INTRODUÇÃO

Mentor: Camila Cavalcante

Objetivos do curso: Compreender o que é o Collection Framework e a aplicabilidade de suas principais interfaces:
List, Set e Map. Além de aprender sobre Stream API e como ela pode ajudar na manipulação de collections. 

* Percurso:
    * Aula 1: Coleções com iterações ordenadas:List
    * Aula 2: Coleções com Singularidade: Set
    * Aula 3: Coleções de Pares: Map
    * Aula 4: Stream API

* Visão geral: Collections Framework
  * O que são e por que usamos Collections Framework?
  *  Composição
  * Hierarquia
  <br><br>
* Definição:
  * Collection é um obejto que agrupa múltiplos elementos (variáveis primitivas ou objetos) dento de uma única unidade.
  * Serve para armazenar e processar conjuntos de dados de forma eficiente.
    <br><br>
* Composição:
  * Interfaces: è um contrato que quandso assumido por uma classe deve ser implementado. 
  * Implementação ou Classes: são as materializações, a codificação das interfaces. 
  * Algoritmos: é uma sequencia lógica, finita e definida de instruções que devem ser seguidas para resolver um problema. 
<br><br>
  * Hierarquia Collections:
![img_2.png](img_2.png)

##### AULA 1 - LISTS


* java.util.list - pacote
* Características: permite elementos duplicados e garante ordem de inserção. 
<br><br>

* Implementações:
	* Implementação Vector: utilizada quando precisamos de Threads
	* Implementação ArrayList: implementa apenas a interface List.
	* Implementação LinkedList: Implementa tanto  a interface List quanto a Queue.
<br><br>
	
* ArrayList x LinkedList : ArrayList deve ser usado onde mais operações de pesquisa são necessárias e LinkedList deve ser usado onde mais operações de inserção e exclusão são necessárias. <br>
OBS.: Em caso de dúvida, utilize o ArrayList. 
	
<br><br>
* Formas de iniciar um List:

~~~java
// Criação de List
List 
~~~
  


  
