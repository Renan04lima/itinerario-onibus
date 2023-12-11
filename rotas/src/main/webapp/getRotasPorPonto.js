$(document).ready(function() {
    $('#buscarRegiao').on('click', () => {
        const url = "http://localhost:8080/rotas/itinerarios"
        $.ajax({
            type: "GET",
            url: url,
            contentType: "application/x-www-form-urlencoded",
            data: {id: $( "#regioesSelect option:selected" ).val()}, // #regioesSelect option:selected -> seletor para a opção selecionada dentro da div #regioesSelect
            success: function(data, textStatus, jqXHR) {
                $("#pontosResultantes").html(data);
            },
            error: function(XMLHTTPRequest, textStatus, error) {
                console.error(error);
            }
        })
    });
})

function buscaParadasDisponiveisPorRegiao(regiaoId){
    const url = "http://localhost:8080/rotas/paradas"
    $.ajax({
        type: "GET",
        url: url,
        contentType: "application/json",
        data: {regiaoId: regiaoId}, // coloquei 1 como exemplo de ID de região para buscar
        success: function(data, textStatus, jqXHR) {
            console.log(data); // todas as paradas disponíveis para uma determinada região estão em data
        },
        error: function(XMLHTTPRequest, textStatus, error) {
            console.error(error);
        }
    })
}