import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ex_A {
//    두 자연수 A와 B가 있을 때, A = BC를 만족하는 자연수 C를 A의 약수라고 한다.
//    예를 들어, 2의 약수는 1, 2가 있고, 24의 약수는 1, 2, 3, 4, 6, 8, 12, 24가 있다.
//    자연수 A의 약수의 합은 A의 모든 약수를 더한 값이고, f(A)로 표현한다. x보다 작거나 같은 모든 자연수 y의 f(y)값을 더한 값은 g(x)로 표현한다.
//    자연수 N이 주어졌을 때, g(N)을 구해보자.

    //아래의 방법으로는 시간초과 발생

     public static void main(String[] args) {


         Scanner input = new Scanner(System.in);
//         int numberInput = input.nextInt();
         int numberInput = 2;
         ArrayList<Integer> numArr = new ArrayList<>();

         numArr = calc(numberInput);
         int sum = 0;

        Iterator<Integer> iterator = numArr.iterator();
        while((iterator.hasNext())){
            sum += iterator.next();
        }



    }
    public static ArrayList<Integer> calc(int n){
         ArrayList<Integer> arr = new ArrayList<>();
         ArrayList<Integer> finalArr = new ArrayList<>();
         arr = numbers(n);
         int sum = 0;
        Iterator<Integer>iterator = arr.iterator();
        ArrayList<Integer> arr2 = new ArrayList<>();
        while ((iterator.hasNext())){
            int a = iterator.next();
            arr2= aliquot(a);
            sum = sum(arr2);
            finalArr.add(sum);
        }
        return finalArr;
    }

    //이하 자연수 구하기
    public static ArrayList<Integer> numbers(int n){
         ArrayList<Integer> numbers = new ArrayList<>();

         for(int i = 1; i<=n; i++){
             numbers.add(i);
         }

        System.out.println("자연수" + numbers);
         return numbers;
    }

    //합 구하기
    public static int sum(ArrayList<Integer> arr){
        Iterator<Integer>iterator = arr.iterator();
        int sum = 0;
        while (iterator.hasNext()){
            sum +=iterator.next();
        }
        System.out.println("합" + sum);
         return sum;


    }

    //약수 구하기
    public static ArrayList<Integer> aliquot(int n){
        ArrayList<Integer> arr = new ArrayList<>();
        int sqrt = (int)Math.sqrt(n);
        for(int i = 1; i<=sqrt; i++){
            if(n%i ==0){
                arr.add(i);
            }
            if(n/i != i){
                arr.add(n/i);
            }
        }
        System.out.println("약수" + arr);
            return arr;
    }


}
