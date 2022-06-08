$(document).ready(function() {
    $('table #editButton').on('click',function(event) {
        event.preventDefault();
        var myModal = new bootstrap.Modal(document.getElementById('editModal'), {
            keyboard: false
        });
        var href = $(this).attr('href');
        $.get(href,function(state,status) {
            $('#idEdit').val(state.id);
            $('#descriptionEdit').val(state.description);
            $('#capitalEdit').val(state.capital);
            $('#codeEdit').val(state.code);
            $('#continentEdit').val(state.continent);
            $('#nationalityEdit').val(state.nationality);
        });
        myModal.show();
    });
    
    $('table #deleteButton').on('click',function(event) {
        event.preventDefault();
        var deleteModal = new bootstrap.Modal(document.getElementById('deleteModal'), {
            keyboard: false
        });
        var href = $(this).attr('href');
        $('#confirmDeleteButton').attr('href',href);
        deleteModal.show();
    })
    
    
})