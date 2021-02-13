#60. 합이 같은 부분집합 (DFS)
''' N개의 원소로 구성된 자연수 집합이 주어지면, 이 집합을 두 개의 부분집합으로 나누었을 때
    두 부분집합의 원소의 합이 서로 같은 경우가 존재하면 YES를 출력하고, 그렇지 않으면 NO을 출력하는 프로그램을 작성하시오.'''

n=int(input("원소의 갯수를 입력하시오:"))
a=[]
b=[]
global flag
flag=0
for i in range(0,n):
    a.append(int(input()))
    b.append(0)


def DFS(x):
    if(x==n):
        temp1=0
        temp2=0
        for i in range(0,n):
            if(b[i]==1):
                temp1=temp1+a[i]
            if(b[i]==0):
                temp2=temp2+a[i]
        if(temp1==temp2):
            global flag
            flag=1


    else:
        b[x]=1
        DFS(x+1)
        b[x]=0
        DFS(x+1)


DFS(0)


if(flag==1):
    print("YES")
if(flag==0):
    print("NO")

    
