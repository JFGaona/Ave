import java.util.logging.Logger;

public class Grasnido implements TipoSonido{

    public static final Logger logger = LoggerFactory.getLogger(Grasnido.class);

    public void makeSound(){
        logger.debug("grasnando");
        System.out.println("grasnando");
    }
}
