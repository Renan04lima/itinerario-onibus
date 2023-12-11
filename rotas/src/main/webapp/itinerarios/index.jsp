<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
    <title>Itinerarios</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="../styles/menu.css">
    <link rel="stylesheet" href="../styles/itinerarios.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">
    <script src="jquery-3.7.1.min.js"></script>
    <script src="getRotasPorPonto.js"></script>
</head>

<body>

    <div id="side-menu">
        <a href="/rotas/">Home</a>
        <a class="has-submenu" href="/rotas/">Rotas</a>
        <div class="submenu">
            <a href="/rotas/itinerarios/">Itinerários</a>
            <a href="/rotas/cadastro/">Cadastro de Itinerários</a>
        </div>
        <a href="/rotas/tarifas">Tarifas e bilhetes</a>
        <a href="#">Nossos veículos</a>
        <a href="#">Contato & Suporte</a>
        <div id="footer">
            <p class="title">ÔnibusConecta</p>
            <p class="subtitle">Desenvolvido por: Jean W., Marcus V. e Renan O.</p>
        </div>
    </div>

    <div id="container">
        <h1>Rotas - Itinerário</h1>

        <div id="search-container">
            <select id="regioes-select">
                <option value="1L">Consagracao</option>
                <option value="2L">Nova Hortolandia</option>
                <option value="3L">Brapil</option>
            </select>
            <button id="buscarRegiao">Buscar</button>
        </div>

        <div id="pontosResultantes">

        </div>
        <!-- <table>
            <thead>
                <tr>
                    <th>Ponto de parada</th>
                    <th>Rotas</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Stop 1</td>
                    <td>Route A, Route B</td>
                </tr>
                <tr>
                    <td>Stop 2</td>
                    <td>Route C, Route D</td>
                </tr>
            </tbody>
        </table> -->


    </div>

</body>

</html>