class Solution {
    long subMatrixSum(int arr[][], int n, int m, int x1, int y1, int x2, int y2) 
    {
        
        // code here
        long sum=0;
        for(int i=x1-1;i<x2;i++)
        {
            for(int j=y1-1;j<y2;j++)
            {
                sum=sum+arr[i][j];
            }
        }
        return sum;
    }
}
