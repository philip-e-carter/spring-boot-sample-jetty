$(document).ready( function() {
    $('#example').dataTable( {
        "ajax": 'tasks',
        "sAjaxDataProp": "data",
        "aaData" : "data"
    } );
});

function test() {
	$.ajax ({
		url: 'test'
	}).success( function(data) {
		$('#divId').text(data);
		// jQuery doesnt seem to support relative; create function to get page size and scale?
		$('#house').offset({ top: 200, left: 300 });
	});
}