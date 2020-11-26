import java.util.*;
class test{
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
        while
        
    }
}