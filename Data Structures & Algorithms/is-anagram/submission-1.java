class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> m = new HashMap<>();
        HashMap<Character, Integer> n = new HashMap<>();
        for (char i : s.toCharArray()) {
            m.put(i, m.getOrDefault(i, 0) + 1);
        }
        for (char j : t.toCharArray()) {
            n.put(j, n.getOrDefault(j, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : m.entrySet()) {
            Character key = entry.getKey();
            Integer value1 = entry.getValue();
            Integer value2 = n.get(key);
            if (!value1.equals(value2)) {
                return false;
            }
        }
        return true;
    }
}
