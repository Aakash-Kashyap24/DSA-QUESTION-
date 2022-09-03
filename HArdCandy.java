import java.util.ArrayList;

public class HArdCandy {
    public static void main(String[] args) {


    ArrayList<Integer> nums2 = new ArrayList<>();

//        nums2.add(0,1);

//        nums2.add(1);
        nums2.add(-5);
//        nums2.add(3);
//        nums2.add(4);
//        nums2.add(5);
        nums2.add(6);
//        nums2.add(7);
        nums2.add(8);
        nums2.add(7);


        System.out.print(nums2.get(1));
//        Collections.sort(nums2);
        System.out.print(answer(nums2));




}

    static int answer(ArrayList<Integer> nums2) {

        int[] nums=new int[nums2.size()];
        for(int i=0;i<nums.length;i++){
            nums[i]=nums2.get(i);
        }
        int sum=0;
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=1;
        }



        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]>nums[i]){
                ans[i+1]=ans[i]+1;
            }

        }

        for(int i=nums.length-1;i>0;i--){
            if(nums[i-1]>nums[i])
            {
                if(ans[i-1]<(ans[i]+1))
                {
                    ans[i-1]=ans[i]+1;
                }
            }

        }
        for(int i=0;i<nums.length;i++) sum+=ans[i];

        return sum;

    }

}
