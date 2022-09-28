public class copyarray {
    public static void main(String[] args) {//class
        //declaring a destination array
        char[]copyfrom={'d','e','c','f','f','g'};
        char[]copyTo=new char[4];
        System.arraycopy(copyfrom,1,copyTo,0,4);
        //print the destination array
        System.out.println(String.valueOf(copyTo));

    }
}
