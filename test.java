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
        ArrayList<String> Aposs= new ArrayList<String>(); 
        ArrayList<String> Bposs= new ArrayList<String>(); 

        System.out.println("Player 1 enter order of your pawns");
        for(int i=0;i<5;i++){
            board[0][i]=sc.next()+" A";
            Aposs.add(board[0][i]);

        }

        System.out.println("Player 2 enter order of your pawns");
        for(int i=0;i<5;i++){
            board[4][i]=sc.next()+" B";
            Bposs.add(board[0][i]);
        }



        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++)
            System.out.print(board[i][j]+" ");
            System.out.println();
        }



        String winner="NO";
        int chance=1;
        int Apoints=5;
        int Bpoints=5;
        while(winner=="NO"){
            if(chance==1){
                System.out.println("Player 1 enter your move");
                String move=sc.next();
                String a=move.charAt(3);
                int [][]position=new int[0][1];
                position=pos(move);
                if(a=="R"){
                    if(position[0][1]==4){
                        System.out.println("Cannot move to right as it is outside the board");
                        continue;
                    }
                    if(board[position[0][0]][position[0][1]+1].charAt(3)=='A'){
                        System.out.println("Cannot move to right as your character is already there");
                        continue;
                    }
                    else if(board[position[0][0]][position[0][1]+1].charAt(3)=='B'){
                        Bpoints--;
                        board[position[0][0]][position[0][1]+1]=move.charAt(0)+move.charAt(1)+" A";
                    }
                    else{
                        System.out.println("Please enter properly");
                        continue;
                    }
                }
                else if(a=="L"){
                    if(position[0][1]==0){
                        System.out.println("Cannot move to left as it is outside the board");
                        continue;
                    }
                    if(board[position[0][0]][position[0][1]-1].charAt(3)=='A'){
                        System.out.println("Cannot move to left as your character is already there");
                        continue;
                    }
                    else if(board[position[0][0]][position[0][1]-1].charAt(3)=='B'){
                        Bpoints--;
                        board[position[0][0]][position[0][1]-1]=move.charAt(0)+move.charAt(1)+" A";
                    }
                    else{
                        System.out.println("Please enter properly");
                        continue;
                    }

                }
                else if(a=="F"){
                    if(position[0][0]==4){
                        System.out.println("Cannot move to up as it is outside the board");
                        continue;
                    }
                    if(board[position[0][0]+1][position[0][1]].charAt(3)=='A'){
                        System.out.println("Cannot move to up as your character is already there");
                        continue;
                    }
                    else if(board[position[0][0]+1][position[0][1]].charAt(3)=='B'){
                        Bpoints--;
                        board[position[0][0]+1][position[0][1]]=move.charAt(0)+move.charAt(1)+" A";
                    }
                    else{
                        System.out.println("Please enter properly");
                        continue;
                    }

                }
                else if(a=="B"){
                    if(position[0][0]==0){
                        System.out.println("Cannot move to down as it is outside the board");
                        continue;
                    }
                    if(board[position[0][0]-1][position[0][0]].charAt(3)=='A'){
                        System.out.println("Cannot move to right as your character is already there");
                        continue;
                    }
                    else if(board[position[0][0]-1][position[0][1]].charAt(3)=='B'){
                        Bpoints--;

                        board[position[0][0]-1][position[0][1]]=move.charAt(0)+move.charAt(1)+" A";
                    }
                    else{
                        System.out.println("Please enter properly");
                        continue;
                    }

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