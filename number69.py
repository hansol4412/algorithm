# 69. 이진트리 넓이 우선탐색(BFS)
# 리스트를 이용하여 큐 자료구조 나타내기
n=7
a=[]
ch=[]
for i in range(0,n+1):
    a.append([])
    ch.append(0)
    
b=[list(map(int,input().split())) for _ in range(6)]

for i in range(0, len(b)):
    a[b[i][0]].append(b[i][1])

queue=[]
point=0

queue.append(1)
ch[1]=[1]

while(len(queue)!=0):
    x=queue[point]
    point=point+1
    print(x, end=" ")
    if(x==n): break
    for i in range(0,len(a[x])):
        if(ch[a[x][i]]==0):
            ch[a[x][i]]=1
            queue.append(a[x][i])
    
