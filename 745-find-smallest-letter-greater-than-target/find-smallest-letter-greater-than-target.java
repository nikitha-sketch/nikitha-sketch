class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
       /* Arrays.sort(letters);
        for(int i=0;i<letters.length;i++){
            if(letters[i]>target){
                return letters[i];
            }
        }
        return letters[0];*/
        int left=0;
        int right=letters.length-1;
        char res=letters[0];
        while(left<=right){
            int mid=left+(right-left)/2;
            if(letters[mid]>target){
                res=letters[mid];
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return res;
    }
}