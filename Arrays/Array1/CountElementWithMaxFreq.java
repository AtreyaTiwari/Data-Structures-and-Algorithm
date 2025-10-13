package Arrays.Array1;

public class CountElementWithMaxFreq {
    public static void main(String[] args) {
        int[] nums={1,2,2,3,1,4};
        System.out.println(maxFrequencyElements(nums));
    }
    
    public static int maxFrequencyElements(int[] nums) {
        int[] arr=new int[101];
        for(int num:nums){
            arr[num]++;
        }
        int max=0,count=0;
        for(int num:arr){
            if(num>max){
                max=num;
            }
        }
        for(int num:arr){
            if(num==max){
                count+=num;
            }
        }
        return count;
    }
}
