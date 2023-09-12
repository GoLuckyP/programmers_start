class Solution {
    public int solution(int price) {
        int discountedPrice = price; // 할인된 가격을 초기에는 가격 그대로로 설정
        
        // 가격에 따라 할인율을 계산
        if (price >= 500000) {
            discountedPrice = (int)(price * 0.8); // 20% 할인
        } else if (price >= 300000) {
            discountedPrice = (int)(price * 0.9); // 10% 할인
        } else if (price >= 100000) {
            discountedPrice = (int)(price * 0.95); // 5% 할인
        }
        
        return discountedPrice;
    }
}