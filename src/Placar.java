public class Placar {

    private int pontosX = 0;
    private int pontosO = 0;

    public void incrementarPontosX() {
        pontosX++;
    }

    public void incrementarPontosO() {
        pontosO++;
    }

    public int getPontosX() {
        return pontosX;
    }

    public int getPontosO() {
        return pontosO;
    }

    public void zerarPontuacao() {
        pontosX = 0;
        pontosO = 0;
    }
}