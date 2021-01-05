# 32. 선택정렬
# N개의 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
# 가장 작은 수를 찾아 앞에서 부터 정렬한다.
a=[]
n=int(input("정렬할 수의 갯수를 입력하시오:"))
for i in range(0,n):
    a.append(int(input()))

for t in range(0,n):
    minnum=100
    minpos=0
    for j in range(t,n):
        if(minnum>a[j]):
            minnum=a[j]
            minpos=j
    temp=a[t]
    a[t]=a[minpos]
    a[minpos]=temp
print(a)
        


