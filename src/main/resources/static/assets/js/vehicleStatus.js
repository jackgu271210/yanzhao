$(document).ready(function() {
    $('table #editButton').on('click',function(event) {
        event.preventDefault();
        var myModal = new bootstrap.Modal(document.getElementById('editModal'), {
            keyboard: false
        });
        var href = $(this).attr('href');
        $.get(href,function(vehicleStatus,status) {
            $('#idEdit').val(vehicleStatus.id);
            $('#descriptionEdit').val(vehicleStatus.description);
            $('#detailsEdit').val(vehicleStatus.details);
        });
        myModal.show();
    });

    $('table #detailsButton').on('click',function(event) {
        event.preventDefault();
        var myModal = new bootstrap.Modal(document.getElementById('detailsModal'), {
            keyboard: false
        });
        var href = $(this).attr('href');
        $.get(href,function(vehicleStatus,status) {
            $('#idDetails').val(vehicleStatus.id);
            $('#descriptionDetails').val(vehicleStatus.description);
            $('#lastModifiedByDetails').val(vehicleStatus.lastModifiedBy);
            $('#lastModifiedDateDetails').val(vehicleStatus.lastModifiedDate);
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