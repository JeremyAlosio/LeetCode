//https://leetcode.com/problems/robot-return-to-origin/
// #657
// Easy

class _657_Robot_Return_to_Origin {

    public boolean judgeCircle(String moves) {
        int y = 0;
        int x = 0;

        for(Character move : moves.toCharArray()) {
            switch(move) {
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'L':
                    x++;
                    break;
                case 'R':
                    x--;
                    break;
            }
        }

        return y == 0 && x == 0;
    }
}