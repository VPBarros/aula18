import java.util.Locale;
import java.util.Scanner;

import entidade.Retagulo;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Largura e altura de um Retangulo:");
        // programa p/ ler valores de largura e altura de um retangulo
			//mostrando na tela valores de area,perimetro e diagonal.
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		//escrevi o nome retangulo errado e não consigo corrigir
		Retagulo rect = new Retagulo();
		
		System.out.println("Digite a largura e altura do retamgulo: ");
		rect.largura = sc.nextDouble();
		rect.altura = sc.nextDouble();
		
		System.out.printf("Area = %.2f%n" , rect.area());
		System.out.printf("Perimetro = %.2f%n" , rect.perimetro());
		System.out.printf("Diagonal = %.2f%n" ,rect.diagonal());
		 sc.close();
    }
}
