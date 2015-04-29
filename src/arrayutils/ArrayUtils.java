package arrayutils;

public class ArrayUtils {
	public static double[] intToDouble(int[] src){
		int length = src.length;
		double[] doubleArray = new double[length];
		
		for(int i=0;i<length;i++){
			doubleArray[i] = src[i];
		}
		
		return doubleArray;
	}
	
	public static int[] doubleToInt(double[] src){
		int length = src.length;
		int[] intArray = new int[length];
	
		for(int i=0; i<length; i++){
			intArray[i] = (int)src[i];
		}
		
		return intArray;
	}
	
	public static int[] concat(int[] a1, int[] a2){
		int len1 = a1.length;
		int len2 = a2.length;
		int[] con = new int[len1+len2];
		
		for(int i=0; i<len1; i++){
			con[i]=a1[i];
		}
		for(int i=len1; i<(len1+len2);i++){
			con[i]=a2[i-len1];
		}
		
		return con;
	}
}
