import java.util.Scanner;
import java.util.ArrayList;
import gestao.Empresa;
import pessoa.Cliente;
import produto.Mercadoria;
import destino.Entrega;

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

        Cliente cliente = new Cliente();
        // equalIgnoreCase = caso de que o cliente digite "F" tanto maiúsculo quanto
        // minúsculo, independente entra no if
        if (tipoCliente.equalsIgnoreCase("F")) {
            System.out.print("Digite seu nome: ");
            cliente.setNome(scanner.nextLine());
            System.out.print("Digite seu CPF: ");
            cliente.setCpf(scanner.nextLine());
            System.out.println("Digite seu endereço: ");
            cliente.setEndereco(scanner.nextLine());
            System.out.println("Digite o nome da sua Rua: ");
            cliente.setRua(scanner.nextLine());
            // System.out.println("Digite o número da sua residência: ");
            // cliente.setNumero(scanner.nextLine());

            System.out.println("\n--- Cliente Pessoa Física Cadastrado com Sucesso ---");
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println("Endereço: " + cliente.getEndereco());
            System.out.println("Rua: " + cliente.getRua());
            System.out.println("Número: " + cliente.getNumero());

        } else if (tipoCliente.equalsIgnoreCase("J")) {
            System.out.print("Digite a Razão Social: ");
            cliente.setRazaoSocial(scanner.nextLine());

            System.out.print("Digite o CNPJ: ");
            cliente.setCnpj(scanner.nextLine());

            System.out.println("Digite seu endereço: ");
            cliente.setEndereco(scanner.nextLine());

            System.out.println("Digite o nome da sua Rua: ");
            cliente.setRua(scanner.nextLine());

            System.out.println("\n--- Cliente Pessoa Jurídica Cadastrado com Sucesso ---");
            System.out.println("Razão Social: " + cliente.getRazaoSocial());
            System.out.println("CNPJ: " + cliente.getCnpj());
            System.out.println("Endereço: " + cliente.getEndereco());
            System.out.println("Rua: " + cliente.getRua());

        } else {
            System.out.println("Opção inválida. Encerrando o programa.");
            scanner.close();
            return; // para se a opção for inválida
        }

        ArrayList<Mercadoria> pedidos = new ArrayList<>();
        // laço que permite cadastrar vários produtos até o usuário decidir sair
        while (true) {
            System.out.println("\nDigite o nome da mercadoria para cadastrar ou 'sair' para encerrar:");
            String nomeMercadoria = scanner.nextLine();

            if (nomeMercadoria.equalsIgnoreCase("sair")) {
                break;
            }

            // novo objeto Mercadoria para cada item
            Mercadoria novaMercadoria = new Mercadoria();
            novaMercadoria.setNome(nomeMercadoria);
            // peso da mercadoria
            System.out.print("Digite o peso (kg): ");
            novaMercadoria.setPeso(scanner.nextDouble());
            scanner.nextLine();
            // volume da mercadoria
            System.out.print("Digite o volume (m³): ");
            novaMercadoria.setVolume(scanner.nextDouble());
            scanner.nextLine();
            // valor da mercadoria
            System.out.println("Digite o valor unitário (R$): ");
            novaMercadoria.setValor(scanner.nextDouble());
            scanner.nextLine();

            pedidos.add(novaMercadoria); // Adiciona a mercadoria cadastrada na lista
            System.out.println("--- Mercadoria '" + novaMercadoria.getNome() + "' cadastrada com sucesso! ---");
        }
        // resuminho dos pedidos: nome / peso / volume / valor unitário
        System.out.println("\n--- Resumo dos Pedidos Realizados ---");
        if (pedidos.isEmpty()) {
            System.out.println("Nenhuma mercadoria foi cadastrada.");
        } else {
            for (Mercadoria m : pedidos) {
                System.out.println("Item: " + m.getNome() + " | Peso: " + m.getPeso() + " kg | Volume: " + m.getVolume()
                        + " m³" + " | Valor Unitário: " + m.getValor() + " R$");
            }

            System.out.println("\nDigite o endereço de entrega: ");
            String enderecoEntrega = scanner.nextLine();

            System.out.println("\nAté quando deseja receber?");
            String datEntrega = scanner.nextLine();

            String nomeDestinatario = "";
            if (tipoCliente.equalsIgnoreCase("F")) {
                nomeDestinatario = cliente.getNome();
            } else {
                nomeDestinatario = cliente.getRazaoSocial();
            }

            System.out.println("--- Detalhes da Entrega ---");
            System.out.println("\nOs produtos serão enviados para o destinatário: " + nomeDestinatario
                    + " no Endereço: " + enderecoEntrega + " na Rua: " + cliente.getRua() + "\nData prevista para entrega: " + datEntrega);

            String remetenteEntrega = "Empresa: " + empresa.getNome() + " | CNPJ: " + empresa.getEmpCnpj();
            System.out.println("Remetente: " + remetenteEntrega);

            if (tipoCliente.equalsIgnoreCase("J")) {
                String destinoUsuario = "Destinatário: " + cliente.getRazaoSocial() + " | CNPJ: " + cliente.getCnpj()
                        + " | Endereço: " + cliente.getEndereco();
                System.out.println("Destino: " + destinoUsuario);
            } else if (tipoCliente.equalsIgnoreCase("F")) {
                String destinoUsuario = "Destinatário: " + cliente.getNome() + " | CPF: " + cliente.getCpf()
                        + " \n|no Endereço: " + cliente.getEndereco() + ", Rua: " + cliente.getRua();
                System.out.println("Destino: " + destinoUsuario);
                // System.out.println("Data prevista para entrega: 05/12/2024");
                enderecoEntrega = cliente.getEndereco() + ", Rua: " + cliente.getRua();
            }
        } 
        scanner.close();
    }
}
