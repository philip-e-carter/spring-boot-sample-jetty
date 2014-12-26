function test() {
	$.ajax ({
		url: 'tasks'
	}).success( function(data) {
		alert(data);
		$('#divId').text(data);
	});
}