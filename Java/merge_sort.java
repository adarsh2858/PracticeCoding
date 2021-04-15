
public class merge_sort {
    public static void main(String[] args){
        int arr[]={9,7,8,3,2,1};
        merge_sort obj=new merge_sort();
        obj.merge_sort_recursion(arr,0,5);
    }
    public static void merge(int A[],int start,int mid,int end){
            //stores the starting position of both parts in temporary variables.
        // int A[]={9,7,8,3,2,1};
        // int start=0,mid=2,end=5;
        int p = start ,q = mid+1;
        
        int Arr[]=new int[end-start+1], k=0;
        
        for(int i = start ;i <= end ;i++) {
            if(p > mid)      //checks if first part comes to an end or not .
                Arr[ k++ ] = A[ q++] ;
        
            else if ( q > end)   //checks if second part comes to an end or not
                Arr[ k++ ] = A[ p++ ];
        
            else if( A[ p ] < A[ q ])     //checks which part has smaller element.
                Arr[ k++ ] = A[ p++ ];
        
            else
                Arr[ k++ ] = A[ q++];
            for(int j=0;j<Arr.length;j++)
                System.out.printf("%d",Arr[j]);
            System.out.println();
            }
            for (p=0 ; p< k ;p ++) {
            /* Now the real array has elements in sorted manner including both 
                parts.*/
                A[ start++ ] = Arr[ p ] ;                          
            }
            for(int j=0;j<A.length;j++)
                System.out.printf("%d",A[j]);
            System.out.println();
        }
        void merge_sort_recursion (int A[ ] , int start , int end )
        {
                if( start < end ) {
                int mid = (start + end ) / 2 ;           // defines the current array in 2 parts .
                merge_sort_recursion (A, start , mid ) ;                 // sort the 1st part of array .
                merge_sort_recursion (A,mid+1 , end ) ;              // sort the 2nd part of array.
     
              // merge the both parts by comparing elements of both the parts.
               merge_sort.merge(A,start , mid , end );   
        }                    
     }
}