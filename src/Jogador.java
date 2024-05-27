public class Jogador {

    private String startGame = "X";

    public void escolher(ControllerTela t) {
        if (startGame == "X") {
            startGame = "O";
            t.msg.setText("Vez do O");
        } else {
            startGame = "X";
            t.msg.setText("Vez do X");
        }
    }

    public String getIniciar() {
        return startGame;
    }
}