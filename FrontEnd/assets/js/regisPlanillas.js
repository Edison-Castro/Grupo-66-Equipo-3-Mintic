const url = "http://localhost:8080/planillas";

const agregarPlanilla = async () => {


    var nroPlanilla = document.getElementById("nPlanilla").value;
    alert(nroPlanilla);
    var base = document.getElementById("base").value;
    alert(base);
    var fechaRecoleccion = document.getElementById("fRecoleccion").value;
    alert(fechaRecoleccion);
    var fechaSobre = document.getElementById("fSobre").value;
    alert(fechaSobre);
    var numSobre = document.getElementById("consecutivoSobre").value;
    alert(numSobre);
    var observaciones = document.getElementById("observaciones").value;
    alert(observaciones);
    var valorRecaudo = document.getElementById("valorRecaudo").value;
    alert(valorRecaudo);
    // var idDispositivo = document.getElementById("idDispositivo").value;
    // var idModelo = document.getElementById("modeloPunto").value;
    // var idPuntoRecaudo = document.getElementById("modeloPunto").value;
    // var idRepresentante = document.getElementById("idRepresentante").value;
    // var tipoSobre = document.getElementById("tipoSobre").value;

    var datos = JSON.stringify({
        nroPlanilla: nroPlanilla,
        base: base,
        fechaRecoleccion: fechaRecoleccion,
        fechaSobre: fechaSobre,
        numSobre: numSobre,
        observaciones: observaciones,
        valorRecaudo: valorRecaudo,
        dispositivo: {
            idDispositivo: 1,
        },
        estado: {
            idEstado: 1,
        },
        modeloPunto: {
            idModelo: 2,
        },
        puntoRecaudo: {
            idPuntoRecaudo: 3,
        },
        representate: {
            idRepresentante: 1,
        },
        tipoSobre: {
            idTipoSobre: 1,
        }    
    });
    

    await fetch(url, {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: datos,
    })
      .then((res) => res.json())
      .catch((error) => console.error("Error", error))
      .then((response) => console.log("Success", response))
        .then((responseAlt) => alert("Planilla Registrado Exitosamente"));

    console.log(res);
    console.log(response);


}
