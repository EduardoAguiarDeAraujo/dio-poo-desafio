package dio;

public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    @Override
    public void ligar() {
        System.out.println("Fazendo uma ligação");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo uma ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando um correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo uma página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Nova Aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }


    @Override
    public void tocar() {
        System.out.println("Tocando uma música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando uma música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando uma música");
    }
}
