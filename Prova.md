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
> As classes se relacionam estando associados há uma "package".

> A semelhança entre as classes carro e moto é que as duas extendem a classe Veículo.

> O papel da classe Veículo é compartilhar os atributos que as classes moto e carro tem em comum.

> O Menu precisa ser importado em cada classe que ultiliza seus atributos.

### Correção
> As respostas estão corretas. **3 pontos**
___________

##Questão 02 (2 pontos)


Implemente o cadastro de veículos. O usuário deve selecionar se pretende cadastrar um **Moto** ou um **Carro** e informar os dados pertinentes a cada tipo de veículo.


### Resposta

> Foi criado o método de cadastro através de um "switch" que chama o método de criação da moto ou do carro, e se o objeto for diferente de "null" ele é salvo na lista de Veículos.

### Correção
> Poderia ter criado um objeto da classe Menu com as opçóes "Carro, Moto". **1.5 pontos**


__________

##Questão 03 (1 ponto)


Implemente a listagem de clientes. Considere criar um método na classe Cliente para mostrar os dados.


### Resposta

> A listagem de clientes foi feito um método mostraCliente na classe cliente e com um "for" que pega cada cliente que temos na listaClientes e usa ultiliza o método mostraCliente em tais.
### Correção
> Correto. O método poderia mostrar os dados de UM objeto e o for rodar onde o método está sendo chamado. . **1 ponto**

__________

##Questão 04 (2 pontos)


Implemente a busca de veículos. O sistema deve perguntar para o usuário a placa e buscar na lista de veículos. Caso nenhum veículo seja encontrado uma mensagem deve ser exibida.


### Resposta

> Para a busca de veículos foi criado um método que faz um "for" em toda a listaVeiculos e compara o que foi digitado pelo usuário, se for igual o método imprime o Veiculo na tela, se não imprime um erro.

### Correção
> Correto. **2.0 pontos**

__________

##Questão 05 (2 pontos)


A aplicação tem uma opção "Gerar Dados" no menu principal que tem por objetivo criar dados de teste para facilitar o desenvolvimento, sem ter que ficar cadastrando a cada vez que se entra no sistema. Considerando essa funcionalidade resolva: 


* Altere o método para gerar Cliente e Motos também;

* Qual a diferença na chamada dos construtores de Cliente, Moto e Carro para esse método e os acessados via Menu do sistema?

* Implemente uma contagem dos objetos gerados e informe ao usuário quantos de cada foram gerados;



### Resposta

> O método "Gerar Dados" foi alterado para gerar Clientes e Motos do mesmo jeito que é feito para carros.

> A diferença entre os construtores são os atributos a serem adicionados em cada tipo de objeto.

> Foi implementado uma contagem bem simples onde o metodo faz um "for" das listas e coloca o número de cada objeto acima dos seus dados.

### Correção
> Faz o que pede mas poderia apenas mostrar os totais. A diferença, além dos atributos são os contrutores que são chamados. no método "geraDados" os atributos são passados diretamente, e no outro é o Scanner que pede. **1.0 ponto**

__________


### Nota da prova: 8.5



##Boa prova!