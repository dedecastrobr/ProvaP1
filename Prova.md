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
> [1- São classes de Herança,onde a caracteriscas de uma principal são usadas nas demais e assim são interligadas.
2- Ambas as classes pedem para que o usuário informe caracteristicas de um determinado veículo,seja as portas do carro ou cilindradas da moto,placa e renavam.
3- A classe veículo identifica o veículo que foi caracterizado,seja nas classes carro ou moto. 
4- Os pacotes tem extensão com a classe principal,pois ela chama os dados obtidos pelas classes filhas.]

___________

##Questão 02 (2 pontos)


Implemente o cadastro de veículos. O usuário deve selecionar se pretende cadastrar um **Moto** ou um **Carro** e informar os dados pertinentes a cada tipo de veículo.


### Resposta

> [ private static void cadastrarVeiculo() { 
			sistem.out.println (" Bem vindo ao cadastro de veículos! ");
			sistem.out.println (" 1 --> carro ");
			sistem.out.println (" 2 --> moto ");
			sistem.out.println (" 99 --> sair ");
		int opSelecionada = scan.nextInt();
		scan = nextLine();
			return opSelecionada;
		} // aqui tentei mostrar o menu onde selecionamos o tipo de veiculo,e aqui estão suas opções para cadastro.]


__________

##Questão 03 (1 ponto)


Implemente a listagem de clientes. Considere criar um método na classe Cliente para mostrar os dados.


### Resposta

> [ public static ArrayList<Cliente> ListaClientes = new ArrayList<Cliente>
	List<Cliente> clientesNovos = new ArrayList<cliente>();
	//na classe MyCar,eu botaria para adicionar os clientes cadastrados..logo abaixo
		ListaClientes.addAll //para adicionar todos de uma vez
		// metodo
		public void mostraDados() ;
			super.mostraDados();
		sistem.out.println (" nome: + this.Nome)
		sistem.out.println (" cpf: + this.CPF)
		sistem.out.println (" cnh: + this.CNH)
		// queria que aparecesse o nome,cpf e cnh do cliente
	]


__________

##Questão 04 (2 pontos)


Implemente a busca de veículos. O sistema deve perguntar para o usuário a placa e buscar na lista de veículos. Caso nenhum veículo seja encontrado uma mensagem deve ser exibida.


### Resposta

> [ eu não fiz a parte de buscas nos trabalhos anteriores,pois estou no inicio deles(menus,cadastros)]


__________

##Questão 05 (2 pontos)


A aplicação tem uma opção "Gerar Dados" no menu principal que tem por objetivo criar dados de teste para facilitar o desenvolvimento, sem ter que ficar cadastrando a cada vez que se entra no sistema. Considerando essa funcionalidade resolva: 


* Altere o método para gerar Cliente e Motos também;

* Qual a diferença na chamada dos construtores de Cliente, Moto e Carro para esse método e os acessados via Menu do sistema?

* Implemente uma contagem dos objetos gerados e informe ao usuário quantos de cada foram gerados;



### Resposta

> [ 1- 	ListaClientes.add(new Cliente ("Ingrid",666.999.000-15,63431911));
		ListaClientes.add(new Cliente ("Vitor",190.192.001-01,19116343));
		ListaMotos.add(new Moto ("EOQ6669",A20LK3H57DK32COE,1350));
		ListaMotos.add(new Moto ("AEK1911",A09EBB4N59IL3S4R,999));
		2- cada construtor,seja de carro,moto ou cliente,chama as características de cada um,e temos o construtor de parâmetro (o que chama as caracteríscas de cada um...portas do CARRO,cilindradas da MOTO e cnh/cpf do CLIENTE)
		3- //acho que --V
		sistem.out.println ("numero de elementos" + list.size() );
		//lista.size = tamanho da lista..em tradução literal ]


__________




##Boa prova!