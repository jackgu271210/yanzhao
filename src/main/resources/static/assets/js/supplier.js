$(document).ready(function() {
    $('table #editButton').on('click',function(event) {
        event.preventDefault();
        var myModal = new bootstrap.Modal(document.getElementById('editModal'), {
            keyboard: false
        });
        var href = $(this).attr('href');
        $.get(href,function(supplier,status) {
            $('#idEdit').val(supplier.id);
            $('#nameEdit').val(supplier.name);
            $('#detailsEdit').val(supplier.details);
            $('#websiteEdit').val(supplier.website);
            $('#addressEdit').val(supplier.address);
            $('#emailEdit').val(supplier.email);
            $('#selectStateEdit').val(supplier.stateid);
            $('#selectCountryEdit').val(supplier.countryid);
            $('#cityEdit').val(supplier.city);
            $('#phoneEdit').val(supplier.phone);
            $('#mobileEdit').val(supplier.mobile);
        });
        myModal.show();
    });

    $('table #detailsButton').on('click',function(event) {
        event.preventDefault();
        var myModal = new bootstrap.Modal(document.getElementById('detailsModal'), {
            keyboard: false
        });
        var href = $(this).attr('href');
        $.get(href,function(supplier,status) {
            $('#idDetails').val(supplier.id);
            $('#nameDetails').val(supplier.name);
            $('#details').val(supplier.details);
            $('#websiteDetails').val(supplier.website);
            $('#addressDetails').val(supplier.address);
            $('#emailDetails').val(supplier.email);
            $('#selectStateDetails').val(supplier.stateid);
            $('#selectCountryDetails').val(supplier.countryid);
            $('#cityDetails').val(supplier.city);
            $('#phoneDetails').val(supplier.phone);
            $('#mobileDetails').val(supplier.mobile);
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