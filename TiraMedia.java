package exercicios;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;


public class TiraMedia {
	static Scanner ler = new Scanner(System.in);
	
	public static String aprova(int media) {
		if(media > 6 && media <= 10) {
			String situacao = "Aprovado";
			return situacao;
		}
		else {
			String situacao = "Reprovado";
			return situacao;
		}
		
	}
	
	public static ArrayList<Integer> pedeNotas(int numero) {
		ArrayList <Integer> listaNotas = new ArrayList<Integer>();
		
		int i = 0;
		while (i<numero) {
			System.out.println("Digite a sua nota");
			int resposta = ler.nextInt();
			listaNotas.add(resposta);
			i+=1;
		}
		return listaNotas;
	}
	public static int tiraMedia(ArrayList<Integer> numero, int provas) {
		Iterator<Integer> i = numero.iterator();

		int soma=0;
		while (i.hasNext()) {
			soma = soma + i.next();
		}
		
		int media = soma/provas;
	
		return media;
	}
	
	

	public static void main(String[] args) {
		ArrayList<Integer> listaNotas = new ArrayList<Integer>();
	
		System.out.println("Quantas provas voce teve?");
		int provas = ler.nextInt();
		listaNotas = pedeNotas(provas);
		int media = tiraMedia(listaNotas, provas);
		System.out.println("A sua media foi: "+ media);
		System.out.println("Voce foi: "+ aprova(media));
		
		
	}

}
