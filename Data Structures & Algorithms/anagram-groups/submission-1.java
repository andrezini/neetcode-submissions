class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      return Arrays.stream(strs)
            .collect(Collectors.groupingBy(
                word -> word.chars()
                    .sorted()
                    .collect(
                        StringBuilder::new,
                        (sb, ch) -> sb.append((char) ch),
                        StringBuilder::append
                    )
                    .toString()
            ))
            .values()
            .stream()
            .toList();
    }
}
