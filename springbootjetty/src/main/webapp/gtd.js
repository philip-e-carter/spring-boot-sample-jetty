function test() {
	alert('ok');
	$.ajax ({
		url: 'html'
	}).success( function() {
		alert('success');
	});
}