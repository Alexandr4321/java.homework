import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

import javax.management.openmbean.ArrayType;

public class homework6 {
    public static void main(String[] args) {
        SetImitation setImitation=new SetImitation();
        for (int i = 0; i < 10; i++) {
            setImitation.add(new Random().nextInt(1000));
        }
        
        Iterator<Integer> iterator = setImitation.iterator();
        while(iterator.hasNext()){
            int i = iterator.next();
            System.out.println(i);
        }
    }
    
    
}
class SetImitation<E>{
    HashMap<E,Object> list = new HashMap<>();
    private static final Object OBJECT= new Object();

    public  boolean add(E num){
        return list.put(num,OBJECT)==null;
    }
    public boolean delite(E num){
        return list.remove(num,OBJECT);
    }
    public int size(){
        return list.size();
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public boolean contains(E num){
        return list.containsKey(num);
    }
    public Iterator<E>iterator(){
        return list.keySet().iterator();
    }
    public E getElement(int index){
        E[] mapArray=(E[]) list.keySet().toArray();
        return mapArray[index];
    }
}