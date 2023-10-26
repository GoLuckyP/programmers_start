/*부족한 금액 계산하기 */

// class Solution {
//     public long solution(int price, int money, int count) {
        
//         long payAmount = 0; //지불해야 할 금액을 담는 변수

//         // 회당 내야할 돈 = 놀이기구를 N 번 째 이용한다면 원래 이용료의 N배 = price * count
//         //지불 금액 = 회당 내야할 돈 * 이용 횟수 
//         for(int cnt= 1;cnt <= count;cnt++){
//             payAmount += (long)price * cnt;
//         }
                                                     
//         long shortage =  payAmount - money;
//         //내야할 돈이 가지고 있는 돈보다 크면 모자른 금액 반환
//         return (shortage > 0) ? shortage: 0;  
//     }
// }



class Solution {
    public long solution(int price, int money, int count) {
        
        long payAmount = 0; //지불해야 할 금액을 담는 변수

        // 회당 내야할 돈 = 놀이기구를 N 번 째 이용한다면 원래 이용료의 N배 = price * count
        //지불 금액 = 회당 내야할 돈 * 이용 횟수 
        for(long cnt= 1;cnt <= count;cnt++){
            payAmount += price * cnt;
        }
                                                           
        //내야할 돈이 가지고 있는 돈보다 크면 모자른 금액 반환
        if(payAmount > money){
         //모자른 금액 = 내야 할 돈 - 가진 돈
            return (long)payAmount - money;
        }else{
            return (long) 0;
        }
    }
}