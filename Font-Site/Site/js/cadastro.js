const formulario = document.querySelector("form");
const inome=document.querySelector("#nome");
const iemail=document.querySelector("#email");
const isenha=document.querySelector("#Senha");
const itelefone=document.querySelector("#telefone");
const iendereço=document.querySelector("#endereco");

function cadastra(){
    fetch("http://localhost:8080/usuario",
        {
            headers: {
              "Accept": "application/json",
              "Content-Type": "application/json"
            },
            method:"POST",
            body:JSON.stringify({
                nome    : inome.value,
                email   : iemail.value,
                senha   : isenha.value,
                telefone: itelefone.value,
                endereco: iendereço.value
                
    
            }) 
        })
        .then(function (res) {console.log(res)})
        .catch(function (res) {console.log(res)})
    

};

function limpar(){
    inome.value="";
    iemail.value="";
    isenha.value="";
    iendereço.value="";
    itelefone.value="" ;
}

formulario.addEventListener('submit',function(event){
    event.preventDefault();

    cadastra();
    limpar();

})