class Solution {
    public int solution(int chicken) {
        int totalChicken = 0;
        int service = chicken / 10;
        int coupon = service + (chicken % 10);
        
        totalChicken += service;
        
        while(coupon >= 10){
            service = coupon / 10;
            coupon = service + (coupon % 10);
            totalChicken += service;
        }
        
        return totalChicken;
    }
}