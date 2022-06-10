$(document).ready(function() {
    $('table #editButton').on('click',function(event) {
        event.preventDefault();
        var myModal = new bootstrap.Modal(document.getElementById('editModal'), {
            keyboard: false
        });
        var href = $(this).attr('href');
        $.get(href,function(vehicleMake,status) {
            $('#idEdit').val(vehicleMake.id);
            $('#descriptionEdit').val(vehicleMake.description);
            $('#detailsEdit').val(vehicleMake.details);
        });
        myModal.show();
    });

    $('table #detailsButton').on('click',function(event) {
        event.preventDefault();
        var myModal = new bootstrap.Modal(document.getElementById('detailsModal'), {
            keyboard: false
        });
        var href = $(this).attr('href');
        $.get(href,function(vehicleMake,status) {
            $('#idDetails').val(vehicleMake.id);
            $('#descriptionDetails').val(vehicleMake.description);
            $('#lastModifiedByDetails').val(vehicleMake.lastModifiedBy);
            $('#lastModifiedDateDetails').val(vehicleMake.lastModifiedDate);
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