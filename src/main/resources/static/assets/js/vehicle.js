$(document).ready(function() {
    $('table #editButton').on('click',function(event) {
        event.preventDefault();
        var myModal = new bootstrap.Modal(document.getElementById('editModal'), {
            keyboard: false
        });
        var href = $(this).attr('href');
        $.get(href,function(vehicle,status) {
            var acDate = vehicle.acquisitionDate.substr(0,10);
            $('#acquisitionDateEdit').val(acDate);
            $('#descriptionEdit').val(vehicle.description);
            $('#selectEmployeeEdit').val(vehicle.employeeid);
            $('#fuelCapacityEdit').val(vehicle.fuelCapacity);
            $('#idEdit').val(vehicle.id);
            $('#selectLocationEdit').val(vehicle.locationid);
            $('#nameEdit').val(vehicle.name);
            $('#netWeightEdit').val(vehicle.netWeight);
            $('#powerEdit').val(vehicle.power);
            
            var regDate = vehicle.registrationDate.substr(0,10);
            $('#registrationDateEdit').val(regDate);
            $('#remarksEdit').vak(vehicle.remarks);
            $('#selectVehicleMakeEdit').val(vehicle.vehiclemakeid);
            $('#selectVehicleModelEdit').val(vehicle.vehiclemodelid);
            $('#vehicleNumberEdit').val(vehicle.vehicleNumber);
            $('#selectVehicleStatusEdit').val(vehicle.vehiclestatusid);
            $('#selectVehicleTypeEdit').val(vehicle.vehicletypeid);
        });
        myModal.show();
    });

    $('table #detailsButton').on('click',function(event) {
        event.preventDefault();
        var myModal = new bootstrap.Modal(document.getElementById('detailsModal'), {
            keyboard: false
        });
        var href = $(this).attr('href');
        $.get(href,function(vehicle,status) {
            var acDate = vehicle.acquisitionDate.substr(0,10);
            $('#acquisitionDateDetails').val(acDate);
            $('#descriptionDetails').val(vehicle.description);
            $('#selectEmployeeDetails').val(vehicle.employeeid);
            $('#fuelCapacityDetails').val(vehicle.fuelCapacity);
            $('#idDetails').val(vehicle.id);
            $('#selectLocationDetails').val(vehicle.locationid);
            $('#nameDetails').val(vehicle.name);
            $('#netWeightDetails').val(vehicle.netWeight);
            $('#powerDetails').val(vehicle.power);

            var regDate = vehicle.registrationDate.substr(0,10);
            $('#registrationDateDetails').val(regDate);
            $('#remarksDetails').vak(vehicle.remarks);
            $('#selectVehicleMakeDetails').val(vehicle.vehiclemakeid);
            $('#selectVehicleModelDetails').val(vehicle.vehiclemodelid);
            $('#vehicleNumberDetails').val(vehicle.vehicleNumber);
            $('#selectVehicleStatusDetails').val(vehicle.vehiclestatusid);
            $('#selectVehicleTypeDetails').val(vehicle.vehicletypeid);
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