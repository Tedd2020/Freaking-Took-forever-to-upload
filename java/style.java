

$(document).ready(function(){
	$('.gallery-column img').on('click', function(){
		var expandImg = document.getElementById("expandedImg");
		expandImg.src = this.src;
		expandImg.parentElement.style.display = "block";
	});
});