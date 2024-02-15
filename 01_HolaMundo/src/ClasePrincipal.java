import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClasePrincipal {
	
	public static void main(String[] args) {
	System.out.println("Hola Mundo");	
	
	
	 devolverDni("12141241sa");
	
	}
	public static boolean devolverDni( String dni) {
		String expresion = "^[a-zA-Z0-9]{9}$"; 

        Pattern pattern = Pattern.compile(expresion);
        Matcher matcher = pattern.matcher(dni);

    
        if (matcher.find()) { 
            System.out.println("Tu dni es valido : " + dni);
        } else {
            System.out.println("El dni no es valido.");
        }
		return devolverDni(dni);
	}
}
