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
> [*Através das packages escritas na primeira linha de cada classe.
   *Ambas as classes possuem um construtor que solicita informações do usuário, seta as placas, renavams e tipos dos veículos, lê o que o usuário digitou e mostra os dados após serem digitados.
   *O papel da classe Veículo é criar as variáveis para a placa, renavam e tipo do veículo, e imprimir na tela os dados digitados pelo usuário, depois que este realizar o cadastro do veículo.
   *Através de sua importação com a linha "import p1.prova.tools.Menu;".                                      
   ]
   
### Correção

> Não fez menção aos conceitos de herança que relaciona as classes Veiculo, Moto e Carro. **2.0 pontos**

___________

##Questão 02 (2 pontos)


Implemente o cadastro de veículos. O usuário deve selecionar se pretende cadastrar um **Moto** ou um **Carro** e informar os dados pertinentes a cada tipo de veículo.


### Resposta

> [Suas resposta]

### Correção

> Questão sem resposta. Cadastro não funciona corretamente, aparentemente cria dois veículos. **0.0**


__________

##Questão 03 (1 ponto)


Implemente a listagem de clientes. Considere criar um método na classe Cliente para mostrar os dados.


### Resposta

> [Logo abaixo do texto "LISTA DE CLIENTES", do método "listarClientes()", criei uma variável chamada "pos", do tipo "int", com valor 0, que armazenará o índice de cada cliente criado. Depois, fiz um "for" que recebe os dados dos clientes que foram armazenados em "listaClientes", e adiciona uma numeração para cada cliente cadastrado (pos += 1). O primeiro cliente cadastrado receberá o número 1, o segundo, o número 2, e assim por diante. E por fim, são exibidos os dados do cliente na tela, junto a sua numeração (cliente.mostraDados). ]

### Correção

> Correto. Esse índice poderia fazer parte do cadastro do cliente, por que ele vai variar a cada execução. **1.0**

__________

##Questão 04 (2 pontos)


Implemente a busca de veículos. O sistema deve perguntar para o usuário a placa e buscar na lista de veículos. Caso nenhum veículo seja encontrado uma mensagem deve ser exibida.


### Resposta

> [No método "buscaVeiculos()", criei uma variável chamada "busca", do tipo String, com valor nulo, que vai ler, em "busca = scan.nextLine()", a placa digitada pelo usuário. Fiz um "if" que compara se a placa lida pela "busca" é igual a cadastrada. Se sim, aparece na tela: Veículo encontrado!, senão: Erro na busca do veículo!.]

### Correção

> Não mostra o resultado da busca. Cadastro não funciona corretamente. **1.5**


__________

##Questão 05 (2 pontos)


A aplicação tem uma opção "Gerar Dados" no menu principal que tem por objetivo criar dados de teste para facilitar o desenvolvimento, sem ter que ficar cadastrando a cada vez que se entra no sistema. Considerando essa funcionalidade resolva: 


* Altere o método para gerar Cliente e Motos também;

* Qual a diferença na chamada dos construtores de Cliente, Moto e Carro para esse método e os acessados via Menu do sistema?

* Implemente uma contagem dos objetos gerados e informe ao usuário quantos de cada foram gerados;



### Resposta

> [Suas resposta]


### Correção

> Questão sem resposta. **0.0**

__________


### Nota de Correção
> A prova não executou por causa de dois imports na classe principal que tiveram que ser comentados para que a prova não fosse anulada. Descontado **1.0 ponto**, por não ter testado antes de entregar!

		//import escola.Aluno;
		//import escola.Professor;


## Nota da Prova: 3.5


##Boa prova!