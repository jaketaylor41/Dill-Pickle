var index = 0,
    nameArray = [];

function goGetNames() {
    $.ajax({
        type : "GET",
        url : "/popcorn",
        success : function (data) {
            nameArray = data.people;
            updateCell();
        }
    });
    enable();
}

function enable() {
    $("#prevBtn").on("click", function () {

        --index < 0 && (index = nameArray.length - 1);
        updateCell();
    });

    $("#nextBtn").on("click", function () {

        ++index >= nameArray.length && (index = 0);
        updateCell();
     });
}

function updateCell() {
    for (var i = 1; i < 11; i++)
    $("#"+i).removeClass("highlight");
    $("#"+(index+1)).addClass("highlight");
    $("#textName").text(nameArray[index].name);
    $("#textFeedback").text(nameArray[index].city);

}
$(document).ready(function () {
    goGetNames()
});
