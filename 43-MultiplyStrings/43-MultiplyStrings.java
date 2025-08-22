// Last updated: 7/31/2025, 12:22:11 PM
class Solution {
    public static String multiply(String num1, String num2) {
    return String.valueOf((new java.math.BigInteger(num1)).multiply(new java.math.BigInteger(num2)));
    }
}