import java.util.logging.Logger;
import  org.junit.Assert;
public class Test {

    public static final Logger logger = LoggerFactory.getlogger(Test.class);

    @org.junit.Test
    public void canarioTestCase(){
        Canario canario = new Canario();
        Assert.assertNotNull(canario);

        lagger.debug("canario realizaVuelo");
        System.out.println("canario realizaVuelo");
        canario.realizaVuelo();
        lagger.debug("canario realizaSonido");
        System.out.println("canario realizaSonido");
        canario.realizaSonido();
        System.out.println("canario cambiando sonido ave");
        canario.setTipoSonido(new Grasnido());
        System.out.println("canario realizaSonido");
        canario.realizaSonido();
    }
}
