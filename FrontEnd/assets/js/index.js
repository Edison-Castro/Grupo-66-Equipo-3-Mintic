const url = "http://localhost:8080/representantes";

const cargarRepresentantes = async () => {
  try {
    const respuesta = await fetch(url);
    console.log(respuesta);

    const datos = await respuesta.json();
    console.log(datos);

    let tableBody = ``;
    datos.forEach((user) => {
      tableBody += `<tr class="table-light">
            <th>${user.idRepresentante}</th>
            <th>${user.nombreRepresentante}</th>
            <th><button type="button" class="btn btn-warning" data-bs-toggle="modal" data-bs-target="#editarRepreModal"><i class="bi bi-pencil-square p-1"></i>Editar</button></th>
            <th><button type="button" class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#eliminarModal"><i class="bi bi-trash-fill p-1"></i>Eliminar</button></th>
        </tr>`;
    });
    document.getElementById("tableBody_repre").innerHTML = tableBody;

  } catch (error) {
    console.log(error);
  }
};



window.addEventListener("load", function () {
  console.log("Documento cargado");
  cargarRepresentantes();
});
