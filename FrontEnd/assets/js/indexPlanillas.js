const url = "http://localhost:8080/planillas";

const cargarPlanillas = async () => {
  try {
    const respuesta = await fetch(url);
    console.log(respuesta);

    const datos = await respuesta.json();
    console.log(datos);

    let tableBody = ``;
    datos.forEach((user) => {
      tableBody += `<tr class="table-light">
            <th>${user.nroPlanilla}</th>
            <th>${user.base}</th>
            <th>${user.fechaRecoleccion}</th>
            <th>${user.fechaSobre}</th>
            <th>${user.numSobre}</th>
            <th>${user.observaciones}</th>
            <th>${user.valorRecaudo}</th>
            <th>${user.dispositivo.consecutivoDispositivo}</th>
            <th>${user.modeloPunto.modelo}</th>
            <th>${user.puntoRecaudo.nombrePuntoRecaudo}</th>
            <th>${user.representate.nombreRepresentante}</th>
            <th>${user.tipoSobre.tipoSobre}</th>
        </tr>`;
    });
    document.getElementById("tableBody_planilla").innerHTML = tableBody;
  } catch (error) {
    console.log(error);
  }
};

window.addEventListener("load", function () {
  console.log("Documento cargado");
  cargarPlanillas();
});