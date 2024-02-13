import java.util.logging.Logger;

public class Canario extends Ave {

    public static final Logger logger = LoggerFactory.getLogger(Canario.class);

    public Canario(){
        logger.debug("instanciando un canario");
        this.setTipoSonido(new Canto());
        this.setTipoVuelo(new VueloConAlas());
    }


}
