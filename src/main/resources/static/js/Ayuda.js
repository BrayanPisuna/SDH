
$(document).ready(function(){
	document.getElementById("idper").value = document.getElementById("idper1").value;
		
});

$(document).ready(function(){
	document.getElementById("idequ").value = document.getElementById("idequ1").value;
		
});

///////////////////////////////////////////////////////////////////

$(document).ready(function(){
	$("#idced").change(function(){	
		var cedula = $(this).val();
		$('#filtrar').attr('href', $('#baseURL').val() + cedula);
		
		
	});
});


///////////////////////////////////////////////////////////////////

$(document).ready(function(){
	$("#idcedula").change(function(){	
		var cedula = $(this).val();
		$('#filtrar').attr('href', $('#baseURL').val() + cedula);
	});
});


/*MODAL*/
$('#myModal').on('shown.bs.modal', function () {
	  $('#myInput').trigger('focus')
	})
	
	
/*BUSQUEDA FUNCIONARIO*/
	
	    $(document).ready(function () {
        $('#tablabusqueda').DataTable({
            language: {
            	   processing: "Tratamiento en curso...",
                   search: "Buscar Funcionario&nbsp;:",
                   lengthMenu: "Agrupar de _MENU_ Funcionario",
                   info: "Funcionario _START_ al _END_ de un total de _TOTAL_ Funcionarios",
                   infoEmpty: "No existen datos.",
                   infoFiltered: "(filtrado de _MAX_ elementos en total)",
                   infoPostFix: "",
                   loadingRecords: "Cargando...",
                   zeroRecords: "No se encontraron datos con tu busqueda",
                   emptyTable: "No hay datos disponibles en la tabla.",
                   paginate: {
   
                       previous: "Anterior",
                       next: "Siguiente",
                       
                   },
            },
            lengthMenu: [ [5, 10, -1], [5, 10, "All"] ],
        });
    });

/*BUSQUEDA PERIFÉRICO */


$(document).ready(function () {
    $('#tablaperiferico').DataTable({
        language: {
        	   processing: "Tratamiento en curso...",
               search: "Buscar Periférico&nbsp;:",
               lengthMenu: "Agrupar de _MENU_ Funcionario",
               info: "Periférico _START_ al _END_ de un total de _TOTAL_ Periféricos",
               infoEmpty: "No existen datos.",
               infoFiltered: "(filtrado de _MAX_ elementos en total)",
               infoPostFix: "",
               loadingRecords: "Cargando...",
               zeroRecords: "No se encontraron datos con tu busqueda",
               emptyTable: "No hay datos disponibles en la tabla.",
               paginate: {

                   previous: "Anterior",
                   next: "Siguiente",
                   
               },
        },
        lengthMenu: [ [5, 10, -1], [5, 10, "All"] ],
    });
});


/*BUSQUEDA EQUIPO*/

$(document).ready(function () {
    $('#tablaequipo').DataTable({
        language: {
        	   processing: "Tratamiento en curso...",
               search: "Buscar Equipo&nbsp;:",
               lengthMenu: "Agrupar de _MENU_ Funcionario",
               info: "Equipo _START_ al _END_ de un total de _TOTAL_ Equipos",
               infoEmpty: "No existen datos.",
               infoFiltered: "(filtrado de _MAX_ elementos en total)",
               infoPostFix: "",
               loadingRecords: "Cargando...",
               zeroRecords: "No se encontraron datos con tu busqueda",
               emptyTable: "No hay datos disponibles en la tabla.",
               paginate: {

                   previous: "Anterior",
                   next: "Siguiente",
                   
               },
        },
        lengthMenu: [ [5, 10, -1], [5, 10, "All"] ],
    });
});