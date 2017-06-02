
 $(document).ready(function(){
	
	$("#guardar").click(function (){
		
		if($("#nombre").val().length>10 || $("#nombre").val()=="" || $("#apellidos").val().length>20 || $("#apellidos").val()==""
			|| isNaN($("#telefono").val()) || $("#telefono").val().length>9 || $("#email").val().indexOf("@") == -1 || 
			$("#email").val()==""){
           
			$("#p1").append("El formulario no cumple alguna de las restricciones");
			return false;
		}
		else{
			$("#p1").append("El formulario se ha rellenado correctamente");
		
		}		
		
	});
	 
 });