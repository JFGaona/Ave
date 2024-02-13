import java.util.logging.Logger;

public class SinVuelo implements TipoVuelo{

    public  static final Logger logger = LoggerFactory.getLogger(SinVuelo.class);

    @Override
    public void vuelo() {
        logger.debug("no puedo volar");
        System.out.println("no puedo volar");
    }
}
