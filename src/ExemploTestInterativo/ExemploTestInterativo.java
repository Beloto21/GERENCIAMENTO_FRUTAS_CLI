package ExemploTestInterativo;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

// classe ExemploTestInterativo
public class ExemploTestInterativo {
    public static void main(String[] args) { 
    	
        // cria o Scanner que le oque o  usuario escrever
        Scanner scanner = new Scanner(System.in);
        
        // cria o (Set) que armazenaa as frutas
        Set<String> frutas = new HashSet<>();
        
        // loop, que aparece as opções validas para a escolha de algum usuario 
        while (true) { 
            try {
            	
                // aparece o menu de escolhas para o usuario 
                System.out.println("\nEscolha uma opção: ");
                System.out.println("1. Adicionar uma fruta");
                System.out.println("2. Listar todas as frutas");
                System.out.println("3. Remover uma fruta");
                System.out.println("4. Verificar se uma fruta está presente");
                System.out.println("5. Sair");
                System.out.print("Opção: ");
                
                // le a opção escolhida pelo usuário
                int opcao = scanner.nextInt();
                
                // para limpar o buffer do scanner
                scanner.nextLine();

                // para verificar qual a escolha do usuario e executar 
                switch (opcao) {
                    case 1:
                    	
                        // adiciona uma fruta
                        System.out.print("Digite o nome da fruta para adicionar: "); 
                        String novaFruta = scanner.nextLine();
                        
                        // aqui vai tentar adicionar a fruta. caso ela ja tenha, avisa o usuario
                        if (frutas.add(novaFruta)) {
                            System.out.println(novaFruta + " foi adicionada.");
                        } else {
                            System.out.println(novaFruta + " já está presente no conjunto.");
                        }
                        break; 
                    case 2:
                    	
                        // aqui vai listar as frutas no conjunto
                        System.out.println("Frutas: " + frutas);
                        break;
                    case 3:
                    	
                        //  aqui é para remover uma fruta
                        System.out.print("Digite o nome da fruta que deseja remover: "); 
                        String frutaRemover = scanner.nextLine();
                        
                        // aqui tenta remover a fruta. caso ela não seja encontrada, avisa o usuario
                        if (frutas.remove(frutaRemover)) {
                            System.out.println(frutaRemover + " foi removida.");
                        } else {
                            System.out.println(frutaRemover + " não foi encontrada.");
                        }
                        break;
                    case 4:
                    	
                        // Verifica se uma fruta está no conjunto
                        System.out.print("Digite o nome da fruta para verificar: ");
                        String frutaVerificar = scanner.nextLine();
                        
                        // aqui é para informar o usuario se a fruta possui ou não 
                        if (frutas.contains(frutaVerificar)) {
                            System.out.println(frutaVerificar + " está presente no conjunto.");
                        } else {
                            System.out.println(frutaVerificar + " não foi encontrada no conjunto.");
                        }
                        break;
                    case 5:
                    	
                        //  aqui é a ppção para sair 
                        System.out.println("Saindo...");
                        
                        // aqui é para fechar o scanner, ai ele encerra acaba
                        scanner.close();
                        return;
                    default:
                    	
                        // se o usuario escolher uma opção que seja invelida, vai aparecer a mensagem que esta errado
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
            	
                // se o usuario colocar um caracter que não seja um numero, vai aparecer essa mensagem na tela
                System.out.println("Entrada inválida. Por favor, digite um número.");
                
                // aqui vai limpar a entrada que for invalida do scanner, para que não fique infinito
                scanner.nextLine();
            }
        }
    }
}