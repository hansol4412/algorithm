#75. 최대 수입 스케줄 (우선순위 큐)
''' 유명한 강연자가 N개의 기업에서 강연 요청을 해왔다. 각 기업은 D일 안에 와서 강연을 해주면 M원의 강연료를 준다.
    D와 M을 바탕으로 최대 수입을 받을 수 있는 스케줄을 짜야한다. 단 강연은 하루에 하나씩만 할 수 있다. '''
# 튜플 자료형 사용

from queue import PriorityQueue
que = PriorityQueue()
n=int(input("강연을 의뢰한 기업의 수를 입력하시오:"))
sc=[]
for i in range (0,n):
    sc.append(eval(input()))
sc.append((0,0)) #index of out range 방지
sc.sort(key = lambda x :x[1], reverse=True)
max=sc[0][1]
ptr=0
res=0
for i in range(max, 0, -1):
    while(1):
        if(sc[ptr][1]<i): break
        else:
            que.put(-sc[ptr][0])
            ptr=ptr+1

    if(que.qsize()!=0):
        res=res+-(que.get())

print("최대수입은 {0}이다.".format(res))
