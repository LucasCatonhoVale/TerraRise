document.getElementById('sai').addEventListener('click', function() {
    const textoCompleto = document.getElementById('textoCompleto');
    const textoResumido = document.getElementById('escrito');
    
    if (textoCompleto.style.display === 'none') {
        textoCompleto.style.display = 'block';
        this.textContent = 'Saiba Menos'; // Muda o texto do botão
    } else {
        textoCompleto.style.display = 'none';
        this.textContent = 'Saiba Mais'; // Restaura o texto do botão
    }
});
