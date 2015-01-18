$(document).ready( function() {
//    $('#example').dataTable( {
//        "ajax": 'tasks',
//        "data": "description"                   
//    } );
//    
//    var dataSet = [
//                   ['Trident','Internet Explorer 4.0','Win 95+','4','X'],
//                   ['Trident','Internet Explorer 5.0','Win 95+','5','C'],
//                   ['Trident','Internet Explorer 5.5','Win 95+','5.5','A'],
//                 ];
//    
//    $('#example2').dataTable( {
//        "data": dataSet,
//        "columns": [
//            { "title": "Engine" },
//            { "title": "Browser" },
//            { "title": "Platform" },
//            { "title": "Version", "class": "center" },
//            { "title": "Grade", "class": "center" }
//        ]
//    } );   

	    $("#list").jqGrid({
	        url: "jqgridData",
	        datatype: "json",
	        mtype: "GET",
	        colNames: ["ID", "Description", "Context"],
	        colModel: [
	            { name: "id", width:4}, {name: "description", width: 55 }, {name: "context", width: 20}
	        ],
	        pager: "#pager",
	        rowNum: 10,
	        rowList: [10, 20, 30],
	        sortname: "invid",
	        sortorder: "desc",
	        viewrecords: true,
	        gridview: true,
	        autoencode: true,
	        caption: "Tasks"
	    }); 

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