$(document).ready(function() {
	$("#numbers-link").trigger('click');
	$("#search-link").trigger('click');

  // (function(){
  //   $(".math").each(function() {
  //     var texTxt = $(this).text();
  //     el = $(this).get(0);
  //     if(el.tagName == "DIV"){
  //         addDisp = "\\displaystyle";
  //     } else {
  //         addDisp = "";
  //     }
  //     try {
  //         katex.render(addDisp+texTxt, el);
  //     }
  //     catch(err) {
  //         $(this).html("<span class='err'>"+err);
  //     }
  //   }); 
  // })(); 
})

