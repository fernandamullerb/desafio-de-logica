package desafiodelogicads1;
import java.util.Scanner;
public class DesafiodeLogicaDS1 {


    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe os 9 primeiros dígitos do CPF (apenas números): ");
        String digitos = teclado.next();
        int[] cpf = converterStringParaVetorInt(digitos);

        int l = cpf[0]*10 + cpf[1]*9 + cpf[2]*8 + cpf[3]*7 + cpf[4]*6 + cpf[5]*5 + cpf[6]*4 + cpf[7]*3 + cpf[8]*2;
        int restod10 = l % 11;
        int d10 = 0;
	if (restod10 == 0 || restod10 == 1) {
            d10 = 0;
	} else {
            d10 = 11 - restod10;
	}
	cpf[9] = d10;

        int m = cpf[1]*10 + cpf[2]*9 + cpf[3]*8 + cpf[4]*7 + cpf[5]*6 + cpf[6]*5 + cpf[7]*4 + cpf[8]*3 + cpf[9]*2;
        int restod11 = m % 11;
        int d11 = 0;
	if (restod11 == 0 || restod11 == 1) {
            d11 = 0;
	} else {
            d11 = 11 - restod11;
	}
        cpf[10] = d11;
        
        System.out.println("CPF completo: " + converterVetorIntParaString(cpf));
    }
    
    static int[] converterStringParaVetorInt(String cpfString) {
        int[] cpfNumerico = new int[11];
        for (int i = 0; i < cpfString.length(); i++) {
            cpfNumerico[i] = Character.getNumericValue(cpfString.charAt(i));
        }
        return cpfNumerico;
    }
    
    static String converterVetorIntParaString(int[] cpfNumerico) {
        String cpfString = "";
        for (int i = 0; i < cpfNumerico.length; i++) {
            cpfString += Integer.toString(cpfNumerico[i]);
        }
        return cpfString;
    }
    
}
