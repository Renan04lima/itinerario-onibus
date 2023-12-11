package entities;

import java.util.List;

public class Regiao {
    private Long id;
    private String nome;
    private List<PontoParada> pontos; // Pontos por padrão da região
    private List<RotasPorPonto> rotasPorPonto; // Array que contém uma lista de objetos representando os onibus que passam em um determinado ponto

    public Regiao(Long id, String nome, List<PontoParada> pontos, List<RotasPorPonto> rotasPorPonto) {
        this.id = id;
        this.nome = nome;
        this.pontos = pontos;
        this.rotasPorPonto = rotasPorPonto;
    }

    public Long getId() {
        return id;
    }

    public List<RotasPorPonto> getRotasPorPonto() {
        return rotasPorPonto;
    }

    public List<PontoParada> getPontos() {
        return pontos;
    }

    
}
