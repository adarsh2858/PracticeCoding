import java.util.*;
public class insertion_sort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n],i,j,temp;
        for(i=0;i<n;i++)
            nums[i]=sc.nextInt();
        sc.close();
        for(i=0;i<nums.length;i++){
            j=i;
            temp=nums[i];
            while(j>0 && nums[j-1]>temp){
                nums[j]=nums[j-1];
                j--;
            }
            nums[j]=temp;
            for(j=0;j<n;j++)
            System.out.print(nums[j]+",");
            System.out.println();
        }
    }
}