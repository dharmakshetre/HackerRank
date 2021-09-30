#include<stdio.h>
int main()
{
    int n,i,j;
    int a[100][100];
    scanf("%d",&n);
    for(int i=0; i<n;i++)
    {
        for(j=0;j<n;j++)
          {
            scanf("%d",&a[i][j]);
          }
    }
    int top = 0, bottom = n-1, left = 0, right = n-1;
    int dir = 0;
    while(top<=bottom && left<=right)
    {
        if(dir == 0)
        {
            for(j=left; j<= right;j++)
            {
                printf("%d ",a[top][j]);
                
            }
            top = top+1;
        }
        else if(dir == 1)
        {
            for(i=top; i<=bottom;i++)
            {
                printf("%d ",a[i][right]);
                
            }
            right = right-1;
        }
        else if(dir == 2)
        {
            for(j=right; j>=left;j--)
            {
                printf("%d ",a[bottom][j]);
                
            }
            bottom = bottom-1;
        }
        else if(dir == 3)
        {
            for(i=bottom; i>=top;i--)
            {
                printf("%d ",a[i][left]);
                
            }
            left = left+1;
        }

        dir = (dir+1)%n;
    } 

}