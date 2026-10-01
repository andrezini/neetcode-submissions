class Solution {
    public int calPoints(String[] operations) {
        int score = 0;
        Stack<Integer> record = new Stack<>();

        for (int i = 0; i < operations.length;i++) {
            String op = operations[i];

            if (op.equals("C")) {
                score -= record.pop();
            } else if (op.equals("D")) {
                int newScore = record.peek() * 2;
                record.push(newScore)
                ;
                score += newScore;
            } else if (op.equals("+")) {
                int last = record.pop();
                int secondLast = record.peek();

                record.push(last)
                ;

                int newScore = last + secondLast;
                record.push(newScore)
                ;
                score += newScore;
            } else {
                int newScore = Integer.parseInt(op);
                record.push(newScore)
                ;
                score += newScore;
            }
        }

        return score;
    }
}