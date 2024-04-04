package winsoft_assignment;

public class Xyz 
{
	public static int MaxSumPath(int[]X, int[] Y)
	{
		int m=X.length;
		int n=Y.length;
		int i=0,j=0;
		int sumX=0,sumY=0,result=0;
		
		while(i<m && j<n)
		{
			if (X[i] < Y[j]) {
                sumX += X[i++];
            } else if (X[i] > Y[j]) {
                sumY += Y[j++];
            } else { // common element found
                result += Math.max(sumX, sumY);
                result += X[i];
                sumX = 0;
                sumY = 0;
                i++;
                j++;
            }
		}
		
		// Add remaining elements of X
        while (i < m) {
            sumX += X[i++];
        }

        // Add remaining elements of Y
        while (j < n) {
            sumY += Y[j++];
        }

        // Add the maximum of last sums of X and Y
        result += Math.max(sumX, sumY);

        return result;
    }

    public static void main(String[] args) {
        int[] X = {3, 6, 7, 8, 10, 12, 15, 18, 100};
        int[] Y = {1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50};

        int maxSum = MaxSumPath(X, Y);
        System.out.println("The maximum sum is: " + maxSum);
    }
}
