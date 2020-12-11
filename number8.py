# 8. 올바른 괄호
# 괄호가 입력되면 올바른 괄호이면 'yes' 올바르지 않으면 'no'를 출력합니다.
str = input("문자열을 입력하시오:")
cnt=0
for i in range(0,len(str)):
    if(str[i]=='('):
        cnt=cnt+1
        
       
    if(str[i]==')'):
        cnt=cnt-1
        
        

if(cnt==0):
    print("yes")
else:
    print("no")
    
        
