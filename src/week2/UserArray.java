package week2;

public class UserArray {

	public static void main(String[] args) {
		Object userDetails[][]= {{"admin","admin123"},{"pranali","test123"},{"priya","driver#234"},{"swathi","swathi@456"},{"devi","devi78"}};
   for(int r=0;r<userDetails.length;r++)
   {
	   for(int c=0;c<userDetails[r].length;c++)
	   {
		   System.out.print(userDetails[r][c]+"\t ");
	}
   System.out.println(" ");
   
}
   System.out.println("********************************");
   for (Object o[]:userDetails)
   {
	   for(Object i:o)
	   {
		   System.out.print(i +"\t");
	   }
	   System.out.println();
   }
}}