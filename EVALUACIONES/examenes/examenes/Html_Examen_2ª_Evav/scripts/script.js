function inicio(){
    const URL = "assets/php/servidor.php?peticion=cargar_animales";
    fetch(URL)
        .then((response) => response.json())
        .then((data) => {
            let html = "";
            for (let i = 0; i < data.length; i++) {
                html += `<div onclick="ver_animales(${data[i].cat_id})">${data[i].cat_nombre}</div>`;
            }
            console.log(data);
            document.querySelector("nav").innerHTML = html;
        });
}

function ver_animales(ANIMALES) {
    const URL = "assets/php/servidor.php?peticion=ver_animales&ANIMALES=" + ANIMALES;
    fetch(URL)
        .then((response) => response.json())
        .then((data) => {
            let html = "";
            console.log(data);
            for (let i = 0; i < data.length; i++) {
                html += "<div>";
                html += `       <img src="assets/Fotos/${data[i].foto_foto}">`
                html += "</div>";
            }
            document.querySelector("section").innerHTML = html;
        });
}
