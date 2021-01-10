import javafx.scene.chart.BubbleChart;

public class i4_3 {
    public static void main(String[] args) {
        int a[] = {45,2,5,6,2,1,3,354,56,};
        BUbbleSort(a);
        for(int i  = 0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }

    public static void BUbbleSort(int a[]){
        int temp;
        for(int i = 0;i<a.length-1;i++){
            for(int j = 0;j<a.length-i-1;j++){
                if(a[j+1]<a[j]){
                 temp = a[j+1];
                 a[j+1] = a[j];
                 a[j] = temp;
                }
            }
        }

    }
}
