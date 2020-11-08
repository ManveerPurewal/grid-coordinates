
package gridcoordinates;

import java.util.Scanner;

public class GridCoordinates {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String [][] grid = new String[11][11];
        
        for(int i = 0; i < 11; i++){
            for(int x = 0; x < 11; x++){
                grid[i][x] = "[ ]";
            }
        }
        
        grid[0][0] = " ";
        
        grid[0][1] = " 1";
        
        for(int i = 2; i < 11; i++){
            grid[0][i] = "  " + String.valueOf(i);
        }
        
        char letter = 'A';
        for(int i = 1; i < 11; i++){
            String letterStr = String.valueOf(letter);
            grid[i][0] = letterStr;
            letter++;
        }
        
        System.out.println("Here is your grid");
        System.out.println("");
        
        for(int i = 0; i < 11; i++){
            for(int x = 0; x < 11; x++){
                System.out.print(grid[i][x]);
            }
            System.out.println("");
        }
        
        
        boolean finish = false;
        String coordinates = grid[0][0];
        int rowInt = 0;
        int collumnInt = 0;
        while(finish == false){
            try {
                System.out.println("enter your coordinates in the following format");
                System.out.println("A,1");
                String coordinateInput = input.next();
                String[] seperate = coordinateInput.split(",");
                String row = seperate[0];
                String collumn = seperate[1];
                char rowChar = row.charAt(0);
                rowInt = rowChar - 'A' + 1;
                collumnInt = Integer.parseInt(collumn);
                coordinates = grid[rowInt][collumnInt];
            }
            catch(ArrayIndexOutOfBoundsException a){
                System.out.println("");
                System.out.println("Please enter coordinates within the grid.");
                System.out.println("");
            }
            
            finally{
                grid[rowInt][collumnInt] = "[#]";
                System.out.println("");
                for(int i = 0; i < 11; i++){
                    for(int x = 0; x < 11; x++){
                    System.out.print(grid[i][x]);
                    }
                    System.out.println("");
                }
                System.out.println("");
                System.out.println("Enter 'stop' in lower case if you dont want to add more coordinates.");
                System.out.println("Otherwise press any buton then enter.");
                System.out.println("");
                String stopSequence = input.next();
                if(stopSequence.equals("stop")){
                    finish = true;
                }
            }
        }
        
        
        
    }
    
}
