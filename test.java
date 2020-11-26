import java.util.*;
class test{
    static int[][] pos(String move){
        position[0][0]=1;
        position[0][1]=1;
        return position;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String [][]board=new String[5][5];
        System.out.println("Player 1 enter order of your pawns");
        for(int i=0;i<5;i++){
            board[0][i]=sc.next()+" A";
        }

        System.out.println("Player 2 enter order of your pawns");
        for(int i=0;i<5;i++){
            board[4][i]=sc.next()+" B";
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++)
            System.out.print(board[i][j]+" ");
            System.out.println();
        }
        String winner="NO";
        int chance=1;
        while(winner=="NO"){
            if(chance==1){
                System.out.println("Player 1 enter your move");
                String move=sc.next();
                String a=move.charAt(3);
                int [][]position=new int[0][1];
                position=pos(move);
                if(a=="R"){

                }
                else if(a=="L"){

                }
                else if(a=="F"){

                }
                else if(a=="B"){

                }
                else{
                    System.out.println("Wrong input please enter again");
                    continue;
                }

                chance=2;
            }
            else if(chance==2){
                System.out.println("Player 1 enter your move");
                chance=1;
            }
        }
        
    }
}