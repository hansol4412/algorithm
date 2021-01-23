# 45. 공주 구하기
''' N명의 왕자가 시계 방향으로 동그랗게 앉고 1번 왕자부터 1부터 시작하먀 번호를 외친다.
    한 왕자가 특정 숫자 M을 외치면 그 왕자는 공주를 구하러 가는데서 제외된다. 마지막까지 살아 남은 왕자의 번호를 출력하라 '''
n=int(input("왕자의 수를 입력하시오:"))
m=int(input("특정 수를 입력하시오:"))
a=[0 for i in range(n+1)]
pos=m 
a[pos]=1 #첫번째 왕자 지정
cnt=n-1 #첫번째 지정된 왕자 빼기
step=0
while(1):
    pos=pos+1
    if(cnt==1): break
    
    if(a[pos]==0):
        step=step+1
        if(step==m):
            a[pos]=1
            print("---------{0}".format(pos))
            step=0
            cnt=cnt-1
            
    if(pos==n): pos=0 #위에서 pos=pos+1되서 1부터 시작


for i in range(1,n+1):
    if(a[i]==0):
        print(i)
