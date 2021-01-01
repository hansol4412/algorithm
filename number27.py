# 27. N!의 표현법
# N!는 1부터 N까지의 곱을 의미한다. 예를 들어 N이 5이면 5*4*3*2*1=120이다.
# 하지만 소수를 이용해 표현하는 방법도 있다   예를 들어 N이 5이면 2^3*3*5이다. N을 입력시 각 소수를 이용한 횟수를 출력하시오.
n = int(input("수를 입력하시오:"))
a= [0 for i in range(n+1)]
for i in range(2,n+1):
    temp = i
    j=2
    while(temp != 1):
        if(temp % j==0):
            a[j]=a[j]+1
            temp=temp/j
        else:
            j=j+1

for i in range(2,n+1):
    if(a[i]!=0):
        print("{0}의 갯수는 {1}개 입니다.".format(i, a[i]))

