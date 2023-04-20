#include<stdio.h>
int main()
{
    int arr[50],n,num,count=0;
    printf("Enter the size of array\n");
    scanf("%d",&n);
    printf("Enter the elements of array\n");
    for (int i = 0; i < n; i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("Enter the number whose occurence you want to count\n");
    scanf("%d",&num);
    for (int i = 0; i < n; i++)
    {
        if(num==arr[i])
        count++;

    }
    printf("The number %d occurs %d times\n",num,count);
    
    
    
}