class SearchArray{
    public boolean searchArray(int[] arr,int toCheckValue){
        for(Integer i:arr){
            if(i==toCheckValue){
                System.out.println("number is present in array"+ toCheckValue);
            }

        }
        return false;
    }
}
public class DataAssignment1Q7 {
    public static void main(String[] args) {
        SearchArray obj=new SearchArray();
        int[]arr={1,2,3,4,5,6,7,8,9};
        obj.searchArray(arr,8);
    }

}
