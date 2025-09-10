    class Solution {
        public int[] solution(String[] keymap, String[] targets) {
            Integer[] alpabet = new Integer[26];
            for (String key : keymap) {
                for (int i = 0; i < key.length(); i++) {
                    char ch = key.charAt(i);
                    int index = ch - 'A';
                    if (alpabet[index] == null) {
                        alpabet[index] = i + 1;
                    } else {
                        alpabet[index] = Math.min(alpabet[index], i + 1);
                    }
                }
            }
            int[] answer = new int[targets.length];
            for (int i = 0; i < targets.length; i++) {
                String target = targets[i];
                for (int j = 0; j < target.length(); j++) {
                    char ch = target.charAt(j);
                    int index = ch - 'A';
                    if (alpabet[index] == null) {
                        answer[i] = -1;
                        break;
                    } else {
                        answer[i] += alpabet[index];
                    }
                }
            }
            return answer;
        }
    }