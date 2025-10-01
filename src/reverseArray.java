public class reverseArray {
    static void reverse_arr ( int[] arr){
        int n = arr.length;
        int[] temp = new int[n];
        for(int i= 0 ; i < n ; i++)
            temp[i] = arr[n-i-1];
        for(int i=0 ; i < n ; i++)
            arr[i] = temp[i];



    }
    public static void main (String[] args  ){
        int[] arr = { 9 , 0 , 7 ,9 };
        reverse_arr(arr);
        for( int i = 0 ; i < arr.length ; i++)
            System.out.print( arr[i] + "");
    }
}
