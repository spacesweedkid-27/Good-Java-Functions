package ggt;

public class GGT {
	 
	 public int ggt(int a, int b) {
	 
	 if (a == 0)
	 return b;
	 while (b != 0) {
	 if (a > b)
	 a = a - b;
	 else
	 b = b - a;
	 }
	 
	 
	 
	 return a;
	 }
	 
	 public int euler(int a) {
		 int temp = 0;
		 for (int i = 0; i < a; i++) {
			 if(ggt(a,i)==1) {
				 temp ++;
			 }
		 }
		 return temp;
	 }
	 
	 public static void main(String[]args) {
		 GGT ggt = new GGT();
		 System.out.println(ggt.euler(9));
	 }
	 
	}