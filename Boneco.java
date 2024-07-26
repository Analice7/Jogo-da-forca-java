public class Boneco {
  private int tentativasRestantes;
  private String[] boneco;

  public Boneco() {
    this.tentativasRestantes = 6;
    this.boneco = new String[] {
        "   _______",
        "  |       |",
        "  |",
        "  |",
        "  |",
        " _|_"
    };
  }

  public void atualizarBoneco() {
    this.tentativasRestantes--;
    switch (this.tentativasRestantes) {
        case 5:
            this.boneco[2] = "  |       O";
            break;
        case 4:
            this.boneco[3] = "  |       |";
            break;
        case 3:
            this.boneco[3] = "  |      /|";
            break;
        case 2:
            this.boneco[3] = "  |      /|\\";
            break;
        case 1:
            this.boneco[4] = "  |      /";
            break;
        case 0:
            this.boneco[4] = "  |      / \\";
            break;
        default:
            break;
    }
  }

  public void exibirBoneco() {
    for (int i = 0; i < this.boneco.length; i++) {
      System.out.println("\n" + this.boneco[i]);
    }
  }

  public int getTentativasRestantes() {
    return this.tentativasRestantes;
  }

}
