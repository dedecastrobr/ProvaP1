#Prova P1

A aplicação simula um cadastro de veículos e clientes de uma loja. Possui uma classe principal e outras auxiliares que implementam os modelos seguindo os conceitos vistos em aula. 

Caso necessário, modifique o código de acordo com seus conhecimentos para solucionar as questões e **RESPONDA TODAS**, no espaço indicado após cada uma delas. A resposta deve conter um embasamento, descrevendo as modificações e demonstrando seu domínio técnico sobre o assunto. Se preferir, podes fazer referências ao código, mas a idéia é descrever textualmente a solução proposta.


>Questões sem justificativa serão consideradas nulas.

Para responder, basta alterar esse arquivo (**Prova.md**) e adicionar suas contribuições. A sintaxe "MarkDown" é bastante intuitiva e esse arquivo pode ser aberto e editado no Eclipse.


##Questão 01 (3 pontos)

Observe o modelo de classes (MyCar, Cliente, Veiculo, Moto, Carro e Menu) e responda às seguintes questões:

* Como as classes se relacionam entre si?


* Qual a semelhança das classes Carro e Moto?

* Qual o papel da classe Veículo?


* Como é possível o Menu ser utilizado pela classe principal se estão em pacotes diferentes?



### Resposta

Todas estão na package p1.prova.main;

Ambas extendem a classe Veículo, recebem os dados da classe Veiculo("Pai"). Dentro dos construtores das classes Carro e Moto é utilizado o comando Super para receber os construtores da classe Veiculo.

A classe Veiculo tem um construtor que recebe as informações de Renavam, placa e tipo do veiculo.

Pois estão no mesmo projeto.

___________

##Questão 02 (2 pontos)


Implemente o cadastro de veículos. O usuário deve selecionar se pretende cadastrar um **Moto** ou um **Carro** e informar os dados pertinentes a cada tipo de veículo.


### Resposta

Foi criado o método cadastraVeiculo que cria um novo Menu para cadastrar cada tipo de veiculo, onde no switch case, caso o usuário digite 1, cairá na criação de carro, e caso digite 2, na de motos.

__________

##Questão 03 (1 ponto)


Implemente a listagem de clientes. Considere criar um método na classe Cliente para mostrar os dados.


### Resposta

Foram criados 2 métodos, o listaClientes no MyCar.java,onde o for serve para repetir os comandos de acordo com a quantidade de clientes, que possui um contador para informar o número do cliente e chama o método mostraDados da classe Cliente, o qual imprime na tela as informações do cliente.

__________

##Questão 04 (2 pontos)


Implemente a busca de veículos. O sistema deve perguntar para o usuário a placa e buscar na lista de veículos. Caso nenhum veículo seja encontrado uma mensagem deve ser exibida.


### Resposta

O buscaCarros e o buscaMotos utilizam o scan para pegar a informação do teclado e procuram o indice(index) do veiculo.

__________

##Questão 05 (2 pontos)


A aplicação tem uma opção "Gerar Dados" no menu principal que tem por objetivo criar dados de teste para facilitar o desenvolvimento, sem ter que ficar cadastrando a cada vez que se entra no sistema. Considerando essa funcionalidade resolva: 


* Altere o método para gerar Cliente e Motos também;

* Qual a diferença na chamada dos construtores de Cliente, Moto e Carro para esse método e os acessados via Menu do sistema?

* Implemente uma contagem dos objetos gerados e informe ao usuário quantos de cada foram gerados;



### Resposta

Foi criado o cliente Cliente "Gabriel",902139123,21312412 e a Moto "123ABC","23141231","M"

Esse método possui os parâmetros pré definidos, quando criados pelo menu do sistema o construtor é vazio, e damos as informações do telcado.



##Boa prova!