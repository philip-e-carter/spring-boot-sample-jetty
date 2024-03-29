$(document).ready(function () {
    $("#bootstrapGrid").click()
});

function drawTaskGrid() {
    console.log('drawTaskGrid');
    //$("#list").jqGrid({
    //    url: "jqgridData",
    //    datatype: "json",
    //    mtype: "GET",
    //    width: 600,
    //    height: 220,
    //    colNames: ["ID", "Description", "Context", "Status"],
    //    colModel: [
    //        {name: "description", width: 40, sortable: true},
    //        {name: "context", width: 20, sortable: true},
    //        {name: "id", width: 4, sortable: true},
    //        {name: "status", width: 4, sortable: true}
    //    ],
    //    pager: "#pager",
    //    rowNum: 10,
    //    rowList: [10, 20, 30],
    //    sortname: "description",
    //    sortorder: "desc",
    //    viewrecords: true,
    //    gridview: true,
    //    caption: "Tasks"
    //});

    $.ajax({
        url: 'jqgridData',
        method: 'GET'
    }).success(function (data) {
        redrawTaskGrid(data);
    });
}

function redrawTaskGrid(data) {
    var taskListBody = $('#taskListBody');
    taskListBody.html('');
    for (var i = 0; i < data.length; i++) {
        var tr = '<tr>'
            + '<td>' + data[i]['id'] + '</td>'
            + '<td>' + data[i]['description'] + '</td>'
            + '<td>' + data[i]['context'] + '</td>'
            + '<td>' + data[i]['status'] + '</td>'
            + '<td style="text-align : center;">' + '<i class="material-icons" data-taskid="' + data[i]['id'] + '">remove circle</i>' + '</td>'
                //+ '<td class="temp123">click</td>'
            + '</tr>';
        taskListBody.append(tr);
    }
}

function test() {
    $.ajax({
        url: 'test'
    }).success(function (data) {
        $('#divId').text(data);
        // jQuery doesnt seem to support relative; create function to get page size and scale?
        $('#house').offset({top: 200, left: 300});
    });
}