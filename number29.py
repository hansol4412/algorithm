# 29. 3의 개수 (small)
# 자연수 n이 입력되면 1부터 n까지 자연수를 종이에 적을 때 각 숫자 중 3의 개수는?
# ex) n이 15이면 3과 13이 포함되어 2이다.
n = int(input("수를 입력하시오:"))
cnt=0
for i in range(1,n+1):
    temp=i
    while(temp>0):
        x=temp%10
        if(x==3):
            cnt=cnt+1
        temp=int(temp/10)


print(cnt)
        
