
$(document).ready(function(){

	var domain = "http://localhost:8080/spring-boot-jsp-jpa";
	
	$.ajax({
        url: domain + "/projetos",
        contentType: "application/json",
        dataType: 'json',
        success: function(projects) {
        	
        	var table = $('#projects-table');
        	projects.forEach(function (project) {
                table.append("<tr><td>" + project.id + "</td><td>" + project.nome + "</td></tr>");
            });
        	
        	$("#result").html(result);
        }
    })

});