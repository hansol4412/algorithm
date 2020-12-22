# 17. 선생님 퀴즈
""" 학생이 n명 있습니다. 선생님은 각 학생들에게 숫자가 적힌 카드를 주고, 학생들은 1부터 자기 카드까지 합을 구합니다.
    학생들이 입력한 합이 맞으면 YES 틀리면 NO를 출력하시오 """

student=int(input("학생의 수를 입력하시오:"))
for i in range(0,student):
    q=int(input("선생님이 준 숫자를 입력하오:"))
    sum=0
    for j in range(0,q+1):
        sum = sum+j
    
    a=int(input("학생이 구한 답을 입력하시오:"))

    if(a==sum): print("YES")
    else: print("No")
    
