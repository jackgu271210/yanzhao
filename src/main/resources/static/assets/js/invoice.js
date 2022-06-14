$(document).ready(function() {
    $('table #editButton').on('click',function(event) {
        event.preventDefault();
        var myModal = new bootstrap.Modal(document.getElementById('editModal'), {
            keyboard: false
        });
        var href = $(this).attr('href');
        $.get(href,function(invoice,status) {
            $('#idEdit').val(invoice.id);
            $('#selectClientEdit').val(invoice.clientid);
            var invoiceDate = invoice.invoiceDate.substr(0,10);
            $('#invoiceDateEdit').val(invoiceDate);
            $('#selectInvoiceStatusEdit').val(invoice.invoicestatusid);
            $('#remarksEdit').val(invoice.remarks);
        });
        myModal.show();
    });

    $('table #detailsButton').on('click',function(event) {
        event.preventDefault();
        var myModal = new bootstrap.Modal(document.getElementById('detailsModal'), {
            keyboard: false
        });
        var href = $(this).attr('href');
        $.get(href,function(invoice,status) {
            $('#idDetails').val(invoice.id);
            $('#selectClientDetails').val(invoice.clientid);
            var invoiceDate = invoice.invoiceDate.substr(0,10);
            $('#invoiceDateDetails').val(invoiceDate);
            $('#selectInvoiceStatusDetails').val(invoice.invoicestatusid);
            $('#remarksDetails').val(invoice.remarks);
            $('#lastModifiedByDetails').val(invoice.lastModifiedBy);
            $('#lastModifiedDateDetails').val(invoice.lastModifiedDate);
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