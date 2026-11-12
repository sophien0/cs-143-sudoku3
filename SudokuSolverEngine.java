
public class SudokuSolverEngine {

   public static void main(String[] args) {
      // Here I have called my class `MySudokuBoard` if you named your class
      // differently, modify the line below to use your own class name
      SudokuBoard3 board = new SudokuBoard3("very-fast-solve.sdk");
      System.out.println("Initial board");
      System.out.println(board);
      System.out.println();
      
      //check if the board is valid
      if(!board.isValid()){
         System.out.println("This board cannot be solved because it is invalid.");
      } else if (board.isSolved()) {
         System.out.println("This board is already solved.");
      } else {
         System.out.print("Solving board...");
    
      long start = System.currentTimeMillis();
      
      //declare a variable : solved
      boolean solved = board.solve();
      long stop = System.currentTimeMillis();
      
      //use solve method to show the result
      if(solved){
         System.out.printf("SOLVED in %.3f seconds.\n",
            ((stop-start)/1000.0));
      } else{
         System.out.println("No solution found.");
        }
      }
      System.out.println();
      System.out.println(board);

           
   }
}


