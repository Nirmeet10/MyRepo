

class PeakElements
{
public static void main(String args [])
{

    int a[] = {1,2,3,4,9,5};
    int n = a.length , peak = a[0];

if (n==1)
{
    System.out.println("PEAK"+a[0]);
    System.exit(0);
}
for(int i=0;i<n;i++)
{
for(int i=0;i<n;i++){
    if(i==0){
        if(a[i+1]>a[i])
        peak = a[i+1];
    }
} 
}
else if (i==(n-1))
{
    if(a[i-1]<a[i])
    peak = a[i];
}
else{
    if(a[i-1]<a[i] && a[i+1]<a[i])
    peak = a[i];
}




}
}