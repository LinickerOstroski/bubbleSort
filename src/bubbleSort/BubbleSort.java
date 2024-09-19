package bubbleSort;

import java.util.Random;

public class BubbleSort {
	
	public static void printArray(int[] numbers) {
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		int[] numbers = new int[20];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(100);
		}
		
		System.out.println("Before:");
		printArray(numbers);
		
		boolean swappedSomething = true;
			
		while(swappedSomething){
				
			swappedSomething = false;				
			/*Comparamos com até o penultimo < numbers.length -1,
			 * pois não precisamos comparar com o ultimo já que 
			 * não haverá mais nada ali depois dele para comparar
			 */
			for(int i = 0; i < numbers.length -1; i++) {
				/*Aqui em baixo estamos comparando se o elemento é maior que
				 * o próximo, se sim estão fora de ordem e precisamos troca-los*/
				if(numbers[i] > numbers[i + 1]) {
					swappedSomething = true;
					int temp = numbers[i];
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = temp;
				}		
			}
		}
		
		System.out.println("\nAfter:");
		printArray(numbers);
		
	}
}
