class RemoveDuplicateInArray
{
public static void main(String args[])
{
int n = args.length;
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i] = Integer.parseInt(args[i]); 
}
int end = arr.length;

    for (int i = 0; i < end; i++) {
        for (int j = i + 1; j < end; j++) {
            if (arr[i] == arr[j]) {                  
                int Left = j;
                for (int k = j+1; k < end; k++, Left++) {
                    arr[Left] = arr[k];
                }
                end--;
                j--;
            }
        }
    }

    int[] newlist = new int[end];
    for(int i = 0; i < end; i++){
        newlist[i] = arr[i];
    }
System.out.println("Array after removing duplicate elements : ");
for(int i=0;i<end;i++)
{
System.out.print(newlist[i]+" ");
}
}
}
