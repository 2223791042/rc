 $(document).ready(function() { 
   var leftnum;
	var wi = $('#pic-scroll ul').eq(0).html();
	$('#pic-scroll ul').eq(1).html(wi);
	var widthUl = $('#pic-scroll ul').width();
	var Linum = $('#pic-scroll ul').eq(0).find("li").length;
	var Liwidth = widthUl/Linum;
	function moveleft(){
		leftnum = parseInt($('.scroll').css('left'));
		if(-leftnum<widthUl){
			$('.scroll').animate({left:'-='+Liwidth+'px'});
			$('.number .active').next('span').addClass('active');
			$('.number .active').first().removeClass('active');
		}else{
			$('.scroll').css("left","0");
			$('.scroll').animate({left:'-='+Liwidth+'px'});
			$('.number span').removeClass('active');
			$('.number span').first().addClass('active');
		}
	}
	function moveright(){
		leftnum = parseInt($('.scroll').css('left'));
		if(leftnum<0){
			$('.scroll').animate({left:'+='+Liwidth+'px'})
		}else{
			$('.scroll').css("left",-widthUl+'px');
			$('.scroll').animate({left:'+='+Liwidth+'px'})
		}
	}
	var clicktag = 0;
	var clicktag2 = 0;
	$("#pic-scroll .next").click(function(){
		if (clicktag2 == 0) {
			clicktag2 = 1;
			moveleft();
			setTimeout(function () { clicktag2 = 0 },500);
		} else {
			return false;
		}
	})
	$("#pic-scroll .prve").click(function(){
		if (clicktag == 0) {
			clicktag = 1;
			moveright();
			setTimeout(function () { clicktag = 0 },500);
		} else {
			return false;
		}
	})
	
	var t = setInterval(moveleft,4000);
	
	$('#pic-scroll').mouseenter(function(){
		clearInterval(t);
	})
	$('#pic-scroll').mouseleave(function(){
		t = setInterval(moveleft,4000);
	})
	 
})