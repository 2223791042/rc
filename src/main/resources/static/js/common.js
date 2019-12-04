//科研平台实验室样式切换
$(function() {
	$('.lab-b2 a').hover(function() {
		$(this).find('div').slideToggle();
	})
})
//了解更多
$(function() {
	$('.crl-b1 li').hover(function() {
		$(this).find('div').fadeToggle();
	})
})
//在线申请系统登录、注册切换
$(document).ready(function() {
	$(".register-form").css("display", "none");
	$(".log a:eq(0)").click(function() {
		$(".login-form").css("display", "none");
		$(".register-form").css("display", "block");
	});
	$(".register-form a:eq(0)").click(function() {
		$(".register-form").css("display", "none");
		$(".login-form").css("display", "block");

	});
})