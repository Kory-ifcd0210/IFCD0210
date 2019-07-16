
public class DatosUsuario {
	public DatosUsuario() {
		
	}
	String usuario1="";
	String pass1="";
	
	public int probarPass() {
		usuario1=VInicio.txtusuario.getText();
		pass1=VInicio.pass.getText();
		if (usuario1.equals("kory")&&pass1.equals("1234")) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
}
