import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class ControllerTela {

    public Jogador jogador = new Jogador();
    public Placar p = new Placar();
    public Novojogo nj = new Novojogo();
    public Verificarpartida vp = new Verificarpartida();

    @FXML
    public Button campo1;

    @FXML
    public Button campo2;

    @FXML
    public Button campo3;

    @FXML
    public Button campo4;

    @FXML
    public Button campo5;

    @FXML
    public Button campo6;

    @FXML
    public Button campo7;

    @FXML
    public Button campo8;

    @FXML
    public Button campo9;

    @FXML
    public Button novoJogo;

    @FXML
    public Label pontosO;

    @FXML
    public Label pontosX;

    @FXML
    public Button sair;

    @FXML
    public Label msg;

    @FXML
    void escolher(MouseEvent event) {

        if (event.getTarget() == campo1) {
            campo1.setText(jogador.getIniciar());
            if (jogador.getIniciar().equalsIgnoreCase("X")) {
                campo1.setTextFill(Color.RED);
            } else {
                campo1.setTextFill(Color.BLUE);
            }
            jogador.escolher(this);
            campo1.setDisable(true);
            vp.verificar(this);

        }

        else if (event.getTarget() == campo2) {
            campo2.setText(jogador.getIniciar());
            if (jogador.getIniciar().equalsIgnoreCase("X")) {
                campo2.setTextFill(Color.RED);
            } else {
                campo2.setTextFill(Color.BLUE);
            }
            jogador.escolher(this);
            campo2.setDisable(true);
            vp.verificar(this);

        }

        else if (event.getTarget() == campo3) {
            campo3.setText(jogador.getIniciar());
            if (jogador.getIniciar().equalsIgnoreCase("X")) {
                campo3.setTextFill(Color.RED);
            } else {
                campo3.setTextFill(Color.BLUE);
            }
            jogador.escolher(this);
            campo3.setDisable(true);
            vp.verificar(this);

        }

        else if (event.getTarget() == campo4) {
            campo4.setText(jogador.getIniciar());
            if (jogador.getIniciar().equalsIgnoreCase("X")) {
                campo4.setTextFill(Color.RED);
            } else {
                campo4.setTextFill(Color.BLUE);
            }
            jogador.escolher(this);
            campo4.setDisable(true);
            vp.verificar(this);

        }

        else if (event.getTarget() == campo5) {
            campo5.setText(jogador.getIniciar());
            if (jogador.getIniciar().equalsIgnoreCase("X")) {
                campo5.setTextFill(Color.RED);
            } else {
                campo5.setTextFill(Color.BLUE);
            }
            jogador.escolher(this);
            campo5.setDisable(true);
            vp.verificar(this);

        }

        else if (event.getTarget() == campo6) {
            campo6.setText(jogador.getIniciar());
            if (jogador.getIniciar().equalsIgnoreCase("X")) {
                campo6.setTextFill(Color.RED);
            } else {
                campo6.setTextFill(Color.BLUE);
            }
            jogador.escolher(this);
            campo6.setDisable(true);
            vp.verificar(this);

        }

        else if (event.getTarget() == campo7) {
            campo7.setText(jogador.getIniciar());
            if (jogador.getIniciar().equalsIgnoreCase("X")) {
                campo7.setTextFill(Color.RED);
            } else {
                campo7.setTextFill(Color.BLUE);
            }
            jogador.escolher(this);
            campo7.setDisable(true);
            vp.verificar(this);

        }

        else if (event.getTarget() == campo8) {
            campo8.setText(jogador.getIniciar());
            if (jogador.getIniciar().equalsIgnoreCase("X")) {
                campo8.setTextFill(Color.RED);
            } else {
                campo8.setTextFill(Color.BLUE);
            }
            jogador.escolher(this);
            campo8.setDisable(true);
            vp.verificar(this);

        }

        else if (event.getTarget() == campo9) {
            campo9.setText(jogador.getIniciar());
            if (jogador.getIniciar().equalsIgnoreCase("X")) {
                campo9.setTextFill(Color.RED);
            } else {
                campo9.setTextFill(Color.BLUE);
            }
            jogador.escolher(this);
            campo9.setDisable(true);
            vp.verificar(this);

        }

    }

    @FXML
    void novojogo(MouseEvent event) {
        nj.novo(this);
        msg.setText("Jogador " + jogador.getIniciar() + " começa");
    }

    @FXML
    void zerar(MouseEvent event) {
        p.zerarPontuacao();
        pontosO.setText("0");
        pontosX.setText("0");
    }

    public void placar(String vencedor) {
        if (vencedor.equalsIgnoreCase("X")) {
            msg.setText("Jogador X venceu a rodada!");
            p.incrementarPontosX();
            pontosX.setText(String.valueOf(p.getPontosX()));
        } else if (vencedor.equalsIgnoreCase("O")) {
            msg.setText("Jogador O venceu a rodada!");
            p.incrementarPontosO();
            pontosO.setText(String.valueOf(p.getPontosO()));
        } else if (vencedor.equalsIgnoreCase("V")) {
            msg.setText("Deu velha!");
        } else if (vencedor.equals("N")) {
            return;
        }
    }

}