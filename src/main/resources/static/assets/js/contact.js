$(document).ready(function() {
    $('table #editButton').on('click',function(event) {
        event.preventDefault();
        var myModal = new bootstrap.Modal(document.getElementById('editModal'), {
            keyboard: false
        });
        var href = $(this).attr('href');
        $.get(href,function(contact,status) {
            $('#idEdit').val(contact.id);
            $('#emailEdit').val(contact.email);
            $('#firstNameEdit').val(contact.firstname);
            $('#lastNameEdit').val(contact.lastname);
            $('#mobileEdit').val(contact.mobile);
            $('#phoneEdit').val(contact.phone);
            $('#remarksEdit').val(contact.remarks);
        });
        myModal.show();
    });

    $('table #detailsButton').on('click',function(event) {
        event.preventDefault();
        var myModal = new bootstrap.Modal(document.getElementById('detailsModal'), {
            keyboard: false
        });
        var href = $(this).attr('href');
        $.get(href,function(contact,status) {
            $('#idDetails').val(contact.id);
            $('#emailDetails').val(contact.email);
            $('#firstNameDetails').val(contact.firstname);
            $('#lastNameDetails').val(contact.lastname);
            $('#mobileDetails').val(contact.mobile);
            $('#phoneDetails').val(contact.phone);
            $('#remarksDetails').val(contact.remarks);
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