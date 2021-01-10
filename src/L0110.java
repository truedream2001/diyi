import jdk.internal.dynalink.beans.StaticClass;

public class L0110 {
    public static void main(String[] args) {
        int w = 5;
        int[] a={1,5,3};
        wu(w);
        f(a);


        System.out.println("wwwwwww"+w);
        for(int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

        public static void wu(int w) {
        w = 10;
        System.out.println("cccccc"+w);
    }
    public static void f( int[] b){
        b[2] = 52;
    }
}
