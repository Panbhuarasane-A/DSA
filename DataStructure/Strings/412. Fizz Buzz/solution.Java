class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> new_list = new ArrayList<>(); 
        for (int i = 1; i < n + 1; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                new_list.add("FizzBuzz"); 
            } else if (i % 3 == 0 && i % 5 != 0) {
                new_list.add("Fizz");
            } else if (i % 3 != 0 && i % 5 == 0) {
                new_list.add("Buzz");
            } else {
                new_list.add(Integer.toString(i)); 
            }
        }
        return new_list;
    }
}
