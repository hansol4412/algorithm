# 9. 모두의 약수
# 자연수 N이 입력되면 1부터 N까지의 각 숫자열의 약수의 갯수를 출력하는 프로그램을 출력하세요.
n = int(input("수를 입력하세요:"))
a=[1 for i in range(0,n+1)]

for i in range(2,n+1):
    '''
    for j in range(2,n+1):
        if(i%j==0): a[i]=a[i]+1
    '''
    for j in range(i,n+1,i):
        a[j]=a[j]+1
    
print(a[1:n+1])
