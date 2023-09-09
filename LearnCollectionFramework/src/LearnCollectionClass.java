import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionClass {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student("Anuj", 2));
        list.add(new Student("Ramesh", 4));
        list.add(new Student("Shivam", 3));
        list.add(new Student("Rohit", 1));

        Student s1 = new Student("Anuj", 2);
        Student s2 = new Student("Rohit", 3);

        //System.out.println(s1.compareTo(s2));

        System.out.println(list);

        Collections.sort(list);




        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });





        System.out.println(list);





//        List<Integer> list = new ArrayList<>();
//        list.add(34);
//        list.add(12);
//        list.add(9);
//        list.add(9);
//        list.add(9);
//        list.add(76);
//        list.add(29);
//        list.add(75);

//        System.out.println("Min element " + Collections.min(list));
//        System.out.println("Min element " + Collections.max(list));
//        System.out.println(Collections.frequency(list, 9));

//        Collections.sort(list); // normal sorting
//        Collections.sort(list, Comparator.reverseOrder()); // end theke sorting
//        System.out.println(list);


    }

}
