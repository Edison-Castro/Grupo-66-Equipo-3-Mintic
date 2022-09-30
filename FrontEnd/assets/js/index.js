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
        </tr>`;
    });
    document.getElementById("tableBody_repre").innerHTML = tableBody;
  } catch (error) {
    console.log(error);
  }
};

const guardarRepresentantes = async () => {

  var repre = document.getElementById("nombreRepresentante").value;

  if (repre.trim() === "") {
    alert("Campos Vacios");
    return;
  }

  var datos = {
    nombreRepresentante: repre
  };
  
  await fetch(url, {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(datos),
  }).then(res => res.json())
    .catch(error => console.error('Error', error))
    .then(response => console.log('Success', response))
    .then(responseAlt => alert("Representante Registrado Exitosamente", responseAlt));
  
  window.location.reload();
};

const editarRepresentante = async () => {

  var myHeaders = new Headers();
  myHeaders.append("Content-Type", "application/json");

  var idrepre = document.getElementById("idRep").value;
  var repre = document.getElementById("editRepresentante").value;

  if (repre.trim() === "" || idrepre.trim() === "") {
    alert("Campos Vacios");
    return;
  }

  var datos = JSON.stringify({
    idRepresentante: idrepre,
    nombreRepresentante: repre,
  });

  var requestOptions = {
    method: "PUT",
    headers: myHeaders,
    body: datos,
    redirect: "follow",
  };

  fetch(url, requestOptions)
    .then((response) => response.text())
    .then((result) => console.log(result))
    .catch((error) => console.log("error", error));
  
  window.location.reload();
}

const eliminaRepresentante = async () => {

  let idRepresentante = document.getElementById("deleteIdRep").value;
  console.log(idRepresentante);

  urlDelete = `${url}/${idRepresentante}`;
  console.log(urlDelete);

  var requestOptions = {
    method: "DELETE",
    redirect: "follow",
  };

  fetch(urlDelete, requestOptions)
    .then((response) => response.text())
    .then((result) => console.log(result))
    .catch((error) => console.log("error", error));
  
  window.location.reload();
};

window.addEventListener("load", function () {
  console.log("Documento cargado");
  cargarRepresentantes();
});

//** LIMPIAR MODALES *
function limpiarFormulario() {
  document.getElementById("nombreRepresentante").value = "";
  document.getElementById("deleteIdRep").value = "";
  document.getElementById("editRepresentante").value = "";
};

