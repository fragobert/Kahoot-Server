
public class CompareArrays {
	
	public static boolean compareArray (int[] arr1, int[] arr2) {
		if(arr1.length != arr2.length) {
			return false;
		}else {
			for(int i = 0; i < arr1.length; i++) {
				if(arr1[i] != arr2[i]) {
					return false;
				}
			}
			return true;
		}
	}

}