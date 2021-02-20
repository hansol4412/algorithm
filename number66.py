#66.경로탐색 (인접리스트)
#방향그래프가 주어지면 1번 정점에서 N번 정접까지 가는 모든 경로의 가지수를 출력하는 프로그램을 작성하세요.
#경로를 모두 출력하시오
n=int(input("노드의 수를 입력하시오:"))
a=[]
ch=[]
level=[]
global cnt
cnt=0
for i in range(0, n+1):
   a.append([])
   ch.append(0)
   level.append(0)

m=int(input("간선의 수를 입력하시오:"))
b=[list(map(int,input().split())) for _ in range(m)]

for i in range(0,m):
    a[b[i][0]].append(b[i][1])

def DFS(v,L):
    if(v==n):
        global cnt
        cnt=cnt+1
        for i in range(0,L-1):
            print("{0} -> ".format(level[i]), end=" ")
        print(5)
    else:
        for i in range(0,len(a[v])):
            if(ch[a[v][i]]==0):
                ch[a[v][i]]=1
                level[L]=a[v][i]
                DFS(a[v][i],L+1)
                ch[a[v][i]]=0
ch[1]=1
level[0]=1
DFS(1,1)
print("1부터 {0}까지 경로의 수는 {1}개 입니다.".format(n,cnt))


    
    
