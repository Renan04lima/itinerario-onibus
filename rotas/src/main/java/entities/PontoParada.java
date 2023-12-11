package entities;

public class PontoParada {
    private Long id;
    private String nome;

    public PontoParada(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    
}
