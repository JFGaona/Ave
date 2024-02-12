public abstract class Ave {

    TipoSonido tipoSonido;
    TipoVuelo tipoVuelo;

    //métodos de una ave

    public void realizaVuelo(){
        tipoVuelo.vuelo();
    }

    public void realizaSonido(){
        tipoSonido.makeSound();
    }
}
