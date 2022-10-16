$(document).ready(function(){
$('#save_button').click(function(){

var id = $('#user_id').val();
var name = $('#name').val();
var age = $('#age').val();
var isManager = $('#ismanager').is(':checked');

var user = {
             "userId": id,
             "name" : name,
             "age" : age,
             "manger" : isManager
           }
           console.log('User variable')

$.ajax({
type:"POST",
url: 'http://localhost:8085/home',
contentType: "application/json",
data: JSON.stringify(user),
dataType: "json",
crossDomain:true,
success: function(data, status, thirdparameter){
  sessionStorage.setItem('id', id);
  window.location="http://localhost:8085/nextPage"
  
}

});



});
// $('#get_button').click(function(){

//   var id = $('#get_user_id').val();
//   var url = 'http://localhost:8085/home/'+ id 
  
//   $.ajax({
//   type:"GET",
//   url: url,
//   contentType: "application/json",
//   //dataType: "json",
//   crossDomain:true,
//   success: function(data, status, thirdparameter){
//     $('#display_user_id').text(data['userId']);
//     $('#display_name').text(data['name']);
//     $('#display_age').text(data['age']);
//     $('#display_ismanager').text(data['manger']);

//     sessionStorage.setItem('userdata', JSON.stringify(data));
//     var temp = JSON.parse(sessionStorage.getItem('userdata'));
//     console.log(temp);

//   }
  
//   });
  
  
  
//   });



});