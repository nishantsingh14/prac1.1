import java.util.ArrayList;

public class ArrayListPrac {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=0;i<10;i = i+2){
            ar.add(i);
        }
        System.out.println(ar);
        System.out.println(ar.get(3));
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i=1;i<10;i = i+2){
            odd.add(i);
        }
        System.out.println(odd);
        ar.addAll(odd);
        System.out.println(ar);
        System.out.println(ar.size());
        ar.removeAll(odd);
        System.out.println(ar);

    }
}
