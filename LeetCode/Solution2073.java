class Solution2073 {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        while (tickets[k] != 0) {
            for (int i = 0; i < tickets.length && tickets[k] != 0; i++) {
                if (tickets[i] != 0) {
                    tickets[i] -= 1;
                    time++;
                }
            }
        }
        return time;
    }
}