import java.util.Scanner;

public class JogoDaForca {
  BancoDePalavras palavras;
  String palavraSorteada;
  Boneco boneco;
  boolean jogoTerminado;

  public JogoDaForca() {
    this.palavras = new BancoDePalavras();
    this.palavraSorteada = palavras.sortear(); 
    this.boneco = new Boneco();
    this.jogoTerminado = false;
  }

  public void jogar(Scanner sc) {
    char[] palavraEscondida = new char[this.palavraSorteada.length()];
    for (int i = 0; i < this.palavraSorteada.length(); i++) {
      palavraEscondida[i] = '_';
    }

    while(!this.jogoTerminado) {

      exibirStatusDoJogo(palavraEscondida);

      char letra;
      while (true) {
        System.out.println("\nDigite uma letra: ");
        String input = sc.nextLine().toUpperCase();
        if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
          letra = input.charAt(0);
          break;
        } else {
          System.out.println("[Letra invalida]");
        }
      }

      boolean letraEncontrada = false;

      for(int i = 0; i < this.palavraSorteada.length(); i++) {
        if(this.palavraSorteada.charAt(i) == letra) {
          palavraEscondida[i] = letra;
          letraEncontrada = true;
        }
        exibirStatusDoJogo(palavraEscondida);
      }

      if(!letraEncontrada) {
        this.boneco.atualizarBoneco();
      }

      if(String.valueOf(palavraEscondida).equals(this.palavraSorteada)) {
        System.out.println("\nParabens! voce acertou, o pais era: " + this.palavraSorteada);
        this.jogoTerminado = true;
      } else if (this.boneco.getTentativasRestantes() <= 0) {
        exibirStatusDoJogo(palavraEscondida);
        System.out.println("\nVoce perdeu, o pais era: " + this.palavraSorteada);
        this.jogoTerminado = true;
      }
    }
  }

  public void limparConsole() {
      System.out.print("\033[H\033[2J");  
      System.out.flush();  
  }

  public void exibirStatusDoJogo(char[] palavraEscondida) {
    limparConsole();
    System.out.println("JOGO DA FORCA (TEMA PAISES)");
    this.boneco.exibirBoneco();
    System.out.println("\nPAIS: " + String.valueOf(palavraEscondida));
  }
}
