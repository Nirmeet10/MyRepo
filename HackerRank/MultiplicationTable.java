import java.util.Scanner;
class MultiplicationTable{
 public static void main(String[] args) {
 
    int N , i , result;

    Scanner sc = new Scanner(System.in);
     N = sc.nextInt();

    for(i = 1 ; i <= 10; i++){
        result = N*i;
        System.out.println(N+"X"+i+"="+result);
    }
}


}