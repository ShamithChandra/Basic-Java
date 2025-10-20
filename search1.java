// search in a static array
class search1{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int n=3;
        for(int i=0;i<5;i++){
            if(n==arr[i]){
                System.out.println("element is :"+n);
                System.out.println("element is found at :"+i);

            }
        }
     
}
}