// JavaScript Document

function validation()
{
	var password = document.getElementById("password").value;
	var confirmpassword = document.getElementById("confirmpassword").value;
		
	if(password != confirmpassword)
	{
		alert("Please input password similar with confirmpassword");
	}
	else
	{
		var registration_form = document.getElementById("registration_form").action = "success.html";				
	}
}