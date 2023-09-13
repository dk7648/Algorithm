#include<stdio.h>

int main() {
    int N;
    scanf("%d", &N);
    
    int arr[200];
    for(int i=0; i<(N); i++) {
        scanf("%d", &arr[i]);
    }
    getchar();
    int target;
    scanf("%d", &target);

    int count = 0;
    for(int i=0; i<(N); i++) {
        if(arr[i] == target)
            count++;
    }
    printf("%d", count);
    return 0;
}