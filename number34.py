# 34. 버블정렬
# N개의 숫자가 입력되면 오름차순으로 정렬하는 프로그램을 작성하시오.
n=int(input("정렬할 수의 갯수를 입력하시오:"))
a=[]
for i in range(0,n):
    a.append(int(input()))


for i in range(0, n-1):
    for j in range(0, (n-1)-i):
        if(a[j]>a[j+1]):
            temp=a[j]
            a[j]=a[j+1]
            a[j+1]=temp
    
print(a)
