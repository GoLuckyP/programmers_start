class Solution {
    public int solution(int hp) {
        int count = 0;
        int generalAnt = 5, soldierAnt = 3, workerAnt = 1;

        // 장군개미로 나누어 떨어지는 부분 계산
        if (hp >= generalAnt) {
            count += hp / generalAnt;
            hp %= generalAnt;
        }

        // 남은 체력이 3 이상인 경우 병정개미 사용
        if (hp >= soldierAnt) {
            count += hp / soldierAnt;
            hp %= soldierAnt;
        }

        // 남은 체력이 1 이상인 경우 일개미 사용
        if (hp > 0) {
            count += hp;
        }

        int answer = count;
        return answer;
    }
}
