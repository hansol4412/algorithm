# 57. 재귀함수  이진수 출력
# 10진수 N이 입력되면 재귀함수를 사용하여 2진수로 변환해 출력하는 프로그램을 작성하시오.
def program(x):
    if(x==1):
        print(1, end=" ")
        return
    else:
        program(int(x/2))
        print(x%2, end=" ")



n=int(input("수를 입력하시오:"))
program(n)
    
