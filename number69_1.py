# 69. 이진트리 넓이 우선탐색(BFS)
# 큐 자료구조 사용하기
import queue
n=7
a=[]
ch=[]
for i in range(0,n+1):
    a.append([])
    ch.append(0)
    
b=[list(map(int,input().split())) for _ in range(6)]

for i in range(0, len(b)):
    a[b[i][0]].append(b[i][1])

q=queue.Queue()

q.put(1)
ch[1]=[1]

while(q.qsize()>=0):
    x=q.get()
    print(x, end=" ")
    if(x==n): break
    for i in range(0,len(a[x])):
        if(ch[a[x][i]]==0):
            ch[a[x][i]]=1
            q.put(a[x][i])
    
