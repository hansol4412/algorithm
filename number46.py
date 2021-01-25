# 46. 멀티 태스킹
''' 작업 갯수 N개와 그에 따른 작업 시간을 입력한 후 M초 후 정전이 왔다. 복구 후 어떤 작업을 해야하는 지 출력하시오.
    더 이상 작업해야 할 작업이 없으면 -1을 출력하시오. '''
import sys
n=int(input("작업 갯수를 입력하시오:"))
a=[]
a.append(0)
sum=0
for i in range(1,n+1):
    a.append(int(input()))
    sum=sum+a[i]
m=int(input("몇 초 후에 정전이 일어나는가?"))
if(sum<=m):
    print("-1")
    sys.exit()

#정전 나기 전 작업
time=0
work=1
while(1):
    if(time==m): break
    if(a[work]>0):
        a[work]=a[work]-1
        time= time+1
        
    work=work+1
    if(work>n):
        work=1


#정전 난 후 작업 찾기
while(1):
    if(a[work]>0):
        print("정전 후에 {0}번 작업을 수행해야한다".format(work))
        break
    work=work+1
    if(work>n):
        work=1




