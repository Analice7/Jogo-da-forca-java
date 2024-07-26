import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int opcao = 0;
    while(opcao != 2) {
      System.out.println("\nJOGO DA FORCA (TEMA PAISES)\n");
      System.out.println("1 - Jogar");
      System.out.println("2 - Sair");
      System.out.println("\nDigite uma opcao: ");

      while (!sc.hasNextInt()) {
        System.out.println("Opção inválida. Digite novamente: ");
        sc.next(); // Descarta a entrada inválida
      }
      opcao = sc.nextInt();
      sc.nextLine();

      switch(opcao) {
        case 1:
          JogoDaForca jogo = new JogoDaForca();
          jogo.jogar(sc);
          break;
        case 2:
          System.out.println("\nObrigado por jogar");
          break;
        default:
          System.out.println("\nOpcao invalida");
          break;
      }
    }
    sc.close();
  }
}
