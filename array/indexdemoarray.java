

public class indexdemoarray {
    public static void main(String[] args) {
        String[]a={"red","green","orange"};
        int index=0;
        for(int i=0;i<a.length;i++){
            if(a[i]=="green"){
                index=i;
            }
        }
        System.out.println("index="+index);

    }
}
