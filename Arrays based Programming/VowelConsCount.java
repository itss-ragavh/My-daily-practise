class VowelConsCount {
    public static void main(String[] args) {
        String a="ragavh";
        int vowelcount=0;
        int conscounnt=0;
       for(int i=0;i<a.length();i++){
         char ch=a.charAt(i);
         if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
          vowelcount++;
         }
         else{
          conscounnt++;
         }
       }
       System.out.println(a);
       System.out.println("Vowel Count :"+vowelcount+"\nConsonant count :"+conscounnt);
    }    
}
