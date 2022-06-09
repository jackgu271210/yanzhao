$(document).ready(function() {
    $('table #editButton').on('click',function(event) {
        event.preventDefault();
        var myModal = new bootstrap.Modal(document.getElementById('editModal'), {
            keyboard: false
        });
        var href = $(this).attr('href');
        $.get(href,function(state,status) {
            $('#idEdit').val(state.id);
            $('#selectCountryEdit').val(state.countryid);
            $('#nameEdit').val(state.name);
            $('#codeEdit').val(state.code);
            $('#capitalEdit').val(state.capital);
            $('#detailsEdit').val(state.details);
        });
        myModal.show();
    });

    $('table #detailsButton').on('click',function(event) {
        event.preventDefault();
        var myModal = new bootstrap.Modal(document.getElementById('detailsModal'), {
            keyboard: false
        });
        var href = $(this).attr('href');
        $.get(href,function(state,status) {
            $('#idDetails').val(state.id);
            $('#countryDetails').val(state.countryid);
            $('#nameDetails').val(state.name);
            $('#codeDetails').val(state.code);
            $('#capitalDetails').val(state.capital);
            $('#details').val(state.details);
            $('#lastModifiedByDetails').val(state.lastModifiedBy);
            $('#lastModifiedDateDetails').val(state.lastModifiedDate);
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