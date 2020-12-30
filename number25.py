#25. 석차 구하기
# N명의 학생의 수학 점수가 입력되면 각 학생의 석차를 출력하는 프로그램을 작성하시오.
# 같은 점수가 입력될 경우 높은 석차로 동일처리한다.
n = int(input("학생수를 입력하시오:"))
a=[]
b=[1 for i in range(n)]
for i in range(0,n):
    a.append(int(input("점수를 입력하시오:")))

for i in range(0,n):
    for j in range(0,n):
        if(a[i]<a[j]):
            b[i]=b[i]+1

for i in range(0,n):
    print("{0}점은 {1}등 입니다.".format(a[i],b[i]))
