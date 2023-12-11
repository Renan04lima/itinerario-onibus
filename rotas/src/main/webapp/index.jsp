<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
    <title>ÔnibusConecta</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="./styles/menu.css">
    <link rel="stylesheet" href="./styles/card.css">
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
        <h1>Rotas mais utilizadas</h1>

        <div class="card">
            <h1>Rota X</h1>
            <div class="subtitles">
                <p>Origem:</p>
                <p>Destino:</p>
            </div>
            <div class="card-footer">
                <div class="icons">
                    <i class="fas fa-wheelchair"></i>
                    <i class="fas fa-wifi"></i>
                    <i class="fas fa-snowflake"></i>
                    <i class="fas fa-tv"></i>
                </div>
                <div class="chip">Região A</div>
            </div>
        </div>
    </div>

</body>

</html>
