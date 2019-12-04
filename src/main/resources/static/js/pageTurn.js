//切换
$(function() {

	$('.title-list').click(function() {
		$(this).addClass('active').siblings().removeClass('active');
		var x = $(this).index();
		$('.content').eq(x).addClass('show').siblings().removeClass('show');
	})
})

function pageTurn(num) {
	$('.content').eq(num).addClass('show').siblings().removeClass('show');
	$('.title-list').eq(num).addClass('active').siblings().removeClass('active');
}
//点击出现修改密码弹窗
//在body中插入mask遮罩，此次，让登录框显示
$(function($) 
{
	$("#change").on('click', function() {
		$("body").append("<div id='mask'></div>");
		$("#mask").addClass("mask").fadeIn("slow");
		$("#LoginBox").fadeIn("slow");
	});
//	点击关闭按钮,让弹框消失
	$(".close_btn").hover(function() {
		$(this).css({
			color: 'black'
		})
	}, function() {
		$(this).css({
			color: '#999'
		})
	}).on('click', function() {
		$("#LoginBox").fadeOut("fast");
		$("#mask").css({
			display: 'none'
		});
	});
	$("#close").on('click', function() {
		$("#LoginBox").fadeOut("fast");
		$("#mask").css({
			display: 'none'
	});
});
});