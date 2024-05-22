package arrays;

public class ContarParesImpares {

		public static void main(String[] args) {
			int[] nums = {6,0,5,1};
			int contPares = 0;
			int contImpares = 0;
		
			for (int i = 0; i < nums.length; i++) {
				if(nums[i] % 2 == 0) {
					contPares++;
				}else {
					contImpares++;
				}
			}
				System.out.println("Hay " + contPares + " pares y " + contImpares + " impares.");
			}
}