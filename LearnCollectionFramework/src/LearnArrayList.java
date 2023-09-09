import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {

    public static void main(String[] args){

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(4);
        System.out.println(list);

        list.add(1,50);
        System.out.println(list);

        List<Integer> newList = new ArrayList<>();
        newList.add(150);
        newList.add(160);

        list.addAll(newList);
        System.out.println(list);

        System.out.println(list.get(1));


//        List<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(50);
//        list.add(60);
//        list.add(70);
//        list.add(80);
//
//        System.out.println(list);
//
//        // Iterator Tricks 3 Methods
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println("The Element is "+list.get(i));
//        }
//
//        for(Integer element: list){
//            System.out.println("Foreach Element is "+element);
//        }
//
//        Iterator<Integer> it = list.iterator();
//
//        while(it.hasNext()){
//            System.out.println("Iterator "+it.next());
//        }




//        list.set(2,2000);
//        System.out.println(list);
//
//        System.out.println(list.contains(50)); // True/False
//
//        list.remove(1);
//        System.out.println(list);
//
//        list.remove(Integer.valueOf(30));
//        System.out.println(list);
//
//        list.clear();
//        System.out.println(list);
        
    }

}
