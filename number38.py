# 38. Inversion Sequence
''' 1부터 N까지 수를 한 번씩만 사용하여 이루어진 수열이 있을 때,
    1부터 N까지 각각의 수 앞에 놓여 있는 수 중에서
    자신보다 큰 수 들의 개수를 수열로 표현하는 것을 inversion sequence라고 한다.'''
# ex) 4 8 6 2 5 1 3 7 -> 5 3 4 0 2 1 1 0
n=int(input("입력할 수의 갯수를 입력하시오:"))
a=[]
a.append(0)
for i in range (0,n):
    a.append(int(input()))
b=[0 for i in range(n+1)]

for i in range(1, n+1, 1):
    for j in range(1, i, 1):
        if(a[i]<a[j]): b[a[i]]= b[a[i]] +1

for i in range(1, n+1, 1):
    print(b[i],end=" ")


