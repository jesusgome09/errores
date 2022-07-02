import org.hyperic.sigar.SigarException;

public class main {
    public static void main(String[] args) throws SigarException {

        System.out.println("informacion de memoria");
        new infomemoria().mostrar();

    }
}
