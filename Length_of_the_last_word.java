class Solution {
    public int lengthOfLastWord(String s) {
        int c=0;
        String p=s.trim();
        for(int i=p.length()-1;i>=0;i--)
        {
            char ch=p.charAt(i);
            if(ch==' ')
                break;
            else
                c++;
        }
        return c;
    }
}
