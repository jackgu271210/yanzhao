$(document).ready(function() {
    $('table #editButton').on('click',function(event) {
        event.preventDefault();
        var myModal = new bootstrap.Modal(document.getElementById('editModal'), {
            keyboard: false
        });
        var href = $(this).attr('href');
        $.get(href,function(vehicleMovement,status) {
            $('#idEdit').val(vehicleMovement.id);
            $('#selectVehicleEdit').val(vehicleMovement.vehicleid);
            $('#selectLocation1Edit').val(vehicleMovement.locationid1);
            $('#selectLocation2Edit').val(vehicleMovement.locationid2);
            
            var date1 = vehicleMovement.date1.substr(0,10);
            var date2 = vehicleMovement.date2.substr(0,10);
            $('#date1Edit').val(date1);
            $('#date2Edit').val(date2);
            $('#remarksEdit').val(vehicleMovement.remarks);
        });
        myModal.show();
    });

    $('table #detailsButton').on('click',function(event) {
        event.preventDefault();
        var myModal = new bootstrap.Modal(document.getElementById('detailsModal'), {
            keyboard: false
        });
        var href = $(this).attr('href');
        $.get(href,function(vehicleMovement,status) {
            $('#idDetails').val(vehicleMovement.id);
            $('#selectVehicleDetails').val(vehicleMovement.vehicleid);
            $('#selectLocation1Details').val(vehicleMovement.locationid1);
            $('#selectLocation2Details').val(vehicleMovement.locationid2);

            var date1 = vehicleMovement.date1.substr(0,10);
            var date2 = vehicleMovement.date2.substr(0,10);
            $('#date1Details').val(date1);
            $('#date2Details').val(date2);
            $('#remarksDetails').val(vehicleMovement.remarks);
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