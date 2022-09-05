function login(){ 
    var usuario=document.getElementById('correo').value;
    var password=document.getElementById('password').value;
    console.log(usuario);
    console.log(password);

    //acceso con admin
    if (usuario==="admin@prueba.com" && password==="admin") { 
        window.location="inicioLiderRecaudo.html";            
    }

    //acceso con usuario
    if (usuario==="usuario@prueba.com" || password==="user") { 
        window.location="inicioRepresentante.html";            
    } 

    if (usuario==="" || password==="") { 
        alert("Usuario y/o Password Incorrectos");
    }  
    } 