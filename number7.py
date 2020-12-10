# 7. 영어단어 복구
# 에러로 표시되는 영어단어를 원래의 표현대로 공백을 제거하고 소문자화 시켜 출력하는 프로그램을 작성하시오.

str = input("문자열을 입력하세요:")
a=""
for i in range(0,len(str)):
    if(ord(str[i])>=97 and ord(str[i])<=122):
        a=a+chr(ord(str[i]))
    if(ord(str[i])>=65 and ord(str[i])<=90):
        #a=a+chr(ord(str[i])+32)
        a=a+chr(ord(str[i])).lower()

print(a)


    
