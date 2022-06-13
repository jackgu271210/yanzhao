$(document).ready(function() {
    $('table #editButton').on('click',function(event) {
        event.preventDefault();
        var myModal = new bootstrap.Modal(document.getElementById('editModal'), {
            keyboard: false
        });
        var href = $(this).attr('href');
        $.get(href,function(client,status) {
            $('#idEdit').val(client.id);
            $('#nameEdit').val(client.name);
            $('#detailsEdit').val(client.details);
            $('#websiteEdit').val(client.website);
            $('#addressEdit').val(client.address);
            $('#emailEdit').val(client.email);
            $('#selectStateEdit').val(client.stateid);
            $('#selectCountryEdit').val(client.countryid);
            $('#cityEdit').val(client.city);
            $('#phoneEdit').val(client.phone);
            $('#mobileEdit').val(client.mobile);
        });
        myModal.show();
    });

    $('table #detailsButton').on('click',function(event) {
        event.preventDefault();
        var myModal = new bootstrap.Modal(document.getElementById('detailsModal'), {
            keyboard: false
        });
        var href = $(this).attr('href');
        $.get(href,function(client,status) {
            $('#idDetails').val(client.id);
            $('#nameDetails').val(client.name);
            $('#details').val(client.details);
            $('#websiteDetails').val(client.website);
            $('#addressDetails').val(client.address);
            $('#emailDetails').val(client.email);
            $('#selectStateDetails').val(client.stateid);
            $('#selectCountryDetails').val(client.countryid);
            $('#cityDetails').val(client.city);
            $('#phoneDetails').val(client.phone);
            $('#mobileDetails').val(client.mobile);
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