$(document).ready(function () {
    $("#bootstrapGrid").click()
});

function drawTaskGrid() {
    $("#list").jqGrid({
        url: "jqgridData",
        datatype: "json",
        mtype: "GET",
        width: 600,
        colNames: ["ID", "Description", "Context", "Status"],
        colModel: [
            {name: "description", width: 40, sortable: true},
            {name: "context", width: 20, sortable: true},
            {name: "id", width: 4, sortable: true},
            {name: "status", width: 4, sortable: true}
        ],
        pager: "#pager",
        rowNum: 10,
        rowList: [10, 20, 30],
        sortname: "description",
        sortorder: "desc",
        viewrecords: true,
        gridview: true,
        caption: "Tasks"
    });
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