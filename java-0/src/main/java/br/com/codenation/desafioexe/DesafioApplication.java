package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

	public static List<Integer> fibonacci() {
		List<Integer> arrayF;
		arrayF = new ArrayList<>();
		
		int F = 0;     // atual
        int ant = 0;   // anterior

        for (int i = 0; i <= 14; i++) {
            if (i <= 1) {
                F = i;
                ant = 0;
                arrayF.add(F);
            } else {
                F += ant;
                ant = F - ant;
                arrayF.add(F);
            }
        }
		
		return arrayF;
	}

	public static Boolean isFibonacci(Integer a) {
		int F = 0;     // atual
        int ant = 0;   // anterior

        for (int i = 0; i <= 400; i++) {
            if (i <= 1) {
                F = i;
                ant = 0;               
            } else {
                F += ant;
                ant = F - ant;               
            }
            if (a == F) {
            	return true;
            }
        }
		return false;
	}

}