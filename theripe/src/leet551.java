/**
 * @Author TheRipe
 * @create 2021/8/17 9:12
 */
class leet551 {
    public boolean checkRecord(String s) {
        int Acout = 0;
        int flag = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A') {
                Acout++;
            }
            if (c == 'L') {
                flag++;
                if (flag == 3) {
                    return false;
                }
            } else {
                flag = 0;
            }
        }
        if (Acout >= 2 || flag >= 3) {
            return false;
        } else {
            return true;
        }

    }
}