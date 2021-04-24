def solution(numbers):
    arrLen = len(numbers)
    answer = []
    for i in range(0,arrLen-1):
        for j in range(i+1, arrLen):
            addNum = numbers[i] + numbers[j]
            if addNum not in answer:
                answer.append(addNum)
    answer.sort()
    return answer