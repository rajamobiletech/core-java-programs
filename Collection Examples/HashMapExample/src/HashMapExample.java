import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> mySpokenDic = new HashMap<>();
        mySpokenDic.put("Come", "Ra");
        mySpokenDic.put("Go", "Po");
        System.out.println(mySpokenDic);

        System.out.println(mySpokenDic.containsValue("Po"));

        HashMap<String, List<String>> studentGadgetsDic = new HashMap<>();
        studentGadgetsDic.put(null, Arrays.asList("Phone", "Lap"));
        studentGadgetsDic.put("Vinay", Arrays.asList("Realme Phone", "Acer laptop"));
        studentGadgetsDic.put("Charan", Arrays.asList("iPhone", "Mac laptop"));
        studentGadgetsDic.put("Rajitha", Arrays.asList("Nokia 1100", "dell"));
        studentGadgetsDic.put("Raja", Arrays.asList("No Phone", "No Lap"));
        studentGadgetsDic.put(null, Arrays.asList("Phone1", "Lap1"));

        System.out.println(studentGadgetsDic);

        if(studentGadgetsDic.containsKey("Raja")) {
            System.out.println("Raja student is available");
        } else {
            System.out.println("Student is not available");
        }
        List<String> dic1 = studentGadgetsDic.get("sdjfbdsjf");
        System.out.println(dic1);

        List<String> dic2 = studentGadgetsDic.get(null);
        System.out.println(dic2);


        List<String> rajaStudentGadgets = studentGadgetsDic.getOrDefault("raja", Arrays.asList("Nokia 3300", "mac"));
        System.out.println(rajaStudentGadgets);

        Set<String> studentNames = studentGadgetsDic.keySet();
        System.out.println(studentNames);

        Collection<List<String>> values = studentGadgetsDic.values();
        System.out.println(values);

        for(Map.Entry<String, List<String>> student :studentGadgetsDic.entrySet()) {
            System.out.println(student);
            System.out.println(student.getKey() + " ----> "+ student.getValue());
            List<String> raja = studentGadgetsDic.get("Raja");
            if(student.getValue().contains("iPhone")) {
                System.out.println("Iphone is using by "+student.getKey());
            }
        }
        Map<String, String>[] map = new HashMap[26];
        for(int i = 0; i < 26; i++){
            map[i] = new HashMap<>();
        }
        for(int i = 0; i < 26; i++){
            for(int j = 0; j<10; j++){
                map[i].put("key"+j, "value"+j);
            }
        }
        System.out.println(Arrays.toString(map));

        System.out.println(studentGadgetsDic.remove(null));

        List<String> dic3 = studentGadgetsDic.get(null);
        System.out.println(dic3);

    }
}
