package repasoArrays;

import java.util.Arrays;

public class SumaArrays {

	public static void main(String[] args) {
		int[] nums1 = {6,0,5,1};
		int[] nums2 = {4,10,5,9};
		int[] numsSuma = new int[nums1.length];
	
		for (int i = 0; i < numsSuma.length; i++) {
			numsSuma[i] = nums1[i] + nums2[i];
			
		}
		
		System.out.println(Arrays.toString(numsSuma));
		
	}

}
