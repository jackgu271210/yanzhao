$(document).ready(function() {
    $('table #editButton').on('click',function(event) {
        event.preventDefault();
        var myModal = new bootstrap.Modal(document.getElementById('editModal'), {
            keyboard: false
        });
        var href = $(this).attr('href');
        $.get(href,function(employee,status) {
           $('#addressEdit').val(employee.address);
           $('#cityEdit').val(employee.city);
           $('#selectNationalityEdit').val(employee.countryid);
           var dob = employee.dateOfBirth.substr(0,10);
           $('#dateOfBirthEdit').val(dob);
           $('#emailEdit').val(employee.email);
           $('#firstNameEdit').val(employee.firstname);
           $('#selectGenderEdit').val(employee.gender);
           $('#idEdit').val(employee.id);
           $('#initialsEdit').val(employee.initials);
           $('#lastNameEdit').val(employee.lastname);
           $('#selectMaritalStatusEdit').val(employee.maritalStatus);
           $('#mobileEdit').val(employee.mobile);
           $('#otherNameEdit').val(employee.othername);
           $('#phoneEdit').val(employee.phone);
           $('#fupPhotoEdit').val(employee.photo);
           $('#SSNEdit').val(employee.socialSecurityNumber);
           $('#selectStateEdit').val(employee.stateid);
           $('#selectTitleEdit').val(employee.title);
           $('#selectEmployeeTypeEdit').val(employee.employeeTypeId);
           var hireDate = employee.hireDate.substr(0,10);
           $('#hireDateEdit').val(hireDate);
           $('#selectJobTitleEdit').val(employee.jobtitleid);
        });
        myModal.show();
    });

    $('table #detailsButton').on('click',function(event) {
        event.preventDefault();
        var myModal = new bootstrap.Modal(document.getElementById('detailsModal'), {
            keyboard: false
        });
        var href = $(this).attr('href');
        $.get(href,function(employee,status) {
            $('#addressDetails').val(employee.address);
            $('#cityDetails').val(employee.city);
            $('#selectNationalityDetails').val(employee.countryid);
            var dob = employee.dateOfBirth.substr(0,10);
            $('#dateOfBirthDetails').val(dob);
            $('#emailDetails').val(employee.email);
            $('#firstNameDetails').val(employee.firstname);
            $('#selectGenderDetails').val(employee.gender);
            $('#idDetails').val(employee.id);
            $('#initialsDetails').val(employee.initials);
            $('#lastNameDetails').val(employee.lastname);
            $('#selectMaritalStatusDetails').val(employee.maritalStatus);
            $('#mobileDetails').val(employee.mobile);
            $('#otherNameDetails').val(employee.othername);
            $('#phoneDetails').val(employee.phone);
            $('#fupPhotoDetails').val(employee.photo);
            $('#SSNDetails').val(employee.socialSecurityNumber);
            $('#selectStateDetails').val(employee.stateid);
            $('#selectTitleDetails').val(employee.title);
            $('#selectEmployeeTypeDetails').val(employee.employeeTypeId);
            var hireDate = employee.hireDate.substr(0,10);
            $('#hireDateDetails').val(hireDate);
            $('#selectJobTitleDetails').val(employee.jobtitleid);
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
    });


    $('table #photoButton').on('click',function(event) {
        event.preventDefault();
        var photoModal = new bootstrap.Modal(document.getElementById('photoModal'), {
            keyboard: false
        });
        var href = $(this).attr('href');
        $('#photoModal #employeePhoto').attr('src', href);
        photoModal.show();
    })
    
    
})