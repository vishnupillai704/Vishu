public class DataAssignment1Q8 {
    public int[] bubbleSort(int arr[]) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    System.out.println(arr[j+1]);




                }
            }

        }
        return null;
    }

    public static void main(String[] args) {
        DataAssignment1Q8 obj=new DataAssignment1Q8();
        int arr[]={1,2,3,4,5,6,7};
        obj.bubbleSort(arr);
    }

}
