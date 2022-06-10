$(document).ready(function() {
    $('table #editButton').on('click',function(event) {
        event.preventDefault();
        var myModal = new bootstrap.Modal(document.getElementById('editModal'), {
            keyboard: false
        });
        var href = $(this).attr('href');
        $.get(href,function(location,status) {
            $('#idEdit').val(location.id);
            $('#cityEdit').val(location.city);
            $('#addressEdit').val(location.address);
            $('#selectCountryEdit').val(location.countryid);
            $('#selectStateEdit').val(location.stateid);
            $('#descriptionEdit').val(location.description);
            $('#detailsEdit').val(location.details);
        });
        myModal.show();
    });

    $('table #detailsButton').on('click',function(event) {
        event.preventDefault();
        var myModal = new bootstrap.Modal(document.getElementById('detailsModal'), {
            keyboard: false
        });
        var href = $(this).attr('href');
        $.get(href,function(location,status) {
            $('#idDetails').val(location.id);
            $('#descriptionDetails').val(location.description);
            $('#cityDetails').val(location.city);
            $('#addressDetails').val(location.address);
            $('#countryDetails').val(location.countryid);
            $('#stateDetails').val(location.stateid);
            $('#lastModifiedByDetails').val(location.lastModifiedBy);
            $('#lastModifiedDateDetails').val(location.lastModifiedDate);
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