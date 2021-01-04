# 28. N!에서 0의 개수
# 자연수 N이 입력되면 N! 값에서 일의 자리부터 연속적으로 '0'이 몇 개 있는지 구하는 프로그램을 작성하시오.
n = int(input("수를 입력하시오:"))
cnt2=0
cnt5=0
for i in range(2,n+1):
    temp=i
    
    while(temp>1):
        while(temp%2==0):
            cnt2=cnt2+1
            temp=int(temp/2)
        while(temp%5==0):
            cnt5=int(cnt5+1)
            temp=temp/5
        else:
            break


if(cnt2<=cnt5):
    print("{0}!에서 0의 개수는 {1}개이다".format(n,cnt2))
else:
    print("{0}!에서 0의 개수는 {1}개이다".format(n,cnt5))
