public class Verificarpartida {

    public String vencedor;

    public void verificar(ControllerTela t) {

        // jogador X ----------------------------------------------------------------

        // linha 1
        if (t.campo1.getText().equals("X") && t.campo2.getText().equals("X") && t.campo3.getText().equals("X")) {
            t.campo1.setStyle("-fx-background-color: green");
            t.campo2.setStyle("-fx-background-color: green");
            t.campo3.setStyle("-fx-background-color: green");
            t.campo4.setDisable(true);
            t.campo5.setDisable(true);
            t.campo6.setDisable(true);
            t.campo7.setDisable(true);
            t.campo8.setDisable(true);
            t.campo9.setDisable(true);
            vencedor = "X";
            t.placar(vencedor);
        }

        // linha 2
        else if (t.campo4.getText().equals("X") && t.campo5.getText().equals("X") && t.campo6.getText().equals("X")) {

            t.campo5.setStyle("-fx-background-color: green");
            t.campo4.setStyle("-fx-background-color: green");
            t.campo6.setStyle("-fx-background-color: green");
            t.campo1.setDisable(true);
            t.campo2.setDisable(true);
            t.campo3.setDisable(true);
            t.campo7.setDisable(true);
            t.campo8.setDisable(true);
            t.campo9.setDisable(true);
            vencedor = "X";
            t.placar(vencedor);
        }

        // linha 3
        else if (t.campo7.getText().equals("X") && t.campo8.getText().equals("X") && t.campo9.getText().equals("X")) {

            t.campo7.setStyle("-fx-background-color: green");
            t.campo8.setStyle("-fx-background-color: green");
            t.campo9.setStyle("-fx-background-color: green");
            t.campo1.setDisable(true);
            t.campo2.setDisable(true);
            t.campo3.setDisable(true);
            t.campo4.setDisable(true);
            t.campo5.setDisable(true);
            t.campo6.setDisable(true);
            vencedor = "X";
            t.placar(vencedor);
        }

        // coluna 1
        else if (t.campo1.getText().equals("X") && t.campo4.getText().equals("X") && t.campo7.getText().equals("X")) {

            t.campo1.setStyle("-fx-background-color: green");
            t.campo4.setStyle("-fx-background-color: green");
            t.campo7.setStyle("-fx-background-color: green");
            t.campo2.setDisable(true);
            t.campo3.setDisable(true);
            t.campo5.setDisable(true);
            t.campo6.setDisable(true);
            t.campo8.setDisable(true);
            t.campo9.setDisable(true);
            vencedor = "X";
            t.placar(vencedor);
        }

        // coluna 2
        else if (t.campo2.getText().equals("X") && t.campo5.getText().equals("X") && t.campo8.getText().equals("X")) {

            t.campo2.setStyle("-fx-background-color: green");
            t.campo5.setStyle("-fx-background-color: green");
            t.campo8.setStyle("-fx-background-color: green");
            t.campo1.setDisable(true);
            t.campo4.setDisable(true);
            t.campo7.setDisable(true);
            t.campo3.setDisable(true);
            t.campo6.setDisable(true);
            t.campo9.setDisable(true);
            vencedor = "X";
            t.placar(vencedor);
        }

        // coluna 3
        else if (t.campo3.getText().equals("X") && t.campo6.getText().equals("X") && t.campo9.getText().equals("X")) {

            t.campo3.setStyle("-fx-background-color: green");
            t.campo6.setStyle("-fx-background-color: green");
            t.campo9.setStyle("-fx-background-color: green");
            t.campo1.setDisable(true);
            t.campo2.setDisable(true);
            t.campo4.setDisable(true);
            t.campo5.setDisable(true);
            t.campo7.setDisable(true);
            t.campo8.setDisable(true);
            vencedor = "X";
            t.placar(vencedor);
        }

        // diagonal esquerda
        else if (t.campo1.getText().equals("X") && t.campo5.getText().equals("X") && t.campo9.getText().equals("X")) {

            t.campo1.setStyle("-fx-background-color: green");
            t.campo5.setStyle("-fx-background-color: green");
            t.campo9.setStyle("-fx-background-color: green");
            t.campo2.setDisable(true);
            t.campo3.setDisable(true);
            t.campo4.setDisable(true);
            t.campo6.setDisable(true);
            t.campo7.setDisable(true);
            t.campo8.setDisable(true);
            vencedor = "X";
            t.placar(vencedor);
        }

        // diagonal direita
        else if (t.campo3.getText().equals("X") && t.campo5.getText().equals("X") && t.campo7.getText().equals("X")) {

            t.campo3.setStyle("-fx-background-color: green");
            t.campo5.setStyle("-fx-background-color: green");
            t.campo7.setStyle("-fx-background-color: green");
            t.campo1.setDisable(true);
            t.campo2.setDisable(true);
            t.campo4.setDisable(true);
            t.campo6.setDisable(true);
            t.campo8.setDisable(true);
            t.campo9.setDisable(true);
            vencedor = "X";
            t.placar(vencedor);
        }

        // jogado O ----------------------------------------------------------------
        else if (t.campo1.getText().equals("O") && t.campo2.getText().equals("O") && t.campo3.getText().equals("O")) {

            t.campo1.setStyle("-fx-background-color: green");
            t.campo2.setStyle("-fx-background-color: green");
            t.campo3.setStyle("-fx-background-color: green");
            t.campo4.setDisable(true);
            t.campo5.setDisable(true);
            t.campo6.setDisable(true);
            t.campo7.setDisable(true);
            t.campo8.setDisable(true);
            t.campo9.setDisable(true);
            vencedor = "O";
            t.placar(vencedor);
        }

        else if (t.campo4.getText().equals("O") && t.campo5.getText().equals("O") && t.campo6.getText().equals("O")) {

            t.campo4.setStyle("-fx-background-color: green");
            t.campo5.setStyle("-fx-background-color: green");
            t.campo6.setStyle("-fx-background-color: green");
            t.campo1.setDisable(true);
            t.campo2.setDisable(true);
            t.campo3.setDisable(true);
            t.campo7.setDisable(true);
            t.campo8.setDisable(true);
            t.campo9.setDisable(true);
            vencedor = "O";
            t.placar(vencedor);
        }

        else if (t.campo7.getText().equals("O") && t.campo8.getText().equals("O") && t.campo9.getText().equals("O")) {
            t.campo7.setStyle("-fx-background-color: green");
            t.campo8.setStyle("-fx-background-color: green");
            t.campo9.setStyle("-fx-background-color: green");
            t.campo1.setDisable(true);
            t.campo2.setDisable(true);
            t.campo3.setDisable(true);
            t.campo4.setDisable(true);
            t.campo5.setDisable(true);
            t.campo6.setDisable(true);
            vencedor = "O";
            t.placar(vencedor);
        }

        else if (t.campo1.getText().equals("O") && t.campo4.getText().equals("O") && t.campo7.getText().equals("O")) {
            t.campo1.setStyle("-fx-background-color: green");
            t.campo4.setStyle("-fx-background-color: green");
            t.campo7.setStyle("-fx-background-color: green");
            t.campo2.setDisable(true);
            t.campo3.setDisable(true);
            t.campo6.setDisable(true);
            t.campo5.setDisable(true);
            t.campo8.setDisable(true);
            t.campo9.setDisable(true);
            vencedor = "O";
            t.placar(vencedor);
        }

        else if (t.campo2.getText().equals("O") && t.campo5.getText().equals("O") && t.campo8.getText().equals("O")) {
            t.campo2.setStyle("-fx-background-color: green");
            t.campo5.setStyle("-fx-background-color: green");
            t.campo8.setStyle("-fx-background-color: green");
            t.campo1.setDisable(true);
            t.campo3.setDisable(true);
            t.campo4.setDisable(true);
            t.campo6.setDisable(true);
            t.campo7.setDisable(true);
            t.campo9.setDisable(true);
            vencedor = "O";
            t.placar(vencedor);
        }

        else if (t.campo3.getText().equals("O") && t.campo6.getText().equals("O") && t.campo9.getText().equals("O")) {
            t.campo3.setStyle("-fx-background-color: green");
            t.campo6.setStyle("-fx-background-color: green");
            t.campo9.setStyle("-fx-background-color: green");
            t.campo1.setDisable(true);
            t.campo2.setDisable(true);
            t.campo4.setDisable(true);
            t.campo5.setDisable(true);
            t.campo8.setDisable(true);
            t.campo7.setDisable(true);

            vencedor = "O";
            t.placar(vencedor);
        }

        else if (t.campo1.getText().equals("O") && t.campo5.getText().equals("O") && t.campo9.getText().equals("O")) {
            t.campo1.setStyle("-fx-background-color: green");
            t.campo5.setStyle("-fx-background-color: green");
            t.campo9.setStyle("-fx-background-color: green");
            t.campo2.setDisable(true);
            t.campo3.setDisable(true);
            t.campo4.setDisable(true);
            t.campo6.setDisable(true);
            t.campo7.setDisable(true);
            t.campo8.setDisable(true);
            // jogador.ocontador++;
            vencedor = "O";
            t.placar(vencedor);
        }

        else if (t.campo3.getText().equals("O") && t.campo5.getText().equals("O") && t.campo7.getText().equals("O")) {
            t.campo3.setStyle("-fx-background-color: green");
            t.campo5.setStyle("-fx-background-color: green");
            t.campo7.setStyle("-fx-background-color: green");
            t.campo1.setDisable(true);
            t.campo2.setDisable(true);
            t.campo4.setDisable(true);
            t.campo6.setDisable(true);
            t.campo8.setDisable(true);
            t.campo9.setDisable(true);
            vencedor = "O";
            t.placar(vencedor);
        }

        else if ((t.campo1.getText().equals("O") || t.campo1.getText().equals("X"))
                && (t.campo2.getText().equals("O") || t.campo2.getText().equals("X"))
                && (t.campo3.getText().equals("O") || t.campo3.getText().equals("X"))
                && (t.campo4.getText().equals("O") || t.campo4.getText().equals("X"))
                && (t.campo5.getText().equals("O") || t.campo5.getText().equals("X"))
                && (t.campo6.getText().equals("O") || t.campo6.getText().equals("X"))
                && (t.campo7.getText().equals("O") || t.campo7.getText().equals("X"))
                && (t.campo8.getText().equals("O") || t.campo8.getText().equals("X"))
                && (t.campo9.getText().equals("O") || t.campo9.getText().equals("X"))) {
            vencedor = "V";
            t.placar(vencedor);
        }
    }
}