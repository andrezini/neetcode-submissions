
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> temp = new Stack<>();
        int[] result = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {

            while (!temp.isEmpty()
                    && temperatures[i] > temperatures[temp.peek()]) {

                int previousDay = temp.pop();
                result[previousDay] = i - previousDay;
            }

            temp.push(i);
        }

        return result;
    }
}