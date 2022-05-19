package ga1;
/*transpose of an array*/
public class ArrayTrans {

	public static void main(String[] args) {
		int prac[][]= {{1,2,3,4},{5,6,7,8}};
		int m = prac.length;
		int n = prac[0].length;
		for(int i=0; i<m; i++) {
			for(int j =0; j<n;j++) {
				System.out.println(prac[i][j]);
			}
			System.out.println("");
		}
		System.out.println(m);
		System.out.println(n);
		System.out.println("transpose of above array");
		int transprac[][]= new int [n][m];
		for(int l=0; l<n; l++) {
			for(int q=0; q<m;q++) {
				transprac[l][q]= prac[q][l];;
			}
		}
		for(int l=0; l<n; l++) {
			for(int q =0; q<m;q++) {
				System.out.println(transprac[l][q]);
				
			}
			System.out.println("");
		}
		
		

	}

}
