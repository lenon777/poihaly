window.onscroll = function() {
    let scrolled = window.pageYOffset || document.documentElement.scrollTop;
    let header = document.getElementById("nav-on-scroll");
    // let logo = document.getElementById("logos");
    // let main_li = document.getElementsByClassName("nav-link");
    if(scrolled >=1){
        header.setAttribute("style","background: #eb5815f0 !important;\n" +
            "    transition: 0.5s;");
        // logo.setAttribute("style","color: white !important");
        // for (let li of main_li) {
        //     li.setAttribute("style","color: white !important");
        // }
    }
    else {
        header.setAttribute("style","background: #ffffff00 ;\n" +
            "    transition: 0.5s; @media (max-width: 768px) { background: #e85716 !important; }");
        // logo.setAttribute("style","color: #293a6b  ;  @media (max-width: 768px) { color: white !important; }");
        // for (let li of main_li) {
        //     li.setAttribute("style","color: #293a6b ; @media (max-width: 768px) { color: white !important; }");
        // }
    }
};

let carrusel = document.getElementsByClassName("hideList");
for (let i=0;i<carrusel.length;i++){
    console.log(carrusel[i]);

}

function hideCarrusel(carrusel) {
    for (let i=0;i<carrusel.length;i++){
        if( carrusel[i]>3){
            carrusel[i].style.display='none';
            console.log(carrusel[i]);
        }
    }
}
console.log(carrusel);
hideCarrusel(carrusel);

let hotButtons= document.getElementsByClassName('hot-button');
console.log(hotButtons);
for(const hot in hotButtons) {
    hotButtons[hot].onclick= function () {
        let hotChose= document.getElementById('hot-chose');

        let parent= this.parentNode;
        parent.setAttribute('class','hot-chose')
    }
}

let test= document.getElementById('test');
console.log(test)