class Solution{
    public static int[] countBits(int n){
        int arr[] = new int[n+1];
        arr[0]= 0;
        if(n>= 1){
            arr[1]= 1;
        }
        for(int i=2;i<=n;i++){
            int temp =i;
            int count =0;
            while(temp > 0){
                if((temp & 1) != 0){
                    count++;
                }
                temp = temp>>1;
            }
            arr[i] = count;
        }
        return arr;
    }
}