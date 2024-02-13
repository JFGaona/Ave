import java.util.logging.Logger;

public class AvesTruz extends Ave{

    public static final Logger logger = LoggerFactory.getLogger(AvesTruz.class);

    public AvesTruz(){
        logger.debug("instanciando avestruz");
        tipoSonido = new SinCanto();
        tipoVuelo = new SinVuelo();
    }

}
