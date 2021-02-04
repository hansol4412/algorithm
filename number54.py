# 54. 올바른 괄호 (스택 클래스 사용)
# 괄호가 입력되면 올바른 괄호이면 'yes' 올바르지 않으면 'no'를 출력합니다.
str = input("문자열을 입력하시오:")
import sys
stack=[]
for i in range(0,len(str)):
    if(str[i]=="("):
        stack.append(1)
    if(str[i]==")"):
        if(len(stack)==0):
            print("No")
            sys.exit()
        stack.pop()
            
       

if(len(stack)==0):
    print("Yes")
else:
    print("No")
