class Solution {
    public int getWinner(int[] arr, int k) {
        int ele=arr[0];
        int count=0;

        if(arr.length<k){
            int max=0;
            for(int i : arr){
                if(i>max){max=i;}
            }
            return max;
        }
        for(int i=1;i<arr.length;i++){
            if(count==k){
                break;
                }

            if(ele>arr[i]){
                count++;
            }

            else{
                count=1;
                ele=arr[i];
                }
                //System.out.println(ele);
        }
        return ele;
    }
}