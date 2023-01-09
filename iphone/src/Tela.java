import funcionalidades.Iphone;
import funcionalidades.NavegadorNaInternet;

public class Tela {
    public static void main(String[] args) throws Exception {
        NavegadorNaInternet telefone = new Iphone();

        telefone.atualizarPagina();

    }
}
