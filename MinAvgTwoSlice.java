public class MinAvgTwoSlice {
    public static int solution(int[] A){
        double minAvg = (double)(A[0]+A[1])/2;
        int minPos = 0;

        for(int i = 0; i<A.length-2;i++){
            double tempAvg = (double)(A[i]+A[i+1])/2;

            if(tempAvg < minAvg){
                minAvg = tempAvg;
                minPos = i;
            }

            tempAvg = (double)(A[i]+A[i+1]+A[i+2])/3;
            if(tempAvg < minAvg){
                minAvg = tempAvg;
                minPos = i;
            }
        }

        if((A[A.length-2]+A[A.length-1])/2 < minAvg){
            minPos = A.length-2;
        }

        return minPos;
    }
}
