# 70. 그래프의 최단거리 (BFS) 
# 그래프에서 1번 정점에서 각 정점으로 가는 최소 이동 간선수를 구하여라.
import queue
n=int(input("노드의 수를 입력하시오:"))
a=[]
ch=[]
dis=[]
for i in range(0,n+1):
    a.append([])
    ch.append(0)
    dis.append(0)
m=int(input("간선의 수를 입력하시오:"))
b=[list(map(int,input().split())) for _ in range(m)]

for i in range(0, m):
    a[b[i][0]].append(b[i][1])

q=queue.Queue()

q.put(1)
ch[1]=1

while(q.qsize()!=0):
    x=q.get()
    for i in range(0,len(a[x])):
        if(ch[a[x][i]]==0):
            ch[a[x][i]]=1
            q.put(a[x][i])
            dis[a[x][i]]= dis[x]+1

for i in range(2,n+1):
    print("{0} : {1}".format(i,dis[i]))
            
    
