/**
 * 
 */
$(function validateForm() {
    var x = document.forms["myform"]["uname"].value;
    if (x == "") {
        alert("Name must be filled out");
        return false;
}
});