window.addEventListener("DOMContentLoaded", function(){
    const swiper = new Swiper(".mySwiper", {
        loop: true,
        navigation: {
            nextEl: ".swiper-button-next",
            prevEl: ".swiper-button-prev",
        },
        pagination: {
          el: ".swiper-pagination",
        },
    });

    /* 더보기 메뉴 클릭시 */
    const moreMenus = document.getElementsByClassName("more_menu");
    const slideMenus = document.querySelector(".slide_menu");
    const layerDim = document.querySelector(".layer_dim");
    const closeBtn = document.querySelector(".slide_menu .close");
    for(const el of moreMenus){
        el.addEventListener("Click", function(){
            layerDim.classList.remove("dn");
            slideMenus.classList.remove("on");
            slideMenus.classList.add("on");
            closeBtn.classList.remove("dn");
        });
    }

    /* 닫기 버튼 클릭시 */
    closeBtn.addEventListener("Click", function(){
        layerDim.classList.remove("dn");
        layerDim.classList.add("dn");
        slideMenu.classList.remove("on");
        closeBtn.classList.remove("dn");
        closeBtn.classList.add("dn");
    });

});