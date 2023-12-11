import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Regiao;
import entities.Rota;
import entities.RotasPorPonto;
import mocks.MockFactory;

@WebServlet("/itinerarios")
public class ItinerariosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
        Long idRegiao = Long.valueOf(request.getParameter("id"));
        List<Regiao> regioes = MockFactory.createAll();
        for (int i = 0; i < regioes.size(); i++){
            if (regioes.get(i).getId() == idRegiao){
                Regiao regiao = regioes.get(i);
                List<RotasPorPonto> rotasPorPonto = regiao.getRotasPorPonto();

                // Gera o cabeçalho da tabela
                out.println("<table class='pontos'>");
                out.println("<tr>");
                out.println("<th>Ponto de parada</th>");
                out.println("<th>Rotas</th>");
                out.println("</tr>");

                // Para cada ponto, cria-se uma nova linha na tabela
                for (int j = 0; j < rotasPorPonto.size(); j++){
                    out.println("<tr>");
                    out.println("<td>" + rotasPorPonto.get(j).getPonto().getNome() + "</td>"); // Nome do ponto de parada
                    List<Rota> rotas = rotasPorPonto.get(j).getRotas();
                    String nomesRotas = rotas.stream().map(Rota::getNome).collect(Collectors.joining(",")); // Nome dos onibus/rotas separados por vírgula
                    out.println("<td>" + nomesRotas + "</td>"); // Printa os onibus separados por vírgula
                }
                out.println("<tr>");
                out.println("</table>");
                return;
            }
        }

        out.println("região não encontrada");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
