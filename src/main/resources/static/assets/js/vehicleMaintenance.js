$(document).ready(function() {
    $('table #editButton').on('click',function(event) {
        event.preventDefault();
        var myModal = new bootstrap.Modal(document.getElementById('editModal'), {
            keyboard: false
        });
        var href = $(this).attr('href');
        $.get(href,function(vehicleMaintenance,status) {
            $('#idEdit').val(vehicleMaintenance.id);
            $('#priceEdit').val(vehicleMaintenance.price);
            $('#remarksEdit').val(vehicleMaintenance.remarks);
            $('#selectSupplierEdit').val(vehicleMaintenance.supplierid);
            $('#selectVehicleEdit').val(vehicleMaintenance.vehicleid);
            
            // Create a date variable and extract only the date part of the field
            var startDate = vehicleMaintenance.startDate.substr(0,10);
            var endDate = vehicleMaintenance.endDate.substr(0,10);
            
            $('#startDateEdit').val(startDate);
            $('#endDateEdit').val(endDate);
        });
        myModal.show();
    });

    $('table #detailsButton').on('click',function(event) {
        event.preventDefault();
        var myModal = new bootstrap.Modal(document.getElementById('detailsModal'), {
            keyboard: false
        });
        var href = $(this).attr('href');
        $.get(href,function(vehicleMaintenance,status) {
            $('#idDetails').val(vehicleMaintenance.id);
            $('#priceDetails').val(vehicleMaintenance.price);
            $('#remarksDetails').val(vehicleMaintenance.remarks);
            $('#selectSupplierDetails').val(vehicleMaintenance.supplierid);
            $('#selectVehicleDetails').val(vehicleMaintenance.vehicleid);
            
            var startDate = vehicleMaintenance.startDate.substr(0,10);
            var endDate = vehicleMaintenance.endDate.substr(0,10);
            
            $('#startDateDetails').val(startDate);
            $('#endDateDetails').val(endDate);
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