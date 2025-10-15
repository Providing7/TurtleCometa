import java.util.Scanner;
import java.util.ArrayList;
import gestao.Empresa;
import pessoa.Cliente;
import produto.Mercadoria;

public class Main {
    public static void main(String[] args) {
       Empresa empresa = new Empresa();
        empresa.setNome("Tartaruga Cometa");
        empresa.setEmpCnpj("12.345.678/0001-99");
        System.out.println("Nome da empresa: " + empresa.getNome());
        System.out.println("CNPJ: " + empresa.getEmpCnpj());
        System.out.println("------------------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Seja bem-vindo");
        System.out.print("Deseja cadastrar Pessoa (F)isica ou (J)uridica? ");
        String tipoCliente = scanner.nextLine();

// caso ele digite F será jogado para essa parte do código
// equalIgnoreCase = caso de que o cliente digite "F" tanto maiúsculo quanto minúsculo, independente entra no if
        if (tipoCliente.equalsIgnoreCase("F")) {
            Cliente clienteFisica = new Cliente();

            System.out.print("Digite seu nome: ");
            clienteFisica.setNome(scanner.nextLine());
             System.out.print("Digite seu CPF: ");
            clienteFisica.setCpf(scanner.nextLine());

            System.out.println("Digite seu endereço: ");
            clienteFisica.setEndereco(scanner.nextLine());

            System.out.println("\n--- Cliente Pessoa Física Cadastrado com Sucesso ---");
            System.out.println("Nome: " + clienteFisica.getNome());
            System.out.println("CPF: " + clienteFisica.getCpf()); 
            System.out.println("Endereço: " + clienteFisica.getEndereco());
       
        } else if (tipoCliente.equalsIgnoreCase("J")){
            Cliente clienteJuridica = new Cliente();

            System.out.print("Digite a Razão Social: ");
            clienteJuridica.setRazaoSocial(scanner.nextLine());

            System.out.print("Digite o CNPJ: ");
            clienteJuridica.setCnpj(scanner.nextLine());

            System.out.println("Digite seu endereço: ");
            clienteJuridica.setEndereco(scanner.nextLine());

            System.out.println("\n--- Cliente Pessoa Jurídica Cadastrado com Sucesso ---");
            System.out.println("Razão Social: " + clienteJuridica.getRazaoSocial());
            System.out.println("CNPJ: " + clienteJuridica.getCnpj());
            System.out.println("Endereço: " + clienteJuridica.getEndereco());
        }

        
        ArrayList<Mercadoria> pedidos = new ArrayList<>();
        // laço que permite cadastrar vários produtos até o usuário decidir sair
        while (true) {
            System.out.println("\nDigite o nome da mercadoria para cadastrar ou 'sair' para encerrar:");
            String nomeMercadoria = scanner.nextLine();

            if(nomeMercadoria.equalsIgnoreCase("sair")) {
                break; // Encerra o laço se o usuário digitar 'sair'
            }

            // Cria um novo objeto Mercadoria para cada item
            Mercadoria novaMercadoria = new Mercadoria();
            novaMercadoria.setNome(nomeMercadoria);

            System.out.print("Digite o peso (kg): ");
            novaMercadoria.setPeso(scanner.nextDouble());
            scanner.nextLine();

            System.out.print("Digite o volume (m³): ");
            novaMercadoria.setVolume(scanner.nextDouble());
            scanner.nextLine();

            pedidos.add(novaMercadoria); // Adiciona a mercadoria cadastrada à lista
            System.out.println("--- Mercadoria '" + novaMercadoria.getNome() + "' cadastrada com sucesso! ---");
        }

        System.out.println("\n--- Resumo dos Pedidos Realizados ---");
        if (pedidos.isEmpty()) {
            System.out.println("Nenhuma mercadoria foi cadastrada.");
        } else {
            for (Mercadoria m : pedidos) {
                System.out.println("Item: " + m.getNome() + " | Peso: " + m.getPeso() + " kg | Volume: " + m.getVolume() + " m³");
            }

        // System.out.println("Nome do destinatário: " + clienteJuridica.getNome());
        // System.out.println("Para onde deseja enviar os produtos? ");
        String enderecoEntrega = scanner.nextLine();
        System.out.println("\nOs produtos serão enviados para o destinatário: " + "no Endereço: " + enderecoEntrega);
    
        
    }
    scanner.close();
    }
}
