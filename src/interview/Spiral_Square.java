package interview;
/**
 * Question one :  Spiral draw in square with dimension of n
 * @author nazanin
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Spiral_Square {
	public static void main(String[] args){
		try{
			boolean ok = false;
			do{
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	            System.out.print("Enter the  width of a square : ");
	            int dimension = Integer.parseInt(br.readLine());
	            if(dimension < 0)
	            {
	            	System.out.println("Invalid dimension, try again.");
	            	
	            }else if(dimension < 2)
	            {
	            	System.out.println("No spiral ");
	            	ok = true;
	            	
	            }
	            else
	            {
	            	printSpiral(spriral(dimension), dimension);
	            	ok = true;
	            }
            }while(!ok);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	/**
	 * Making spiral move in square with dimension {@link n}
	 * @param n
	 * @return
	 */
	static int[][] spriral(int n){
		int square[][]=new int[n][n];
        int k=1;
        int c1=0;   //index of the column from where we have to begin.
        int c2=n-1; //index of the column where we have to end.
        int r1=0;   //index of the row from where we have to begin.
        int r2=n-1; //index of the row from where we have to end.

        while(k<=n*n)
            {
                for(int i=c1;i<=c2;i++)
                {
                	square[r1][i]=k++;
                }

                for(int j=r1+1;j<=r2;j++)
                {
                	square[j][c2]=k++;
                }

                for(int i=c2-1;i>=c1;i--)
                {
                	square[r2][i]=k++;
                }

                for(int j=r2-1;j>=r1+1;j--)
                {
                	square[j][c1]=k++;
                }

             c1++;
             c2--;
             r1++;
             r2--;
            }
        return square;
	}
	/**
	 * Printing the spiral in square      
	 * @param square
	 * @param n
	 */
	static void printSpiral(int[][] square, int n){
		 for(int i=0;i<n;i++)
         {
             for(int j=0;j<n;j++)
                 {
                     System.out.print(square[i][j]+ "\t");
                 }
          System.out.println();
         }

	}
}


