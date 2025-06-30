import java.util.*;
class Java4{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the list : ");
        String input = scan.next();
        String[] inputArray = input.split(",");
        List<Integer> list = new ArrayList<>();
        for(String x:inputArray){
            list.add(Integer.parseInt(x.trim()));
        }
        Map<Integer,Integer> result = new HashMap<>();
        for(int i=1;i<=9;i++){
            int count=0;
            for(int n: list){
                if(n%i==0) count++;
            }
            result.put(i,count);
        }
        System.out.println(result);
    }
}