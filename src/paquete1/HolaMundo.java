package paquete1;

/**
 * primer paso
 * @author SOFI
 *
 */
public class HolaMundo {
    /**
     * primer metodo
     * @param args
     */
	public static void main(String[] args) {

		Persona per = new Persona();
		per.setAltura(100);

		per.setNacionalidad("argentina");
		per.setFuma(true);

		Persona padre1 = new Persona();
		padre1.setNombre("alfredo");
		per.setPadre(padre1);

		Persona madre = new Persona();
		madre.setNombre("monica");

		Persona per2 = new Persona();
		per2.setAltura(170);

		per2.setNacionalidad("uruguay");
		per2.setFuma(false);
		Persona padre2 = new Persona();
		padre2.setNombre("Hector");

		Persona madre2;
		madre2 = new Persona();
		madre2 = setNombre("Patricia");

		System.out.println(per.getAltura());
		System.out.println(per2.getAltura());
		System.out.println("per: " + per.getAltura() + " per:2 "
				+ +per2.getAltura());
		System.out.println(per.getNombre());
		System.out.println(per.getNombre());
		System.out.println(per.isFuma());
		System.out.println(per.getNacionalidad());

		System.out.println(per2.getNacionalidad());
		System.out.println(per2.isFuma());
		System.out.println(per2.getMadre());
		System.out.println(per2.getPadre());

	}

	private static Persona setNombre(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
