# 56. 재귀함수 분석
# 자연수 N이 주어지면 재귀함수를 사용하여 1부터 N까지 출력하는 프로그램을 작성하시오.

def count(n):
    if(n==0):
        return
    else:
        count(n-1)
        print(n, end=" ")
        
'''
#역순으
def count(n):
    if(n==0):
        return
    else:
        print(n, end=" ")
        count(n-1)
'''        

n=int(input("숫자를 입력하시오:"))
count(n)
