
public class App {
    public static void main(String[] args) throws Exception {
  
        char [][] mdArray = {{'S','L','A','M'}, {'T','I','L', 'E'}, {'E','A','T','S'}, {'P', 'R', 'O', 'S'}};
    
  
        System.out.println("UNANG WORD");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (row == 0) {
                    System.out.print(mdArray[row][column]);
                }
            }
        }
        
        System.out.println("");
        System.out.println("PANGALAWANG WORD");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (row == 1) {
                    System.out.print(mdArray[row][column]);
                }
            }
        }
        
        System.out.println("");
        System.out.println("PANGATLONG WORD");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (row == 2) {
                    System.out.print(mdArray[row][column]);
                }
            }
        }
        

        System.out.println("");
        System.out.println("PANG APAT NA WORD");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (row == 3) {
                    System.out.print(mdArray[row][column]);
                }
            }
        }
    
        System.out.println("");
        System.out.println("PANG LIMA NA WORD");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (column == 0) {
                    System.out.print(mdArray[row][column]);
                }
            }
        }
      
        System.out.println("");
        System.out.println("PANG ANIM NA WORD");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (column == 1) {
                    System.out.print(mdArray[row][column]);
                }
            }
        }
        
        System.out.println("");
        System.out.println("PANG PITO NA WORD");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (column == 2) {
                    System.out.print(mdArray[row][column]);
                }
            }
        }


        System.out.println("");
        System.out.println("PANG WALO NA WORD");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (column == 3) {
                    System.out.print(mdArray[row][column]);
                }
            }
        }

        System.out.println("");
        System.out.println("PANG SIYAM NA WORD");

        for (int row = 3; row >= 0  ; row--) {
            System.out.println("");
            for (int column = 0; column >= 0; column--) {
                if (column == 0) {
                    System.out.print(mdArray[row][column]);
                }
            }
        }

        System.out.println("");
        System.out.println("PANG SAMPU NA WORD");

        for (int row = 3; row >= 0 ; row--) {
            System.out.println("");
            for (int column = 1; column >= 0 ; column--) {
                if (column == 1) {
                    System.out.print(mdArray[row][column]);
                }
            }
        }

        System.out.println("");
        System.out.println("PANG LABING ISA NA WORD");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (column == 0 && row == 0) {
                    System.out.print(mdArray[row][column]);
                }
                else if (row == 1 && column == 1) {
                    System.out.print(mdArray[row][column]);
                }
                else if (row == 2 && column == 2) {
                    System.out.print(mdArray[row][column]);
                }
                else if (row == 3 && column == 3) {
                    System.out.print(mdArray[row][column]);
                }
                else{
                    System.out.print(" ");
                }
                
            }
        }

        System.out.println("");
        System.out.println("PANG LABING DALAWA NA WORD");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (column == 0 && row == 3) {
                    System.out.print(mdArray[row][column]);
                }
                else if (row == 2 && column == 1) {
                    System.out.print(mdArray[row][column]);
                }
                else if (row == 1 && column == 2) {
                    System.out.print(mdArray[row][column]);
                }
                else if (row == 0 && column == 3) {
                    System.out.print(mdArray[row][column]);
                }
                else{
                    System.out.print(" ");
                }
                
            }
        }
        System.out.println("");
        System.out.println("PANG LABING TATLO NA WORD");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (column == 0 && row == 3) {
                    System.out.print(mdArray[row][column]);
                }
                else if (row == 2 && column == 1) {
                    System.out.print(mdArray[row][column]);
                }
                else if (row == 1 && column == 2) {
                    System.out.print(mdArray[row][column]);
                }
                else{
                    System.out.print(" ");
                }
                
            }
        }

        System.out.println("");
        System.out.println("PANG LAABING APAT NA WORD");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 3; column++) {
                if (row == 2) {
                    System.out.print(mdArray[row][column]);
                }
            }
        }

        System.out.println("");
        System.out.println("PANG LABING LIMA NA WORD");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 3; column++) {
                if (row == 3) {
                    System.out.print(mdArray[row][column]);
                }
            }
        }

        System.out.println("");
        System.out.println("PANG LABING ANIM NA WORD");
        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 1; column < 4; column++) {
                if (row == 0) {
                    System.out.print(mdArray[row][column]);
                }
            }
        }

        System.out.println("");
        System.out.println("PANG LABING PITO NA WORD");
        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 2; column >= 0; column--) {
                if (row == 1) {
                    System.out.print(mdArray[row][column]);
                }
            }
        }

        System.out.println("");
        System.out.println("PANG LABING WALO WORD");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 3; column++) {
                if (row == 1) {
                    System.out.print(mdArray[row][column]);
                }
            }
        }
        
        System.out.println("");
        System.out.println("PANG LABING SIYAM NA WORD");

        for (int row = 2; row >= 0 ; row--) {
            System.out.println("");
            for (int column = 1; column >= 0 ; column--) {
                if (column == 1) {
                    System.out.print(mdArray[row][column]);
                }
            }
        }

        System.out.println("");
        System.out.println("PANG DALAWANGPU WORD");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 1; column < 4; column++) {
                if (row == 3) {
                    System.out.print(mdArray[row][column]);
                }
            }
        }

        System.out.println("");
        System.out.println("PANG DALAWAMPU'T ISA NA WORD");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (column == 0 && row == 0) {
                    System.out.print(mdArray[row][column]);
                }
                else if (row == 1 && column == 1) {
                    System.out.print(mdArray[row][column]);
                }
                else if (row == 2 && column == 2) {
                    System.out.print(mdArray[row][column]);
                }
                else{
                    System.out.print(" ");
                }
                
            }
        }

        System.out.println("");
        System.out.println("PANG DALAWAMPU'T DALAWA WORD");

        for (int row = 2; row >= 0; row--) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (column == 3) {
                    System.out.print(mdArray[row][column]);
                }
            }
        }

        System.out.println("");
        System.out.println("PANG DALAWAMPU'T TATLO WORD");

        for (int row = 3; row > 0  ; row--) {
            System.out.println("");
            for (int column = 0; column >= 0; column--) {
                if (column == 0) {
                    System.out.print(mdArray[row][column]);
                }
            }
        }
        
    }
  }
