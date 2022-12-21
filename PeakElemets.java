class PeakElements{
public static void main(String args []){

    int n;
int numb[] = {1,2,3,1,59,53,99,87};

if (n == 1)
return 0;

if (numb[0]>=numb[1])
return 0;

if (numb[n-1] >= arr[n-2])
return n-1;

for (int i = 1; i < n - 1; i++) {
    // Check if the neighbors are smaller
    if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1])
        return i;
}
return 0;



}
}