package funcionalidades;

public class Iphone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical{

    
    public void tocar() {
        System.out.println("Tocando via iphone");
    }

    
    public void pausar() { 
        System.out.println("Pausando via iphone");
    }

    
    public void selecionarMusica() {
        System.out.println("Selecionando via iphone");
    }

    
    public void exibirPagina() {  
        System.out.println("Exibindo pagina via iphone");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba via iphone");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando pagina via iphone");
    }

    public void ligar() {
        System.out.println("ligando para pessoa via iphone");
    }

    public void atender() {
        System.out.println("Atendendo a pessoa via iphone");
    }

    public void iniciarCorreidoVoz() {
        System.out.println("Iniciando correio de voz via iphone");
    }
    
}
