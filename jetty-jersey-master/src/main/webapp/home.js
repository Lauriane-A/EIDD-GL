
function getServerData(url, success){
    $.ajax({
        dataType: "json",
		type:"GET",
        url: url
    }).done(success);
}

function postServerData(url, data, success){
    $.ajax({
        url: url,
		type:"POST",
		data: data,
		dataType: "json"
    }).done(success);
}

function putServerData(url, data, success){
    $.ajax({
        url: url,
		type:"PUT",
		data: data,
		dataType: "json"
    }).done(success);
}

function deleteServerData(url, success){
    $.ajax({
        url: url,
		type:"DELETE",
		data: data,
		dataType: "json"
    }).done(success);
}

function callDone(result){
	var templateExample = _.template($('#templateExample').html());

	var html = templateExample({
		"attribute":JSON.stringify(result)
	});

	$("#result").append(html);
}

$(function(){
	$("#button").click(function(){
		getServerData("FlightWs/flights/list",callDone);
	});
});

$(function(){
	$("#button").click(function(){
		var paramsWebservice={
			"price":$("#100").val(),
		};
		putServerData("FlightWs/flights/add",paramsWebservice , callDone);
	});
});