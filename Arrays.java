package test_project;

public class Arrays {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1D array
		char[] a=new char[5];
		a[0]='a';
		a[1]='b';
		a[2]='c';
		a[3]='d';
		a[4]='e';
		for (int i=0;i<5;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int[] b=new int[5];
		b[0]=1;
		b[1]=2;
		b[2]=3;
		b[3]=4;
		b[4]=5;
		for (int j=0;j<5;j++) {
			System.out.print(b[j]+" ");
		}
		System.out.println();
		//2D array
		int[][] c=new int[3][3];
		int num=1;
		for (int k=0;k<3;k++) {
			for (int l=0;l<3;l++) {
				c[k][l]=num;
				num++;
			}
		}
		for (int q=0;q<3;q++) {
			for (int w=0;w<3;w++) {
				System.out.print(c[q][w]+" ");
			}
			System.out.println();
		}
	}
}