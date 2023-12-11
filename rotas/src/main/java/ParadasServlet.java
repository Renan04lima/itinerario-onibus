import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.PontoParada;
import entities.Regiao;
import mocks.MockFactory;

@WebServlet("/paradas")
public class ParadasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
        Long idRegiao = Long.valueOf(request.getParameter("regiaoId"));
        List<Regiao> regioes = MockFactory.createAll();
        for (int i = 0; i < regioes.size(); i++){
            if (regioes.get(i).getId() == idRegiao){
                response.setContentType("application/json");
                List<PontoParada> pontos = regioes.get(i).getPontos();
                out.println("[");
                for (int j = 0; j < pontos.size() - 1; j++){
                    /*
                     * Cria um objeto JSON para indicar o ponto de parada no formato
                     * {
                     *  "id": ID_DO_PONTO,
                     *  "nome": "NOME_DO_PONTO"
                     * }
                     */
                    out.println("{");
                    out.println("\"id\": " + pontos.get(j).getId() + ", \"nome\": \"" + pontos.get(j).getNome() + "\"");
                    out.println("},");
                }

                // Para o ultimo ponto de parada, não insere a vírgula
                out.println("{");
                out.println("\"id\": " + pontos.get(pontos.size()-1).getId() + ", \"nome\": \"" + pontos.get(pontos.size()-1).getNome() + "\"");
                out.println("}");
                out.println("]");
                return;
            }
        }
        out.println("região não encontrada");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
