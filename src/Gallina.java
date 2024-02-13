import java.util.logging.Logger;

public class Gallina extends Ave {

    public static final Logger logger = LoggerFactory.getLogger(Gallina.class);

        public Gallina(){
            logger.debug("instanciando una gallina");
            this.setTipoSonido(new Grasnido());
            this.setTipoVuelo(new VueloConAlas());
        }

}
