import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char schar = s.charAt(i);
            char tchar = t.charAt(i);

            if (mapST.containsKey(schar)) {
                if (mapST.get(schar) != tchar) {
                    return false;
                }
            } else {
                mapST.put(schar, tchar);
            }

            if (mapTS.containsKey(tchar)) {
                if (mapTS.get(tchar) != schar) {
                    return false;
                }
            } else {
                mapTS.put(tchar, schar);
            }
        }
        return true;
    }
}
