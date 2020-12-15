# 12. 숫자의 총 갯수(large)
# 자연수 N이 입력되면 1부터 N까지의 자연수를 종이에 적을 때 각 숫자는 몇개가 쓰이는지 프로그램을 작성하시오.
# 예를 들어 1부터 15까지는 1,2,3,4,5,6,7,8,9,1,0,1,1,1,2,1,3,1,4,1,5인 21개의 숫자가 쓰였다.

num=int(input("숫자를 입력하시요:"))
digit=9
sum=0
res=0
cnt=1

while(num>sum+digit):
    res=res+(digit*cnt)
    sum=sum+digit
    digit=digit*10
    cnt=cnt+1

res=res+(num-sum)*cnt
print("{0}는 총 {1}개의 숫자가 사용됬다.".format(num,res))
