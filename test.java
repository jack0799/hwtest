import java.util.*;
class test{
    static int[] pos(String move,String pla,String [][]board){
        String chara=move.charAt(0)+""+move.charAt(1)+" "+pla;
        System.out.println(chara);
        int []position=new int[2];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(board[i][j].equals(chara)){
                    position[0]=i;
                    position[1]=j;
                    break;

                }
            }
        }
        
        return position;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String [][]board=new String[5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++)
            board[i][j]="0000";
        }
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
            Bposs.add(board[4][i]);
        }



        for(int i=0;i<5;i++){
            //System.out.println(Bposs.get(i));
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
                
                if(!Aposs.contains(move.charAt(0)+""+move.charAt(1)+" A")){
                    //System.out.println(move.charAt(0)+""+move.charAt(1)+" A");
                    System.out.println("Character Dead");
                    continue;
                }
                char a=move.charAt(3);
                int []position=new int[2];
                position=pos(move,"A",board);
                if(a=='L'){
                    if(position[1]==4){
                        System.out.println("Cannot move to right as it is outside the board");
                        continue;
                    }
                    if(board[position[0]][position[1]+1].charAt(3)=='A'){
                        System.out.println("Cannot move to right as your character is already there");
                        continue;
                    }
                    else if(board[position[0]][position[1]+1].charAt(3)=='B'){
                        Bpoints--;
                        Bposs.remove(board[position[0]][position[1]+1]);
                        board[position[0]][position[1]+1]=move.charAt(0)+""+move.charAt(1)+" A";
                        board[position[0]][position[1]]="0000";
                    }
                    else if(board[position[0]][position[1]+1]=="0000"){
                        
                        board[position[0]][position[1]+1]=move.charAt(0)+""+move.charAt(1)+" A";
                        board[position[0]][position[1]]="0000";
                    }
                    else{
                        System.out.println("Please enter properly");
                        continue;
                    }
                }
                else if(a=='R'){
                    if(position[1]==0){
                        System.out.println("Cannot move to left as it is outside the board");
                        continue;
                    }
                    if(board[position[0]][position[1]-1].charAt(3)=='A'){
                        System.out.println("Cannot move to left as your character is already there");
                        continue;
                    }
                    else if(board[position[0]][position[1]-1].charAt(3)=='B'){
                        Bpoints--;
                        Bposs.remove(board[position[0]][position[1]-1]);
                        board[position[0]][position[1]-1]=move.charAt(0)+""+move.charAt(1)+" A";
                        board[position[0]][position[1]]="0000";
                    }
                    else if(board[position[0]][position[1]-1]=="0000"){
                        board[position[0]][position[1]-1]=move.charAt(0)+""+move.charAt(1)+" A";
                        board[position[0]][position[1]]="0000";
                    }
                    else{
                        System.out.println("Please enter properly");
                        continue;
                    }

                }
                else if(a=='B'){
                    if(position[0]==0){
                        System.out.println("Cannot move to up as it is outside the board");
                        continue;
                    }
                    if(board[position[0]-1][position[1]].charAt(3)=='A'){
                        System.out.println("Cannot move to up as your character is already there");
                        continue;
                    }
                    else if(board[position[0]-1][position[1]].charAt(3)=='B'){
                        Bpoints--;
                        Bposs.remove(board[position[0]-1][position[1]]);
                        board[position[0]-1][position[1]]=move.charAt(0)+""+move.charAt(1)+" A";
                        board[position[0]][position[1]]="0000";
                    }
                    else if(board[position[0]-1][position[1]]=="0000"){
                        board[position[0]-1][position[1]]=move.charAt(0)+""+move.charAt(1)+" A";
                        board[position[0]][position[1]]="0000";
                    }
                    else{
                        System.out.println("Please enter properly");
                        continue;
                    }

                }
                else if(a=='F'){
                    if(position[0]==4){
                        System.out.println("Cannot move to down as it is outside the board");
                        continue;
                    }
                    if(board[position[0]+1][position[0]].charAt(3)=='A'){
                        System.out.println("Cannot move to right as your character is already there");
                        continue;
                    }
                    else if(board[position[0]+1][position[1]].charAt(3)=='B'){
                        Bpoints--;
                        Bposs.remove(board[position[0]+1][position[1]]);
                        board[position[0]+1][position[1]]=move.charAt(0)+""+move.charAt(1)+" A";
                        board[position[0]][position[1]]="0000";
                    }
                    else if(board[position[0]+1][position[1]]=="0000"){
                        board[position[0]+1][position[1]]=move.charAt(0)+""+move.charAt(1)+" A";
                        board[position[0]][position[1]]="0000";
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
                System.out.println("Player 2 enter your move");
                String move=sc.next();
                if(!Bposs.contains(move.charAt(0)+""+move.charAt(1)+" B")){
                    System.out.println(move.charAt(0)+""+move.charAt(1)+" B");
                    System.out.println("Character Dead");
                    continue;
                }
                char a=move.charAt(3);
                int []position=new int[1];
                position=pos(move,"B",board);
                System.out.println(Arrays.toString(position));
                if(a=='R'){
                    if(position[1]==4){
                        System.out.println("Cannot move to right as it is outside the board");
                        continue;
                    }
                    if(board[position[0]][position[1]+1].charAt(3)=='B'){
                        System.out.println("Cannot move to right as your character is already there");
                        continue;
                    }
                    else if(board[position[0]][position[1]+1].charAt(3)=='A'){
                        Apoints--;
                        Aposs.remove(board[position[0]][position[1]+1]);
                        board[position[0]][position[1]+1]=move.charAt(0)+""+move.charAt(1)+" B";
                        board[position[0]][position[1]]="0000";
                    }
                    else if(board[position[0]][position[1]+1]=="0000"){
                        
                        board[position[0]][position[1]+1]=move.charAt(0)+""+move.charAt(1)+" B";
                        board[position[0]][position[1]]="0000";
                    }
                    else{
                        System.out.println("Please enter properly");
                        continue;
                    }
                }
                else if(a=='L'){
                    if(position[1]==0){
                        System.out.println("Cannot move to left as it is outside the board");
                        continue;
                    }
                    if(board[position[0]][position[1]-1].charAt(3)=='B'){
                        System.out.println("Cannot move to left as your character is already there");
                        continue;
                    }
                    else if(board[position[0]][position[1]-1].charAt(3)=='A'){
                        Apoints--;
                        Aposs.remove(board[position[0]][position[1]-1]);
                        board[position[0]][position[1]-1]=move.charAt(0)+""+move.charAt(1)+" B";
                        board[position[0]][position[1]]="0000";
                    }
                    else if(board[position[0]][position[1]-1]=="0000"){
                       
                        board[position[0]][position[1]-1]=move.charAt(0)+""+move.charAt(1)+" B";
                        board[position[0]][position[1]]="0000";
                    }
                    else{
                        System.out.println("Please enter properly");
                        continue;
                    }

                }
                else if(a=='F'){
                    if(position[0]==0){
                        System.out.println("Cannot move to up as it is outside the board");
                        continue;
                    }
                    if(board[position[0]-1][position[1]].charAt(3)=='B'){
                        System.out.println("Cannot move to up as your character is already there");
                        continue;
                    }
                    else if(board[position[0]-1][position[1]].charAt(3)=='A'){
                        Apoints--;
                        Aposs.remove(board[position[0]+1][position[1]]);
                        board[position[0]-1][position[1]]=move.charAt(0)+""+move.charAt(1)+" B";
                        board[position[0]][position[1]]="0000";
                    }
                    else if(board[position[0]-1][position[1]]=="0000"){
                       
                        board[position[0]-1][position[1]]=move.charAt(0)+""+move.charAt(1)+" B";
                        board[position[0]][position[1]]="0000";
                    }
                    else{
                        System.out.println("Please enter properly");
                        continue;
                    }

                }
                else if(a=='B'){
                    if(position[0]==4){
                        System.out.println("Cannot move to down as it is outside the board");
                        continue;
                    }
                    if(board[position[0]+1][position[0]].charAt(3)=='B'){
                        System.out.println("Cannot move to right as your character is already there");
                        continue;
                    }
                    else if(board[position[0]+1][position[1]].charAt(3)=='A'){
                        Apoints--;
                        Aposs.remove(board[position[0]+1][position[1]]);
                        board[position[0]+1][position[1]]=move.charAt(0)+""+move.charAt(1)+" B";
                        board[position[0]][position[1]]="0000";
                    }
                    else if(board[position[0]+1][position[1]]=="0000"){
                       
                        board[position[0]+1][position[1]]=move.charAt(0)+""+move.charAt(1)+" B";
                        board[position[0]][position[1]]="0000";
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
                chance=1;

            }
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++)
                System.out.print(board[i][j]+" ");
                System.out.println();
            }
            if(Apoints==0||Bpoints==0){
                break;
            }
        }
        
    }
}