#63. 인접행렬
n=int(input("노드의 수를 입력하세요:"))
a=[]
for i in range(0,n+1):
    a.append([])
    for j in range(0,n+1):
        a[i].append(0)
        
m=int(input("간선의 수를 입력하세요:"))
b=[list(map(int,input().split())) for _ in range(m)]


for i in range(0,m):
    #방향그래프
    #a[b[i][0]][b[i][1]]=1
    
    #가중치 방향 그래프
    a[b[i][0]][b[i][1]]=b[i][2]

    #무방향 그래프
    #a[b[i][0]][b[i][1]]=1
    #a[b[i][1]][b[i][0]]=1

for i in range(1,n+1):
    for j in range(1,n+1):
        print(a[i][j], end=" ")
    print()
