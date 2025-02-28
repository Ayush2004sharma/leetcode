class Solution {
  public String shortestCommonSupersequence(String str1, String str2) {
    String lcs = lcs(str1, str2);
    StringBuilder sb = new StringBuilder();
    int i = 0, j = 0;

    for (char c : lcs.toCharArray()) {
      while (str1.charAt(i) != c) sb.append(str1.charAt(i++));
      while (str2.charAt(j) != c) sb.append(str2.charAt(j++));
      sb.append(c);
      i++;
      j++;
    }

    return sb.append(str1.substring(i)).append(str2.substring(j)).toString();
  }

  private String lcs(String a, String b) {
    int m = a.length(), n = b.length();
    StringBuilder[] dp = new StringBuilder[n + 1];

    for (int j = 0; j <= n; ++j) dp[j] = new StringBuilder();

    for (int i = 1; i <= m; ++i) {
      StringBuilder prev = new StringBuilder();
      for (int j = 1; j <= n; ++j) {
        StringBuilder temp = dp[j];
        if (a.charAt(i - 1) == b.charAt(j - 1)) {
          dp[j] = new StringBuilder(prev).append(a.charAt(i - 1));
        } else {
          dp[j] = dp[j].length() > dp[j - 1].length() ? dp[j] : dp[j - 1];
        }
        prev = temp;
      }
    }
    return dp[n].toString();
  }
}
