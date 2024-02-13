import java.util.logging.Logger;

public class SinCanto implements TipoSonido {

    public static final Logger logger = LoggerFactory.getLogger(SinCanto.class);

    @Override
    public void makeSound() {
        logger.debug("<<Silencio>>");
    }
}
