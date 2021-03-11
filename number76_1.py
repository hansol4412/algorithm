# 76_1. 이항계수
''' 이항계수는 N계의 원소를 가지는 집합에서 R개의 원소를 뽑아 부분집합을 만드는 경우의 수
    공식은 nCr로 표현한다. '''
# for문 사용
n=int(input("n을 입력하시오:"))
r=int(input("r을 입력하시오:"))
a=1
b=1
temp=n
for i in range(1,r+1):
    a=a*temp
    temp=temp-1
    b=b*i
c=int(a/b)

print("{0}C{1}={2}".format(n,r,c))
