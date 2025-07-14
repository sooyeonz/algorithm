#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
char* solution(const char* my_string) {
    int len = strlen(my_string);
    
    // 문자열 길이 + 1 (null terminator)만큼 메모리 할당
    char* answer = (char*)malloc(len + 1);
    
    // 문자열을 뒤집어서 저장
    for (int i = 0; i < len; i++) {
        answer[i] = my_string[len - 1 - i];
    }
    
   // null terminator 추가
    answer[len] = '\0';
    
    return answer;
}