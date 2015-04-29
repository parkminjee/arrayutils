package arrayutils;

public class ArrayUtilsTest {
	public static void main(String[] args) {
		
		//1. ArrayUtils.intToDouble Test
		int[] intArray={10, 20, 30, 40, 50};
		
		double[] doubleArray = ArrayUtils.intToDouble(intArray);
		
		int length = doubleArray.length;
		for(int i=0; i<length; i++){
			System.out.println(doubleArray[i]);
		}
		
		//2. double to integer
		double[] doubleArr = {10.1, 20.5, 30.4, 40.0, 50.8};
		
		int[] intArr = ArrayUtils.doubleToInt(doubleArr);
		
		int length1 = intArr.length;
		for(int i=0; i<length1;i++){
			System.out.println(intArr[i]);
		}
		
		//3. 
		int[] intA1={1, 3, 5, 7, 9};
		int[] intA2={2, 4, 6, 8, 354};
		
		int[] con = ArrayUtils.concat(intA1,intA2);
		
		int length2 = con.length;
		
		for(int i=0; i<length2; i++){
			System.out.println(con[i]);
		}
	}
}
