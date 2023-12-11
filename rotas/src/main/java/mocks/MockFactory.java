package mocks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import entities.PontoParada;
import entities.Regiao;
import entities.Rota;
import entities.RotasPorPonto;

public class MockFactory {
    public static List<Regiao> createAll(){
        // Criação de pontos
        PontoParada p1 = new PontoParada(1L, "Posto 1");
        PontoParada p2 = new PontoParada(2L, "Posto 2");
        PontoParada p3 = new PontoParada(3L, "Alagoas");
        PontoParada p4 = new PontoParada(4L, "Cabresto");
        PontoParada p5 = new PontoParada(5L, "Confisco");
        PontoParada p6 = new PontoParada(6L, "Telhas");
        PontoParada p7 = new PontoParada(7L, "Oswaldo");
        PontoParada p8 = new PontoParada(8L, "Comissarios");
        List<PontoParada> pontos = new ArrayList<>();
        pontos.addAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8));

        // Criação de rotas
        Rota r1 = new Rota(1L, "21", "Campo Grande", "Canavieiras", false, false, true);
        Rota r2 = new Rota(2L, "25", "Floripa", "Vila Cortinas", true, true, true);
        Rota r3 = new Rota(3L, "33", "Passos", "Canavieiras", false, false, true);
        Rota r4 = new Rota(4L, "111", "Trambique", "Campo Grande", false, true, true);
        Rota r5 = new Rota(5L, "22", "Lagos", "Lages", true, false, true);
        Rota r6 = new Rota(6L, "12", "Lages", "Floripa", true, true, true);
        Rota r7 = new Rota(7L, "54", "Sao Fidelis", "Guarucar", true, false, true);
        Rota r8 = new Rota(8L, "81", "Ponte Preta", "Ferroviaria", false, false, true);
        List<Rota> rotas = new ArrayList<>();
        rotas.addAll(Arrays.asList(r1, r2, r3, r4, r5, r6, r7, r8));

        // Rotas por ponto para regiao 1
        RotasPorPonto rp1 = new RotasPorPonto(p1, Arrays.asList(r1, r3, r4, r7));
        RotasPorPonto rp2 = new RotasPorPonto(p2, Arrays.asList(r2, r6, r4, r8, r1, r3));
        RotasPorPonto rp3 = new RotasPorPonto(p3, Arrays.asList(r3, r6, r7, r5));
        List<RotasPorPonto> rotasPorPonto1 = new ArrayList<>();
        rotasPorPonto1.addAll(Arrays.asList(rp1, rp2, rp3));

        // Rotas por ponto para regiao 2
        RotasPorPonto rp4 = new RotasPorPonto(p4, Arrays.asList(r4, r1, r2));
        RotasPorPonto rp5 = new RotasPorPonto(p5, Arrays.asList(r5, r6));
        RotasPorPonto rp6 = new RotasPorPonto(p6, Arrays.asList(r6, r5, r4));
        List<RotasPorPonto> rotasPorPonto2 = new ArrayList<>();
        rotasPorPonto2.addAll(Arrays.asList(rp4, rp5, rp6));

        // Rotas por ponto para região 3
        RotasPorPonto rp7 = new RotasPorPonto(p7, Arrays.asList(r7, r2, r3, r4, r5, r8));
        RotasPorPonto rp8 = new RotasPorPonto(p8, Arrays.asList(r8, r7, r3, r5));
        List<RotasPorPonto> rotasPorPonto3 = new ArrayList<>();
        rotasPorPonto3.addAll(Arrays.asList(rp7, rp8));

        Regiao regiao1 = new Regiao(1L, "Consagracao", pontos, rotasPorPonto1);
        Regiao regiao2 = new Regiao(2L, "Nova Hortolandia", pontos, rotasPorPonto2);
        Regiao regiao3 = new Regiao(3L, "Brapil", pontos, rotasPorPonto3);

        List<Regiao> regioes = new ArrayList<>();
        regioes.addAll(Arrays.asList(regiao1, regiao2, regiao3));

        return regioes;
    }
}
