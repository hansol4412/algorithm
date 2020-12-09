# 6.숫자만 추출
# 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
#그 자연수의 약수의 갯수를 출력합니다.

str=input("문자열을 입력하세요:")
a=[]
num=0
cnt=0
for i in range(0,len(str)):
    if(ord(str[i])>=48 and ord(str[i])<=57):
        num=num*10+int(str[i])

for j in range(1,num+1):
    if(num%j==0):
        cnt=cnt+1

print("약수의 갯수는 {0}개 입니다".format(cnt))





        
        
