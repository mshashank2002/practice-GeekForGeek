/*Given an array A of size N of integers. Your task is to find the sum of minimum and maximum element in the array.*/
import java.util.*;
public class Max_Min
{
    public static int findSum(int A[],int N)
        {
            Arrays.sort(A);
            int min=A[0];
            int max=A[N-1];
            return(min+max);
        }
    }
}
