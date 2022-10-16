$(document).ready(function(){

    var id = sessionStorage.getItem('id');
    var url = 'http://localhost:8085/home/'+ id 
    
    $.ajax({
    type:"GET",
    url: url,
    contentType: "application/json",
    //dataType: "json",
    crossDomain:true,
    success: function(data, status, thirdparameter){
      $('#display_user_id').text(data['userId']);
      $('#display_name').text(data['name']);
      $('#display_age').text(data['age']);
      $('#display_ismanager').text(data['manger']);
  
      sessionStorage.setItem('userdata', JSON.stringify(data));
      var temp = JSON.parse(sessionStorage.getItem('userdata'));
      console.log(temp);
  
    }
    
    });

});