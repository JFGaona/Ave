import java.util.logging.Logger;

public class VueloConAlas implements TipoVuelo{

    public static final Logger logger = LoggerFactory.getLogger(VueloConAlas.class);

    @Override
    public void vuelo() {
        logger.debug("Esta volando, aleteando");
        System.out.println("Esta volando, aleteando");
    }
}
