package visao;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int dad1, dad2, qtdJogadores, ts = 1, dig, rFinal;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe a quantidade de jogadores. (Até 12)");
		qtdJogadores = ler.nextInt();
		int[] jogadores = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		while(ts <= qtdJogadores){
			System.out.println("Jogador "+ ts + " digite sua aposta.");
			dig = ler.nextInt();
			jogadores[ts] = dig;
			ts++;
		}

		Random dado1 = new Random();
		Random dado2 = new Random();
		dad1 = (dado1.nextInt(6)+1);
		dad2 = (dado2.nextInt(6)+1);
		//System.out.println("Valor do dado 1 é "+dad1);
		//System.out.println("Valor do dado 2 é "+dad2);
		rFinal = dad1 + dad2;
		System.out.println("Valor final é "+rFinal);
		ts = 0;
		while(ts < qtdJogadores) {
			if (jogadores[ts] == rFinal) {
				System.out.println("Jogador "+ ts +" venceu o jogo.");
			}else {
				System.out.println();
			}
			ts++;
		}
		if(jogadores[0] != rFinal && jogadores[1] != rFinal && jogadores[2] != rFinal && jogadores[3] != rFinal && jogadores[4] != rFinal && jogadores[5] != rFinal && jogadores[6] != rFinal && jogadores[7] != rFinal && jogadores[8] != rFinal && jogadores[9] != rFinal && jogadores[10] != rFinal && jogadores[11] != rFinal && jogadores[12] != rFinal) {
			System.out.println("O computador venceu o jogo.");
		}
		
		
		
	}

}
