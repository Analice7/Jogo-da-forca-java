import java.util.Random;

public class BancoDePalavras {

  // Vetor de palavras encapsulado
  private String palavras[];

  // Construtor que inicializa o vetor de palavras
  public BancoDePalavras(String palavras[]) {
    this.palavras = palavras;
  }

  public BancoDePalavras() {
    this.palavras = new String[]{"ARGENTINA", "BRASIL", "CHILE", "EQUADOR", "URUGUAI","PARAGUAI", "PERU", "BOLIVIA", "COLOMBIA", "VENEZUELA", "GUATEMALA", "HONDURAS", "NICARAGUA","PANAMA", "MEXICO", "CANADA", "CUBA", "HAITI", "JAMAICA", "BAHAMAS", "EGITO", "NIGERIA", "SUDAO", "MARROCOS", "ANGOLA", "MOCAMBIQUE", "ETIOPIA", "ARGELIA", "RUSSIA", "ALEMANHA", "FRANCA", "ITALIA", "ESPANHA", "PORTUGAL", "HOLANDA", "BELGICA", "NORUEGA", "SUECIA", "DINAMARCA", "FINLANDIA", "POLONIA", "UCRANIA", "AUSTRIA", "SUICA", "GRECIA", "TURQUIA", "IRAQUE", "ISRAEL", "PAQUISTAO", "INDIA", "CHINA", "JAPAO", "TAILANDIA", "BANGLADESH", "VIETNAM"};
  }

  public String sortear() {

    Random random = new Random(); // Cria uma instancia de Random
    int indice = random.nextInt(palavras.length); // Sorteia um numero entre 0 e o tamanho do vetor de palavras
    return palavras[indice]; // Retorna a palavra sorteada

  }
}
