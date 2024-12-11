package StringPgms;
public class LongestCommonSubString {
  public static String findLongestCommonSubstring(String str1, String str2) {
    // implementation goes here
    int l1 = str1.length();
        int l2 = str2.length();
        int[][] arr = new int[l1 + 1][l2 + 1];
        int len = 0, pos = -1, x =0;
        for (x = 1; x < l1 + 1; x++)
        {
            for (int y = 1; y < l2 + 1; y++)
            {
                if (str1.charAt(x - 1) == str2.charAt(y - 1))
                {
                        arr[x][y] = arr[x - 1][y - 1] + 1;
                       if (arr[x][y] > len)
                       {
                         len = arr[x][y];
                          pos = x;
                       }              
                }
              else
                   arr[x][y] = 0;
            }
        }        
        return str1.substring(pos-len, pos);
 
  }
    public static void main(String args[])
    {
      System.out.println(findLongestCommonSubstring("abcde", "bcd"));
    }
}