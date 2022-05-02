public class CountElements{
	public static int numOfElements(Integer[] arr){
		int increment = 0;
		for(int i = 0; i < arr.length + 1; i++){
			increment ++;
		}
		return increment;
	}
}
