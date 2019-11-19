document.addEventListener('DOMContentLoaded', function() {
    var elems = document.querySelectorAll('.modal');
    var instances = M.Modal.init(elems);
    var elems = document.querySelectorAll('.datepicker');
    var instances = M.Datepicker.init(elems);
    var elems = document.querySelectorAll('.sidenav');
    var instances = M.Sidenav.init(elems)
  });
