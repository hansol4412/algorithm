# 4.  나이차이
# n명의 나이가 있습니다. 이 n명의 사람 중 가장 나이 차이가 많이 나는 경우는 몇 살 일까요? 최대 나이 차이를 출력하는 프로그램을 작성하시오

n = int(input("사람 수를 입력하시오:"))
min = 100
max = 0

for i in  range(0,n):
    a = int(input("나이를 입력하세요:"))
    if(a>max): max = a
    if(a<min): min = a

print("나이 차의 최대는 {0}이다".format(max-min))
