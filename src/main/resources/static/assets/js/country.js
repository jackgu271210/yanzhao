$(document).ready(function() {
    $('#editButton').on('click',function(event) {
        // console.log('sussess');
        // $('#editModal').modal();
        var href = $(this).attr('href');
        $.get(href,function(country,status) {
            $('#idEdit').val(country.id);
            $('#descriptionEdit').val(country.description);
            $('#capitalEdit').val(country.capital);
            $('#codeEdit').val(country.code);
            $('#continentEdit').val(country.continent);
            $('#nationalityEdit').val(country.nationality);
        });
        $('#editModal').modal();
    })
})