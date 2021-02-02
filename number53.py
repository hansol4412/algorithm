# 53. K진수 출력 (Stack 클래스 사용o)
''' 10진수 n이 입력되면 m진수로 변형하여 출력하는 프로그램을 작성하시오. 
    스택 자료구조를 사용하여라 '''
n=int(input("10진수를 입력하세요:"))
m=int(input("변환하려는 m진수의 수를 입력하세요:"))
ex=[0,1,2,3,4,5,6,7,8,9,'A', 'B', 'C', 'D', 'E', 'F']
stack=[]
while(n>0):
    stack.append(ex[n%m])
    n=int(n/m)

while(len(stack)>0):
    top=stack.pop()
    print(top, end=" ")
