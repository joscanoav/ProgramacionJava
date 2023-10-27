package EstructuraFor;

import java.util.Scanner;

public class LeerLadosTriangulos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int i,lado1,lado2,lado3,cant1,cant2,cant3,n;
		cant1=0;
		cant2=0;
		cant3=0;
		System.out.println("ingrese la cantidad de triangulos: ");
		n=teclado.nextInt();
		for (i=1;i<=n;i++) {
			System.out.println("ingrese lado 1: ");
			lado1=teclado.nextInt();
			System.out.println("ingrese lado 2: ");
			lado2=teclado.nextInt();
			System.out.println("ingrese lado 3: ");
			lado3=teclado.nextInt();
			
			if(lado1==lado2 && lado1==lado3) {
				System.out.println("Es un triangulo equilatero.");
				cant1++;
			}else {
				if(lado1==lado2 || lado1==lado3 || lado2==lado3) {
					System.out.println("Es un triangulo isoseles.");
					cant2++;
				}else {
					cant3++;
					System.out.println("Es un triangulo escaleno.");
				}
			}
		}

		System.out.print("Cantidad de triangulos equilateros:");
		System.out.println(cant1);
		System.out.print("Cantidad de triangulos isoseles:");
		System.out.println(cant2);
		System.out.print("Cantidad de triangulos escaleno:");
		System.out.println(cant3);
		
		if ( cant1<cant2 && cant1<cant3) {
			System.out.println("Hay menor cantidad de equilateros");
		} else {
			if (cant2<cant3) {
				System.out.println("Hay menor cantidad de isoseles");
			}else {
				System.out.println("Hay menor cantidad de escalenos");
			}
		}
		
	}

}
