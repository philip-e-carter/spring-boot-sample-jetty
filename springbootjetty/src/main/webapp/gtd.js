function test() {
	$.ajax ({
		url: 'tasks'
	}).success( function(data) {
		$('#divId').text(data);
		$('#house').offset({ top: 10, left: 30 });
	});
}