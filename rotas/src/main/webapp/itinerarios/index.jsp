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
    <style>

    </style>
</head>

<body>

    <div id="side-menu">
        <a href="/rotas/">Home</a>
        <a href="/rotas/itinerarios/">Rotas</a>
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
            <select id="region-dropdown">
                <option value="region1">Region 1</option>
                <option value="region2">Region 2</option>
            </select>
            <button id="search-button">Buscar</button>
        </div>

        <table>
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
        </table>


    </div>

</body>

</html>