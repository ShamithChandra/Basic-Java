public class avg {
    public static void main(String args[]){
        int sum=0;
        int avg=0;
        int arr[]={1,2,3,4,5,6,7,8,9};
        for(int i=0;i<9;i++){
            sum+=arr[i];
            avg=sum/9;
        }
        System.out.println("avg of array elements is :"+avg);

    }
    
}
