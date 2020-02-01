import java.util.Scanner;

import entities.Triangle;

public class Application {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				
		Triangle x,y;
		x=new Triangle();
		y=new Triangle();
		
		System.out.println("Entre as medidas do trinagulo X: ");
		x.a=sc.nextDouble();
		x.b=sc.nextDouble();
		x.c=sc.nextDouble();
				
		
		System.out.println("Entre as medidas do trinagulo Y: ");
		y.a=sc.nextDouble();
		y.b=sc.nextDouble();
		y.c=sc.nextDouble();
		
		double areaX=x.area();
		double areaY=y.area();
		
		System.out.printf("Triangulo X area: %.4f%n",areaX);
		System.out.printf("Triangulo Y area: %.4f%n",areaY);
		
		if (areaX > areaY) {
			System.out.println("Area triangulo X maior");
						
		} else {
			System.out.println("Area triangulo Y maior");
			
		}
		
		
		
		
		sc.close();
	}

}
