import org.hyperic.sigar.Mem;
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;

public class infomemoria {
    Sigar sigar = new Sigar();

    public void mostrar() throws SigarException{
        Mem memoria = sigar.getMem();

        System.out.println("la memoria es: "+memoria+" Mb");
    }
    private Long enBytes(long valor) {
        return new Long(valor / 1024);
    }
}
