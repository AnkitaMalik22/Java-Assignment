class Solution {
    public int addDigits(int num) {
         int sum = 0;
            while (num > 0) {
                int reminder = num % 10;
                num = num / 10;
                sum += reminder;
            }
      return sum<10?sum:addDigits(sum);
    }
}