package ru.imit.october;


public class StringProcessor {

    public static String copyStr(String s, int N)throws IllegalArgumentException{
        if (N < 0)throw new IllegalArgumentException("Argument under zero");
        String copy = "" ;
        for(int i = 1; i <= N; i++)
                copy += s;
        return copy;
    }
    public static int quantEntrancies(String origin,String part){
        int quantity = 0;
        for (int i = 0; i <= (origin.length() - part.length()); i++){
            if (origin.regionMatches(i,part,0,part.length()) == true)
                quantity++;
        }
        return quantity;
    }
    public static String numsIntoChars(String str){
        str = str.replace("1","one");
        str = str.replace("2","two");
        str = str.replace("3","three");
        str = str.replace("4","four");
        str = str.replace("5","five");
        str = str.replace("6","six");
        str = str.replace("7","seven");
        str = str.replace("8","eight");
        str = str.replace("9","nine");

        return str;
    }
    public static void removeEven(StringBuilder origin){
        for(int i = 0; i < origin.length(); i ++)
            origin.deleteCharAt(i);
    }
    public static void swapFirstAndFinalWords(StringBuilder origin){
        char gap = ' ';
        String firstWord, finalWord;
        int oldLength = origin.length();
        int indexFirstBeg = 0, indexFirstEnd, indexFinalBeg, indexFinalEnd = (origin.length()-1);
        while (indexFirstBeg < origin.length() && origin.charAt(indexFirstBeg) == gap)indexFirstBeg++;
        indexFirstEnd = indexFirstBeg;
        while (indexFirstEnd < origin.length() && origin.charAt(indexFirstEnd) != gap)indexFirstEnd++;
        while (indexFinalEnd >= 0 && origin.charAt(indexFinalEnd) == gap)indexFinalEnd--;
        indexFinalBeg = indexFinalEnd;
        while (indexFinalBeg >= 0 && origin.charAt(indexFinalBeg) != gap)indexFinalBeg--;
        firstWord = origin.substring(indexFirstBeg,indexFirstEnd);
        finalWord = origin.substring(indexFinalBeg+1,indexFinalEnd+1);
        origin.replace(indexFirstBeg,indexFirstEnd,finalWord);
        indexFinalBeg = origin.length() - oldLength + indexFinalBeg;
        indexFinalEnd = origin.length() - oldLength + indexFinalEnd;
        origin.replace(indexFinalBeg + 1,indexFinalEnd + 1,firstWord);
    }

    public static String hexadecimalToDecimal(String str){
        String[] array = str.split(" ");
        double decNum = 0;
        for(int i = 0; i < array.length; i++){
            if (array[i].startsWith("0x") == true){
                int index = 2;
                while (index <= 9){
                    decNum += (array[i].charAt(index) - '0')* Math.pow(16,9-index);
                    index++;
                }
                array[i] = Integer.toString((int)decNum);
                decNum = 0;
            }
        }
        str = String.join(" ",array);
        return str;
    }

    public static String exchangeNums(String str){
        int count = StringProcessor.quantEntrancies(str,"0x");
        double decNum = 0;
        int index = -2;
        while (count != 0){
            int countPow = 7;
            index = str.indexOf("0x", index + 2);
           while (countPow > -1 && Character.isDigit(str.charAt(index + 9 - countPow))){
               decNum += (str.charAt(index + 9 - countPow) - '0')* Math.pow(16,countPow);
               countPow--;
           }
           if(countPow == -1) {
               String part = str.substring(index, index + 10);
               str = str.replace(part, Integer.toString((int) decNum));
               decNum = 0;
           }
            count--;
        }
        return str;
    }

}
