# 15. 소수의 개수
#자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하시오.
n = int(input("숫자를 입력하세요:"))
cnt=0

for i in range (2, n+1):
    flag=1 #소수이다
    for j in range(2, int(i**0.5)+1):
        if(i%j==0):
            flag=0 #소수가 아니다
            break
    if(flag==1):
        cnt=cnt+1

print("{0}까지의 소수의 갯수는 {1}개이다".format(n, cnt))
    
