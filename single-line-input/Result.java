import java.util.Scanner;

public class Result {

    private int size;
    
    public Result(int size){
        
        this.size = size;
    }

    public int simpleArraySum(int[] ar) {
        
        int sum = 0;
        
        for (int x = 0; x < size; x++){
            
            sum = sum + ar[x];
        }
        
        
        return sum;
    }

}

public class Solution {
    public static void main(String[] args){
       
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the array's size: ");
        int size = input.nextInt();
        input.nextLine();
        
        String inputline = input.nextLine();
        String[] elements = inputline.split("\\s+"); //Splitting string on here based on whitespaces.
        int[] array = new int[size];
        
        for (int x = 0; x < size; x++){
            
            array[x] = Integer.parseInt(elements[x]); 
        }
        
        Result object = new Result(size);
        int result = object.simpleArraySum(array);
        
        System.out.println(result);

        
    }
}
