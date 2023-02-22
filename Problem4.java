import java.util.Scanner;
public class Problem4
{

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int storageA[][] = new int [3][3];
        int storageB[][] = new int [3][3];
        int sum[][] = new int [3][3];
        String displayA = "";
        String displayB = "";
        String displaySum = "";
   
        //Getting the input for Array A
        for(int r =0; r<storageA.length; r++) // Rows
        {
            for(int c=0; c <storageA.length; c++) // Columns
            {
                System.out.print("Enter number for Array A index ["+r+"] ["+c+"]: ");
                storageA[r][c] = s.nextInt();
                displayA+=storageA[r][c];
            }
            displayA+="\n";   
        }
        
        System.out.println("");
        //Getting the input for Array B
        for(int r =0; r<storageB.length; r++)
        {//Start of Outer Loop
            for(int c=0; c <storageB.length; c++)
            {//Start of Inner Loop
                System.out.print("Enter number for Array B index ["+r+"] ["+c+"]: ");
                storageB[r][c] = s.nextInt();
                displayB+=storageB[r][c];
            }//End of Inner Loop
            displayB+="\n";   
        }//End of Outer Loop
        
        //Getting the Sum
        for(int r =0; r<storageB.length; r++)
        {
            for(int c=0; c <storageB.length; c++)
            {
                
                sum [r][c]= (storageA[r][c] + storageB[r][c]); 
                displaySum+=sum[r][c]+" ";
            }
            displaySum+="\n";   
        }
        //Displaying all the Output
        System.out.println("");
        System.out.println("Array A: \n" + displayA + "\nArray B: \n" + displayB
                +"\nSum numbers of Array A and Array B: \n" + displaySum);
    }
}