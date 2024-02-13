public abstract class Ave {

    TipoSonido tipoSonido;
    TipoVuelo tipoVuelo;

    //métodos de una ave

    public void setTipoSonido(TipoSonido tipoSonido) {
        this.tipoSonido = tipoSonido;
    }

    public void setTipoVuelo(TipoVuelo tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }

    public void realizaVuelo(){

        tipoVuelo.vuelo();
    }

    public void realizaSonido(){
        tipoSonido.makeSound();
    }
}
