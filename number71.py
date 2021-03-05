# 71. 송아지 찾기 (BFS : 상태트리탐색) 
''' 현수는 송아지를 잃어버렸다.송아지에는 위치추적기가 달려있다. 현수의 위치와
    송아지의 위치가 직성상의 좌표 점으로 주어지면 현수는 현재 위치에서 송아지의
    위치까지 다음과 같은 방법으로 이동한다.
    현수는 스카이 콩콩을 타고 가는데 한 번의 점프로 앞으로 1, 뒤로 1, 앞으로 5를
    이동할 수 있다. 최소 몇번의 점프로 현수가 송아지 위치까지 갈 수 있는지
    구하는 프로그램을 작성하시오. '''
#직선의 좌표는 1부터 1000까지이다.
import queue
import sys
s=int(input("현수의 위치를  입력하시오:"))
e=int(input("송아지의 위치를  입력하시오:"))
dx=[1, -1, 5]
ch=[]
dis=[]
for i in range(0,20):
    ch.append(0)
    dis.append(0)
q=queue.Queue()
q.put(s)
ch[s]=1
dis[s]=1

while(q.qsize()!=0):
    x=q.get()
    for i in range(0,3):
        pos=x+dx[i]
        if(pos<1 or pos>1000): continue
        if(pos==e):
            print("송아지를 찾기 위해 최소 {0}번의 점프를 해야한다".format(dis[x]))
            sys.exit(0)
        if(ch[pos]==0):
            ch[pos]=1
            dis[pos]=dis[x]+1
            q.put(pos)
        
