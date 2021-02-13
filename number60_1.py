#60. 합이 같은 부분집합 (DFS)
''' N개의 원소로 구성된 자연수 집합이 주어지면, 이 집합을 두 개의 부분집합으로 나누었을 때
    두 부분집합의 원소의 합이 서로 같은 경우가 존재하면 YES를 출력하고, 그렇지 않으면 NO을 출력하는 프로그램을 작성하시오.'''
n=int(input("원소의 갯수를 입력하시오:"))
a=[]
b=[]
sum=0
global flag
flag=0
for i in range(0,n):
    a.append(int(input()))
    b.append(0)
    sum=sum+a[i]


def DFS(x, hab):
    global flag
    if(hab>sum/2):return
    if(flag==1): return
    if(x==n):
        if(hab==sum-hab):
            flag=1
    else:
        DFS(x+1,hab+a[x])
        DFS(x+1,hab)


DFS(0,0)

if(flag==1):
    print("YES")
if(flag==0):
    print("NO")

