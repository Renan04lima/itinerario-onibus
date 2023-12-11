<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
    <title>Cadastro</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="../styles/menu.css">
    <link rel="stylesheet" href="../styles/cadastro.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">
    <style>

    </style>
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
        <h1>Rotas - Cadastro de item</h1>

        <div class="route-container">
            <div class="outlined-input-container">
                <input type="text" class="outlined-input" id="outlinedInput" placeholder=" ">
                <label for="outlinedInput" class="input-label">Nome da Rota</label>
            </div>

            <div class="origin-destination-inputs">
                <div class="outlined-input-container">
                    <input type="text" class="outlined-input" id="outlinedInput" placeholder=" ">
                    <label for="outlinedInput" class="input-label">Origem</label>
                </div>

                <div class="outlined-input-container">
                    <input type="text" class="outlined-input" id="outlinedInput" placeholder=" ">
                    <label for="outlinedInput" class="input-label">Destino</label>
                </div>
            </div>
        </div>

        <div class="bus-resources">
            <p>Recursos do ônibus</p>
            <div class="input-ratio-container">
                <input type="checkbox" class="input-ratio">
                <label for="inputRatio">Interner - wifi</label>
            </div>

            <div class="input-ratio-container">
                <input type="checkbox" class="input-ratio">
                <label for="inputRatio">Acessibilidade</label>
            </div>

            <div class="input-ratio-container">
                <input type="checkbox" class="input-ratio">
                <label for="inputRatio">Carregamento USB</label>
            </div>

            <div class="input-ratio-container">
                <input type="checkbox" class="input-ratio">
                <label for="inputRatio">Ar Condicionado</label>
            </div>
        </div>


        <div class="add-region-container">
            <p>Região e Paradas</p>
            <select class="styled-dropdown">
                <option value="region1">Region 1</option>
                <option value="region2">Region 2</option>
                <option value="region3">Region 3</option>
            </select>

            <button id="new-button">
                Adicionar Região
            </button>
        </div>

        <div class="regions-container">
            <div class="region">
                <h3>Região A</h3>
                <div class="stop-container">
                    <select class="styled-dropdown">
                        <option value="stop1">Stop 1</option>
                        <option value="stop2">Stop 2</option>
                    </select>
    
                    <select class="styled-dropdown">
                        <option value="stop1">Stop 1</option>
                        <option value="stop2">Stop 2</option>
                    </select>
    
                
                </div>
                <button id="new-button">Nova parada</button>
            </div>
        </div>
    </div>

</body>

</html>