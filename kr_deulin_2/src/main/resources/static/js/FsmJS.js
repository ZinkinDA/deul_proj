$(document).ready(function () {
    pageFsmShow();
});
function pageFsmShow() {
    $.get('/api/fsm', function (obj) {
        console.log(obj);
        let view = '<tr><td>' + obj.statement + '</td>'
            + '<td>' + obj.foamIncluded + '</td>'
            + '<td>' + obj.dryingMachine + '</td>'
            + '<td>' + obj.theWaterOn + '</td>'
            + '<td>' + obj.waxCoating + '</td>'
            + '</tr>';

        $('#fsm').html(view);
    });
};
function turnOn(){
    alert("Машина запускается подождите 2 секунды.");
    setTimeout(pageFsmShow,2200);
    setTimeout(pageFsmShow,3200);
    $.ajax({
        url:'/api/turnOn',
        type: 'POST',
        cache:false
    });
}
function turnOff(){
    alert("Машина выключается, подождите 2 секунды.")
    setTimeout(pageFsmShow,2500)
    $.ajax({
        url:'/api/turnOff',
        type: 'POST',
        cache: false
    });
}
function turnOnlyWater(){
    alert("Запуск режима вода");
    $.ajax({
        url:'/api/onlyWater',
        type: 'POST',
        cache: false
    });
    setTimeout(pageFsmShow,250);
    setTimeout(pageFsmShow,2250);
    setTimeout(pageFsmShow,8250);
}
function turnWaterFoam(){
    alert("Запуск режима вода-пена-вода")
    $.ajax({
        url:'/api/waterAndFoam',
        type: 'POST',
        cache: false
    });

    setTimeout(pageFsmShow,250);
    setTimeout(pageFsmShow,2250);
    setTimeout(pageFsmShow,8250);
    setTimeout(pageFsmShow,14250);
    setTimeout(pageFsmShow,20250)
}

function turnWaterWax(){
    alert("Запуск режима вода-воск-вода")
    $.ajax({
        url:'/api/waterAndWax',
        type: 'POST',
        cache: false
    });

    setTimeout(pageFsmShow,250);
    setTimeout(pageFsmShow,2250);
    setTimeout(pageFsmShow,8250);
    setTimeout(pageFsmShow,12250);
    setTimeout(pageFsmShow,18250);
}
function turnWaterFoamDrying(){
    alert("Запуск режима вода-пена-сушка")
    $.ajax({
        url:'/api/waterFoamDrying',
        type: 'POST',
        cache: false
    });

    setTimeout(pageFsmShow,250);
    setTimeout(pageFsmShow,2250);
    setTimeout(pageFsmShow,8250);
    setTimeout(pageFsmShow,14250);
    setTimeout(pageFsmShow,20250);
    setTimeout(pageFsmShow,26260);

}
function turnWaterFoamWax(){
    alert("Запуск режима вода-пена-вода-воск-вода")
    $.ajax({
        url:'/api/waterFoamWax',
        type: 'POST',
        cache: false
    });
    setTimeout(pageFsmShow,250);
    setTimeout(pageFsmShow,2250);
    setTimeout(pageFsmShow,8250);
    setTimeout(pageFsmShow,14250);
    setTimeout(pageFsmShow,20250);
    setTimeout(pageFsmShow,24250);
    setTimeout(pageFsmShow,30250);

}