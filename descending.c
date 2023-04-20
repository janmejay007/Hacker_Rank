#include <stdio.h>
int main()
{
    int n, arr[50], x;
    printf("Enter the size of array\n");
    scanf("%d", &n);
    printf("Enter the elements of array\n");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }
    for (int i = 0; i < n; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            if (arr[i] < arr[j])
            {
                x = arr[j];
                arr[j] = arr[i];
                arr[i] = x;
            }
        }
    }
    printf("Sorted array is\n");
    for (int i = 0; i < n; i++)
    {
        printf("%d  ", arr[i]);
    }
}