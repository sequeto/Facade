package facade;

public class Administrativo extends Departamento{
	private static Administrativo administrativo = new Administrativo();

    private Administrativo() {};

    public static Administrativo getInstancia() {
        return administrativo;
    }
}
