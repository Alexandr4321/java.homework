

import java.security.Key;
import java.util.ArrayList;
import java.util.List;

public class home_work {
    
    public static void main(String[] args) {
        long start =System.currentTimeMillis();
    //     String name ="Ivanov";
    //     String country= "Russia";
    //     String city = "Moscow";
    //     String age = null;
    //     if (name!=null){
    //         System.out.print("Имя :"+name+"| ");
    //     }
    //     if (country!=null){
    //         System.out.print("Страна:"+country+"| ");
    //     }
    //     if (city!=null){
    //         System.out.print("Город:"+city+"| ");
    //     }
    //     if (age!=null){
    //         System.out.print("Возраст:"+age+"| ");
    //     }
    //     System.out.println((System.currentTimeMillis()-start));
          
        // StringBuilder name= new StringBuilder("Ivanov");
        // StringBuilder country= new StringBuilder("Russia");
        // StringBuilder city= new StringBuilder("Moscow");
        // StringBuilder age= new StringBuilder("null");
        // if (name!=null){
        //     System.out.print("Имя :"+name.toString()+"| ");
        // }
        // if (country!=null){
        //     System.out.print("Страна:"+country.toString()+"| ");
        // }
        // if (city!=null){
        //     System.out.print("Город:"+city.toString()+"| ");
        // }
        // if (age!=null){
        //     System.out.print("Возраст:"+age.toString()+"| ");
        // }







        String s="Вот пример статьи на 1000 символов. Это достаточно маленький текст, оптимально подходящий для карточек товаров в интернет-магазинах или для небольших информационных публикаций. В таком тексте редко бывает более 2-3 абзацев и обычно один подзаголовок. Но можно и без него. На 1000 символов рекомендовано использовать 1-2 ключа и одну картину.Текст на 1000 символов – это сколько примерно слов? Статистика Word показывает, что «тысяча» включает в себя 150-200 слов средней величины. Но, если злоупотреблять предлогами, союзами и другими частями речи на 1-2 символа, то количество слов неизменно возрастает.В копирайтерской деятельности принято считать «тысячи» с пробелами или без. Учет пробелов увеличивает объем текста примерно на 100-200 символов – именно столько раз мы разделяем слова свободным пространством. Считать пробелы заказчики не любят, так как это «пустое место». Однако некоторые фирмы и биржи видят справедливым ставить стоимость за 1000 символов с пробелами, считая последние важным элементом качественного восприятия. Согласитесь, читать слитный текст без единого пропуска, никто не будет. Но большинству нужна цена за 1000 знаков без пробелов.";
        System.out.println(s.replace("а","А"));
        System.out.println("Время"+(System.currentTimeMillis()-start));
        start=System.currentTimeMillis();
        
        s.replace("а","А");
        StringBuilder str = new StringBuilder(s);
        str.toString();
        System.out.println("Время"+(System.currentTimeMillis()-start));


         
    //}
    // public static void main(String[] args) throws Exception{
    //     ArrayList<String> surname = new ArrayList<String>();
    //     ArrayList<String> grade = new ArrayList<String>();
    //     ArrayList<String> item = new ArrayList<String>();
    //     surname.add("Иванов"); 
    //     grade.add("5");
    //     item.add("Математика"); 
    //     surname.add("Петрова"); 
    //     grade.add("4");
    //     item.add("Информатика"); 
    //     surname.add("Краснов"); 
    //     grade.add("5");
    //     item.add("Физика"); 
    //     int i=0;
    //     while (i<3){
    //     System.out.println("Студент "+ surname.get(i)+" получил(а) "+grade.get(i)+" по предмету "+item.get(i));
    //     i+=1;
    //     }
    }
    
        
        
        
        
    
}
