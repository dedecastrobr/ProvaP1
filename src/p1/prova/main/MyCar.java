package p1.prova.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import p1.prova.tools.Menu;

public class MyCar {

	public static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
	public static ArrayList<Veiculo> listaVeiculos = new ArrayList<Veiculo>();

	public static List<String> opsMenuPrincipal = Arrays.asList("Clientes", "Veículos", "Gerar Dados");
	public static List<String> opsMenuClientes = Arrays.asList("Cadastrar Clientes", "Listar Clientes");
	public static List<String> opsMenuVeiculos = Arrays.asList("Lista Veículos", "Cadastrar Veículo", "Buscar Veículo");

	public static List<String> opsMenuTipo = Arrays.asList("Carros", "Motos", "Todos");

	public static void main(String[] args) {

		System.out.println("Bem vindo à MyCar");

		Menu menu = new Menu("Menu Principal", opsMenuPrincipal);
		menu.show();
		int op = menu.getOption();
		do {
			switch (op) {
			case 0:
				Menu menuClientes = new Menu("Clientes", opsMenuClientes);
				menuClientes.show();

				int opClientes = menuClientes.getOption();
				do {
					switch (opClientes) {
					case 0:
						cadastrarCliente();
						break;
					case 1:
						listarClientes();
						break;
					default:
						break;
					}
					menuClientes.show();
					opClientes = menuClientes.getOption();
				} while (opClientes != 99);

				break;
			case 1:
				Menu menuVeiculos = new Menu("Veículos", opsMenuVeiculos);
				menuVeiculos.show();

				int opVeiculos = menuVeiculos.getOption();
				do {
					switch (opVeiculos) {
					case 0:
						Menu tipoVeiculos = new Menu("Listar quais veículos?", opsMenuTipo);
						tipoVeiculos.show();
						listarVeiculos(tipoVeiculos.getOption());
						break;
					case 1:
						cadastrarVeiculo();
						break;
					case 2:
						buscaVeiculos();
						break;
					default:
						break;
					}
					menuVeiculos.show();
					opVeiculos = menuVeiculos.getOption();
				} while (opVeiculos != 99);
				break;
			case 2:
				gerarDados();
				break;
			case 99:
				System.out.println("Tchau!");
				System.exit(0);
				break;

			default:
				System.out.println("Opção inválida!");
				break;
			}
			menu.show();
			op = menu.getOption();
		} while (op != 99);

	}

	private static Veiculo buscaVeiculos() {
		System.out.println("Informe a Placa do Veículo: ");
		String busca = "";
		busca = Menu.scan.nextLine();
		for (Veiculo auto : listaVeiculos) {
			if(busca.equals(auto.getPlacasVeiculo())) {
				auto.mostraDados();
				return auto;
			}
		}
		System.out.println("Veículo não encontrado!");
		return null;
	}

	private static void gerarDados() {
		
		listaVeiculos.add(new Carro("ASW4567", "UOIU3OI1U23O2I1U3U", 4));
		listaVeiculos.add(new Carro("ASD455", "7S76D7DS7D6SD76D7S", 5));
		listaVeiculos.add(new Carro("CFD2323", "OIO21IOI1OI2O1I2O1", 2));
		listaVeiculos.add(new Carro("ERW4343", "JQJQJ1JQJ1JQJ1JQJ1", 3));
		listaVeiculos.add(new Carro("GGT5555", "KQAK1KAKAL1KA1LAK2", 2));
		
		listaVeiculos.add(new Moto("AAA", "AABB", 1));
		listaVeiculos.add(new Moto("BBB", "BBBB", 2));
		listaVeiculos.add(new Moto("CCC", "CCBB", 3));
		listaVeiculos.add(new Moto("DDD", "DDBB", 4));
		listaVeiculos.add(new Moto("EEE", "EEBB", 5));
		
		listaClientes.add(new Cliente("AAA", 12, 1));
		listaClientes.add(new Cliente("BBB", 13, 2));
		listaClientes.add(new Cliente("CCC", 14, 3));
		listaClientes.add(new Cliente("DDD", 15, 4));
		listaClientes.add(new Cliente("EEE", 16, 5));
		
		System.out.println("Foram gerados 5 Carros e 5 Motos\n");
		int num = 1;
		for (Veiculo v : listaVeiculos) {
			System.out.println("Número: " + num);
			v.mostraDados();
			num += 1;
		}
		System.out.println("\nForam gerados 5 Clientes:\n");
		for (Cliente c : listaClientes) {
			System.out.println("Número: " + num);
			c.mostraCliente();
			num += 1;
		}
		
	}

	private static void cadastrarVeiculo() {
		System.out.println("1 - Moto\n2 - Carro");
		int op = Menu.scan.nextInt();
		Menu.scan.nextLine();
		switch (op) {
		case 1:
			Moto moto = new Moto();
			if (moto != null) {
				moto.save();
				System.out.println("Moto criada!");
			}
			break;
		case 2:
			Carro carro = new Carro();
			if (carro != null) {
				carro.save();
				System.out.println("Carro criado!");
			}
			break;
		default:
			break;
		}

	}

	private static void listarVeiculos(int option) {
		String show = "";
		switch (option) {
		case 0:
			show = "C";
			break;
		case 1:
			show = "M";
			break;
		default:
			show = "T";
			break;
		}
		for (Veiculo v : listaVeiculos) {
			if (show.equalsIgnoreCase("T")) {
				v.mostraDados();
			} else {
				if (show.equalsIgnoreCase(v.getTipoVeiculo())) {
					v.mostraDados();
				}
			}
		}
	}

	private static void listarClientes() {
		System.out.println("LISTA DE CLIENTES: ");
		System.out.println("_______________________________________");
		int i = 1;
		for (Cliente cliente : listaClientes) {
			System.out.println("Número: "+ i);
			i = i+1;
			cliente.mostraCliente();
			System.out.println("_______________________________________\n");
		}
	}

	private static void cadastrarCliente() {

		System.out.println("CADASTRO DE NOVO CLIENTE: ");

		Cliente cli = new Cliente();

		if (cli.getCpfCliente() != 0) {
			System.out.println("Cliente cadastrado com sucesso!");
			listaClientes.add(cli);
		} else {
			System.out.println("Erro cadastrando cliente!");
		}

	}
}
