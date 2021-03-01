# 68. 최소비용 (인접리스트)
# 가중치 방향 그래프가 주어지면 1번 정점에서 N번 정점까지 가는 최소비용을 출력하는 프로그램을 작성하시오.
n=int(input("노드의 수를 입력하시오:"))
a=[]
path=[]
ch=[]
global min
min=100
for i in range(0, n+1):
    a.append([])
    path.append(0)
    ch.append(0)

m=int(input("간선의 수를 입력하시오:"))
b=[list(map(int,input().split())) for _ in range(m)]

for i in range(0,m):
    a[b[i][0]].append([b[i][1],b[i][2]])


def DFS(v,L,sum):
    global min
    if(v==n):
        for i in range(0,L-1):
            print("{0} ->".format(path[i]), end=" ")
        print("{0}까지의 합: {1}".format(n,sum))
        if(sum<min):
            min=sum
        
    else:
        for i in range(0, len(a[v])):
            if(a[v][i][1]>0 and ch[a[v][i][0]]==0):
                ch[a[v][i][0]]=1
                path[L]=i
                DFS(a[v][i][0],L+1,sum+a[v][i][1])
                ch[a[v][i][0]]=0
    return min

ch[1]=1
path[0]=1
print("최소의 합은 {0}이다".format(DFS(1,1,0)))
