#include<stdio.h>
void main(){
printf("Enter N1 and N2: \n");
int N1, N2, Sumodd=0, Sumeven=0;
scanf("%d %d", &N1, &N2);
printf("Even Numbers are: \n");
for(int i=N1; i<=N2;i++) {
    if(i%2==0){
       printf("%d", i);
         Sumeven+=i;
         }
}
    printf("\n");
printf("Odd Numbers are: \n");
for(int i=N1; i<=N2;i++) {
    if(i%2!=0){
        printf("%d", i);
          Sumodd+=i;
        
    }
}
printf("\n");
printf("Sum of All Even Numbers: %d \n", Sumeven);
printf("Sum of All Odd Numbers: %d \n", Sumodd);
//