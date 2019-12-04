$(document).ready(function() {
var user_Boolean = false;
var password_Boolean = false;
var varconfirm_Boolean = false;
var name_Boolean = false;
var  sex_Boolean = false;
var birth_Boolean = false;
var  id_Boolean = false;

//明文/密文的设置
$(".eyes_box").click(function(){
	if($(this).attr("data-show")==1){//明文
		$(this).attr("data-show","2");
//		更换字体图标样式
		$(this).children("i").removeClass("icon-htmal5icon09");
		$(this).children("i").addClass("icon-mimakejianguanbi");
		$(this).parent(".formRow").children(".mima_dd").hide();
		$(this).parent(".formRow").children(".mima_wz").show();
		$(this).parent(".formRow").children(".mima_wz").val($(this).parent(".formRow").children(".mima_dd").val()); 
		return;
		}
	if($(this).attr("data-show")==2){//密文
		$(this).attr("data-show","1");
		$(this).children("i").removeClass("icon-mimakejianguanbi");
		$(this).children("i").addClass("icon-htmal5icon09");
		$(this).parent(".formRow").children(".mima_dd").show();
		$(this).parent(".formRow").children(".mima_wz").hide();
		$(this).parent(".formRow").children(".mima_wz").val($(this).parent("li").children(".mima_dd").val()); 
		return;
		} 
	});

//邮箱
$('.reg_email').blur(function(){
  if ((/^[a-z\d]+(\.[a-z\d]+)*@([\da-z](-[\da-z])?)+(\.{1,2}[a-z]+)+$/).test($(".reg_email").val())){
    $('.email_hint').html("✔").css("color","green");
    emaile_Boolean = true;
  }else {
    $('.email_hint').html("×").css("color","red");
    emaile_Boolean = false;
  }
});
//密码
$('.reg_password').blur(function(){
  if ((/^[a-z0-9_-]{6,16}$/).test($(".reg_password").val())){
    $('.password_hint').html("✔").css("color","green");
    password_Boolean = true;
  }else {
    $('.password_hint').html("×").css("color","red");
    password_Boolean = false;
  }
});
//再次确认密码
$('.reg_confirm').blur(function(){
  if (($(".reg_password").val())==($(".reg_confirm").val())){
    $('.confirm_hint').html("✔").css("color","green");
    varconfirm_Boolean = true;
  }else {
    $('.confirm_hint').html("×").css("color","red");
    varconfirm_Boolean = false;
  }
});
//姓名非空
$('.reg_name').blur(function(){
  if ((/^[\u4e00-\u9fa5](\s*[\u4e00-\u9fa5])*$/).test($(".reg_name").val())){
    $('.name_hint').html("✔").css("color","red");
    name_Boolean = false;
}else {
     $('.name_hint').html("✔").css("color","green");
    name_Boolean = true;
}
});

//身份证
 // 身份证号码为15位或者18位，15位时全为数字，18位前17位为数字，最后一位是校验位，可能为数字或字符X 
$('.reg_id').blur(function(){
  if ((/(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/).test($(".reg_id").val())){
    $('.id_hint').html("✔").css("color","green");
   id_Boolean = true;
  }else {
    $('.id_hint').html("×").css("color","red");
    id_Boolean = false;
  }
});
//时间验证
// 时间日期格式为xxxx-xx-xx
$('.reg_birthday').blur(function(){
    if ((/^(\d{4})(-)(\d{2})(-)(\d{2})$/).test($(".reg_birthday").val())){
        $('.birth_hint').html("✔").css("color","green");
        id_Boolean = true;
    }else {
        $('.birth_hint').html("×").css("color","red");
        id_Boolean = false;
    }
});
});