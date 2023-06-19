import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.Comparator; 
public class homework3 {
    public static void main(String[] args){
       ArrayList<Integer> arr = new ArrayList<>();
       ArrayList<Integer> arr1 = new ArrayList<>();
       
       for (int i = 0; i < 10; i++) {
           arr.add(new Random().nextInt(200));
       }
       System.out.println("Изначальный массив: "+arr);
       for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i)%2==0){
               arr1.add(arr.get(i));
            }         
       }

       int max = Collections.max(arr);
       int min = Collections.min(arr);
       System.out.println("Максимальное значение: "+max);
       System.out.println("Минимальное значение: "+min);
       System.out.println("Четные значения: "+arr1);

       arr.sort(new Comparator<Integer>() {
             public int compare(Integer o1, Integer o2){
                return o1-o2;
             }
       });

       int num = arr.size()/2;
       for (int i = 0; i < arr.size(); i++){
            if (i==num){
                 num=arr.get(i);
            }
       }
       System.out.println("Среднее значение: "+num);
    }
}
