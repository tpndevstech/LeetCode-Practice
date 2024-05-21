class Solution {
  public int divide(long dividend, long divisor) {
    // -2^{31} / -1 = 2^31 will overflow, so return 2^31 - 1.
    if (dividend == Integer.MIN_VALUE && divisor == -1)
      return Integer.MAX_VALUE;

    final int sign = dividend > 0 ^ divisor > 0 ? -1 : 1;
    long ans = 0;
    long dvdend = Math.abs(dividend);
    long dvsor = Math.abs(divisor);

    while (dvdend >= dvsor) {
      long k = 1;
      while (k * 2 * dvsor <= dvdend)
        k *= 2;
      dvdend -= k * dvsor;
      ans += k;
    }

    return sign * (int) ans;
  }
}
