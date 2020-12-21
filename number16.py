# 16. Anagram (구글 인터뷰 문제)
# 아나그램이란 두 문자열이 알파벳의 나열 순서는 다르지만 그 구성이 일치하면 두 단어는 아나그램이라고 한다
# 아나그램 판별시 대소문자는 구별된다.
str1=input("첫번째 문자열을 입력하세요:")
str2=input("두번째 문자열을 입력하세요:")
t1 = [ 0 for i in range(52)]
t2 = [ 0 for i in range(52)]

for i in range(0,len(str1)):
    if(ord(str1[i])>90):
        #대문자 일 때
        t1[ord(str1[i])-71]=t1[ord(str1[i])-71]+1
    else:
        #소문자 일 떄
        t1[ord(str1[i])-65]=t1[ord(str1[i])-65]+1


for i in range(0,len(str2)):
    if(ord(str2[i])>90):
        #대문자 일 때
        t2[ord(str2[i])-71]=t2[ord(str2[i])-71]+1
    else:
        #소문자 일 떄
        t2[ord(str2[i])-65]=t2[ord(str2[i])-65]+1


if(t1==t2): print("YES")
else: print("NO")
