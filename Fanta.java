import java.util.Scanner;
import java.util.*;

public class Fanta {
    private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

        int vv = 11, i,plus=0;
        double voto, somma=0, media;
	    String noms;

        Vector<String> nomi = new Vector(vv);
        Vector voti = new Vector(vv);
        for (i = 0; i <= vv - 1; i++) {
                System.out.println("Inserire il nome del "+ (i+1) + "  calciatore");
                noms = input.nextLine();
                nomi.add(noms);
        }
        
        for (i = 0; i <= vv - 1; i++) {
            System.out.println("Inserire il voto di " + nomi.get(i));
            voto = input.nextDouble();
            voti.add(voto);
            somma = somma + voto;
            if(voto<6) {
            	plus = plus +1;
            }
    }

        media = somma / 11;
        

        System.out.println("\nVisualizzazione della formazione con il suo voto");
        for(i = 0; i < vv; i++){
            System.out.println(nomi.get(i));
            System.out.println(voti.get(i));
        }
        System.out.println("Media voto squadra: "+media);
        System.out.println("Voti inferiori a 6: "+plus);

        double max, min;
		max = (double) voti.get(0);
		min = (double) voti.get(0);
		for(i=1; i<vv; i++) {
			
			if((double)voti.get(i)>max) {
				max = (double)voti.get(i);
			}
			if((double)voti.get(i)<min) {
				min = (double)voti.get(i);
			}
		}
		System.out.println("Il voto più piccolo è "+min);
		System.out.println("Il voto più grande è "+max);
        
	}
}
