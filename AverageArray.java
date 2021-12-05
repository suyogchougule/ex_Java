//33. java program to calculate average ofarry element
public class AverageArray{

     public static void main(String []args){
        
        int i,sum=0,avg;
        
        int[] arr={1,2,3,4,5,6,7,8,9};
        
        int length=arr.length;
        
        for(i=0;i<length;i++)
        {
            sum=sum+arr[i];
        }
        avg=sum/length;
        
        System.out.println(avg);
     }
}