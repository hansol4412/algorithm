 # 36. 삽입정렬
# N개의 숫자가 입력되면 오름차순으로 정렬하는 프로그램을 작성하시오.
a=[]
n=int(input("정렬할 숫자의 갯수를 입력하시오:"))
for i in range(0,n):
    a.append(int(input()))

for i in range(1,n):
    temp=a[i]
    for j in range(i-1,-2,-1):
        if(temp<a[j]): a[j+1]=a[j]
        else: break
    a[j+1]=temp

print(a)
