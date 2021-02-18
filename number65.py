# 65. 미로탐색 (DFS)
''' 자연수  N이 주어지면 n*n 격자판 미로를 탈출하는 경로의 가지수를 출력하는 프로그램을 작성하시오.
    출발점은 (1,1) 좌표이고 도착점은 (n,n)좌표이다. 격자판의 1은 벽이고 0은 통로이다/
    격자판의 움직임은 상하좌우만 움직인다. '''
dx = [-1, 0, 1, 0]
dy = [0, -1, 0, 1]
a=[[0,0,0,0,0,0,0],
   [0,1,1,1,1,1,0],
   [0,0,0,1,0,0,0],
   [1,1,0,1,0,1,1],
   [1,1,0,0,0,0,1],
   [1,1,0,1,1,0,0],
   [1,0,0,0,0,0,0]]
global cnt
cnt=0
ch=[]
pathX=[]
pathY=[]
for i in range(0,7):
    ch.append([])
    for j in range(0,7):
        ch[i].append(0)

for i in range(0,100):
    pathX.append(0)
    pathY.append(0)

        
def DFS(x,y,L):
    if(x==6 and y==6):
        global cnt
        cnt= cnt+1
        for i in range(0,L-1):
            print("({0},{1})->".format(pathX[i], pathY[i]),end="")
        print("(6,6)")
                  
    else:
        for i in range(0,4):
            ax= x+dx[i]
            ay= y+dy[i]
            if(ax<0 or ax>6 or ay<0 or ay>6): continue
            if(a[ax][ay]==0 and ch[ax][ay]==0):
                ch[ax][ay]=1
                pathX[L]=ax
                pathY[L]=ay
                DFS(ax,ay,L+1)
                ch[ax][ay]=0

                

ch[0][0]=1
pathX[0]=0
pathY[0]=0
DFS(0,0,1)
print("경로의 수는 {0} 입니다".format(cnt))
            

