import java.util.ArrayList;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> one = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        /*for example*/
        one.add(1);
        one.add(5);
        one.add(20);
        one.add(21);
        one.add(28);

        two.add(2);
        two.add(4);
        two.add(6);
        two.add(8);
        two.add(10);

        while(!one.isEmpty() && !two.isEmpty()){
            if(one.get(0) != two.get(0)){
                if(one.get(0) < two.get(0)){
                    result.add(one.get(0));
                    one.remove(0);
                }else{
                    result.add(two.get(0));
                    two.remove(0);
                }
            }else{
                result.add(one.get(0));
                one.remove(0);
                result.add(two.get(0));
                two.remove(0);
            }
        }
        if(!one.isEmpty()){
            result.addAll(one);
        }
        if(!two.isEmpty()){
            result.addAll(two);
        }
        for(int i : result){
            System.out.println(i);
        }
    }
}