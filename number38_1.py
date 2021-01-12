# 38_1. Inversion Sequence
''' 1부터 N까지 수를 한 번씩만 사용하여 이루어진 수열이 있을 때, 1부터 N까지 각각의 수 앞에 놓여 있는 수 중에서
    자신보다 큰 수 들의 개수를 수열로 표현하는 것을 inversion sequence라고 한다 '''
# 수열의 inversion sequence가 주어졌을 때, 원래의 수열을 출력하는 프로그램을 작성하세요.
n=int(input("숫자의 갯수를 입력하여라:"))
a=[]
a.append(0) #for문 0이 아니라 1부터 돌리기 위해 a[0]에 의미없는 값 삽입
for i in range(0,n):
    a.append(int(input()))

b=[0 for i in range(0,n+1,1)]


for i in range(n, 0, -1):
    temp = i
    for j in range(0, a[i], 1):
        b[temp]=b[temp+1]
        temp=temp+1
    b[temp]=i



for i in range(1,n+1, 1):
    print(b[i], end=' ')
