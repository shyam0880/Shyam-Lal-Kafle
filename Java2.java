import java.util.*;
class Java2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the numbers of odd you want : ");
        int range = scan.nextInt();
        System.out.print("Output: ");
        for(int i=1;i<=range;i++){
            System.out.print(2*i-1);
            if(i<range) System.out.print(",");
        }
        scan.close();
    }
}