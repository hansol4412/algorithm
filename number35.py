# 35. Special Sort(구글)
# N개의 정수가 입력되면 양의 정수와 음의 정수가 섞인 숫자들을 음의 정수는 왼쪽으로 양의 정수는 오른족으로 나눠라
# 입력된 음과 양의 정수의 순서는 입력된 순서를 유지한다.
a=[]
n=int(input("정렬할 숫자의 갯수를 입력하시오:"))
for i in range(0,n):
    a.append(int(input()))

for i in range(0,n-1):
    for j in range(0,(n-i)-1):
        if(a[j]>0 and a[j+1]<0):
            temp=a[j]
            a[j]=a[j+1]
            a[j+1]=temp


print(a)
        
        
