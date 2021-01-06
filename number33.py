# 33.3등의 성적은
# N명의 수학겅적이 주어지면 그 중 3등의 수학성적을 출력하는 프로그램을 작성하세요.
# 만약 100점이 3명, 99점이 2명, 98점이 5명이면 1등은 3명, 2등은 2명 3등은 3명으로 정해진다.
n=int(input("학생수를 입력하시오:"))
a=[]
for i in range(0,n):
    a.append(int(input()))

for i in range(0,n):
    max=0

    maxpos=0
    for j in range(i,n):
        if(max<a[j]):
            max=a[j]
            maxpos=j 
    temp=a[i]
    a[i]=a[maxpos]
    a[maxpos]=temp

        
'''
b=[0 for i in range(n)]
pos=0
st=300
for i in range(0,n):
    if(a[i]<st):
        b[pos]=a[i]
        st=a[i]
        pos=pos+1

print(b)
'''

b=[]
st=300
for i in range(0,n):
    if(a[i]<st):
        b.append(a[i])
        st=a[i]


print("3등의 성적은 {0}이다".format(b[2]))
