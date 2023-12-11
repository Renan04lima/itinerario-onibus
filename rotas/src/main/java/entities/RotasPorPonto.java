package entities;

import java.util.List;

// Entidade para salvar quais as rotas(onibus) que tem em um ponto de parada
public class RotasPorPonto {
    private PontoParada ponto;
    private List<Rota> rotas;

    public RotasPorPonto(PontoParada ponto, List<Rota> rotas) {
        this.ponto = ponto;
        this.rotas = rotas;
    }

    public PontoParada getPonto() {
        return ponto;
    }

    public List<Rota> getRotas() {
        return rotas;
    }

    
}
