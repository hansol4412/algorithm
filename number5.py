# 5. 나이계산
# 주민등록증의 번호가 주어지면 주민등록증의 주인의 나이와 성별을 판단해 출력하는 프로그램을 작성하시오.
# 올해는 2020년 입니다.

n= input("주민번호를 입력하세요:")
year=2020
if(int(n[7])==1):
        print("남")
        b=1900+int(n[0:2])
        age = year-b+1
        print(age)
if(int(n[7])==3):
    print("남")
    b=2000+int(n[0:2])
    age = year-b+1
    print(age)



if(int(n[7])==2):
    print("여")
    b=1900+int(n[0:2])
    age = year-b+1
    print(age)
if(int(n[7])==4):
    print("여")
    b=2000+int(n[0:2])
    age = year-b+1
    print(age)
