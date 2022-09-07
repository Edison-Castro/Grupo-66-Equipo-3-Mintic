function rellenarRep() {

    let idRep = document.getElementById("idRepresentante").value;

    if (idRep == 1) {
      document.getElementById("textRepresentante").innerHTML =
        "Nombre Representante 1";
    } else if (idRep == 2) {
      document.getElementById("textRepresentante").innerHTML =
        "Nombre Representante 2";
    } else if (idRep == 3) {
      document.getElementById("textRepresentante").innerHTML =
        "Nombre Representante 3";
    } else if (idRep == 4) {
      document.getElementById("textRepresentante").innerHTML =
        "Nombre Representante 4";
    }

}

