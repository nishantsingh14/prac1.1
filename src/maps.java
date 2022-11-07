import java.util.*;

public class maps {
    public static void main(String[] args) {

        String[] s = {"agsdf","asddfgsrgrewsf","asgdsfgredf","asdfghdfgf","asdfghf","asfgdf","asdgfdf",} ;
        System.out.println(wordCount(s));

    }
    static Map wordCount(String[] s){
        Map<String , Integer> map = new HashMap<>();
        int n = s.length;
        for(int i=0; i<n;i++){
            if(!map.containsKey(s[i])){
                map.put(s[i] , 1);
            }else{
                map.put(s[i],(map.get(s[i]))+1) ;
            }
        }
        return map;
        HashSet<Integer> s = new HashSet<>();
        for(int i=10; i>0; i--){
            s.add(i);

        }
        System.out.println(s);
    }
}