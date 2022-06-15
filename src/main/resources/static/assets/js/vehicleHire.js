$(document).ready(function() {
    $('table #editButton').on('click',function(event) {
        event.preventDefault();
        var myModal = new bootstrap.Modal(document.getElementById('editModal'), {
            keyboard: false
        });
        var href = $(this).attr('href');
        $.get(href,function(vehicleHire,status) {
            $('#idEdit').val(vehicleHire.id);
            $('#selectClientEdit').val(vehicleHire.clientid);
            
            var dateIn = vehicleHire.dateIn.substr(0,10);
            var dateOut = vehiclehire.dateOut.substr(0,10);
            $('#dateInEdit').val(dateIn);
            $('#dateOutEdit').val(dateOut);
            
            $('#selectLocationEdit').val(vehicleHire.locationid);
            $('#priceEdit').val(vehicleHire.price);
            $('#remarksEdit').val(vehicleHire.remarks);
            $('#selectVehicleEdit').val(vehicleHire.vehicleid);
        });
        myModal.show();
    });

    $('table #detailsButton').on('click',function(event) {
        event.preventDefault();
        var myModal = new bootstrap.Modal(document.getElementById('detailsModal'), {
            keyboard: false
        });
        var href = $(this).attr('href');
        $.get(href,function(vehicleHire,status) {
            $('#idDetails').val(vehicleHire.id);
            $('#selectClientDetails').val(vehicleHire.clientid);

            var dateIn = vehicleHire.dateIn.substr(0,10);
            var dateOut = vehiclehire.dateOut.substr(0,10);
            $('#dateInDetails').val(dateIn);
            $('#dateOutDetails').val(dateOut);

            $('#selectLocationDetails').val(vehicleHire.locationid);
            $('#priceDetails').val(vehicleHire.price);
            $('#remarksDetails').val(vehicleHire.remarks);
            $('#selectVehicleDetails').val(vehicleHire.vehicleid);
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