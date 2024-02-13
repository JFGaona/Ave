import java.util.logging.Logger;

public class Canto implements TipoSonido{

    public static final Logger logger = LoggerFactory.getLogger(Canto.class);

    @Override
    public void makeSound() {
        logger.debug("estoy cantando");
        System.out.println("estoy cantando");
    }
}
