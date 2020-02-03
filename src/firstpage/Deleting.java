package firstpage;

public class Deleting {

	public static void main(String[] args) {
		int[] array1= {1,2,3,4,8,10,20};
		int[] array2= {1,4,10,15,16,};
		
		for (int i=0; i<array1.length;i++) {
			for(int j=0; j<array2.length;j++) {
				if(array1[i]==array2[j]) {
					System.out.println(array2[j]);
				}
			}
		}
		
		// TODO Auto-generated method stub

	}

}
