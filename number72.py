# 72. 공주 구하기(큐 자료구조로 해결) 
''' N명의 왕자가 시계 방향으로 동그랗게 앉고 1번 왕자부터 1부터 시작하먀 번호를 외친다.
    한 왕자가 특정 숫자 M을 외치면 그 왕자는 공주를 구하러 가는데서 제외된다. 마지막까지 살아 남은 왕자의 번호를 출력하라 '''

import queue
n=int(input("전체 왕자의 숫자를 입력하시오:"))
m=int(input("번호를 입력하시오:"))
q=queue.Queue()
for i in range(1, n+1):
    q.put(i)

while(q.qsize()!=0):
    for i in range(0,m-1):
        x=q.get()
        q.put(x)
    a=q.get()
    print(a)
    if(q.qsize()==1):
        x=q.get()
        print("마지막 남은 왕자는 {0}입니다.".format(x))
        break
