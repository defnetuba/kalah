/**
 * 
 */
function connect() {
	 alert("conncted");
	var socket = new SockJS('/kalah-playing');
	stompClient = Stomp.over(socket);
	stompClient.connect({}, function(frame) {
		console.log("connected: " + frame);
		stompClient.subscribe('/kalah/moves', function(response) {
			var data = JSON.parse(response.body);
			 $('#game').attr("hidden","false");
			 $("#playerSouth").attr("html",data.playerNorth);
			 alert(data);
			//draw("left", data.message);
		});
	});
}

function draw(side, text) {
	console.log("drawing...");
    var $message;
    $message = $($('.kalah_template').clone().html());
    $message.addClass(side).find('.text').html(text);
    $('.kalahSeed').append($message);
    return setTimeout(function () {
        return $message.addClass('appeared');
    }, 0);

}
function disconnect(){
	alert("disconnect me");
	stompClient.disconnect();
}

function playMove(){
	stompClient.send("/app/play", {}, JSON.stringify({'board': $("#pit_input_value").val()}));

}

