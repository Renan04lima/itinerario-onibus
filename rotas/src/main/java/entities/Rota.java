package entities;

public class Rota {
    private Long id;
    private String nome;
    private String origem;
    private String destino;
    private boolean internet;
    private boolean acessibilidade;
    private boolean arCondicionado;

    public Rota(Long id, String nome, String origem, String destino, boolean internet, boolean acessibilidade,
            boolean arCondicionado) {
        this.id = id;
        this.nome = nome;
        this.origem = origem;
        this.destino = destino;
        this.internet = internet;
        this.acessibilidade = acessibilidade;
        this.arCondicionado = arCondicionado;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    
}
