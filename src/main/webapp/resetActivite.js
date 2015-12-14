(function($) {
	(function(){
		$('.unCheckSelect').click(function(){
		      $('#libelleNorme').prop('checked', false);
		      $('.libelleEtape').prop('checked', false);
		      $('.libelleProcessus').prop('checked', false);
		      $('.libelleFamille').prop('checked', false);
		});		
	});
}(jQuery));
