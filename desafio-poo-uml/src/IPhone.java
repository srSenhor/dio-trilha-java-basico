import java.util.List;

import utils.AgendaTelefonica;
import utils.NavegadorInternet;
import utils.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, NavegadorInternet, AgendaTelefonica {

    private String modelo;
    private int armazenamento;
    private int bateria;
    private List<String> idiomasSuportados;
    private String operadora;
    
    public IPhone(String modelo, int armazenamento, int bateria, List<String> idiomasSuportados, String operadora) {
        this.modelo = modelo;
        this.armazenamento = armazenamento;
        this.bateria = bateria;
        this.idiomasSuportados = idiomasSuportados;
        this.operadora = operadora;
    }

    public int getBateria() {
        return bateria;
    }

    public List<String> getIdiomasSuportados() {
        return idiomasSuportados;
    }
    public void setIdiomasSuportados(List<String> idiomasSuportados) {
        this.idiomasSuportados = idiomasSuportados;
    }
    
    public String getOperadora() {
        return operadora;
    }
    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Realizando ligacao para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligacao...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Acessando pagina em " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina do navegador...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica " + musica);
    }
    
}
