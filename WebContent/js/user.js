	(function(){
		//クリックで動く
		('.div-open').click(function(){
			if((this).hasClass('active')){
				(this).toggleClass('active');
				(this).next('div').fadeOut();
			} else {
				(this).toggleClass('active');
				(this).next('div').fadeIn();
			}
		});
  });