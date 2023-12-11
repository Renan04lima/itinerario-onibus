<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Exemplo para puxar rotas</title>
    <script src="jquery-3.7.1.min.js"></script>
    <script src="getRotasPorPonto.js"></script>
</head>
<body>
    <label for="regioes">Escolha a região</label>

    <select name="regioes" id="regioesSelect">
      <option value="1">Consagração</option>
      <option value="2">Nova Hortolandia</option>
      <option value="3">Brapil</option>
    </select>
    <button id="buscarRegiao">
        Buscar
    </button>

    <div id="pontosResultantes">

    </div>
</body>
</html>