public class WhileW {
    public static void main(String[] args) {
        int i=0;
        while(i<5)
        {
            if(i==1 || i==3)
            {
                System.out.print("w" + "w");
            }
            else if(i==2)
            {
                System.out.print("w" + "w" + "w");
            }
            else{
            System.out.print("w");
            }
            System.out.println();
            i++;
        }
        
    }
}
