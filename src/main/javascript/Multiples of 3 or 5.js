function solution(number) {
    let multiple = 0, i = 3;
    while (i < number) {
        if (i % 3 == 0 || i % 5 == 0) {
            multiple += i;
        }
        i++;
    }
    return multiple;
}