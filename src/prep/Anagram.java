package prep;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by apuris on 09/05/18.
 */
public class Anagram {

    public static void main(String[] args){
        String wordArr[] = {"cat", "dog", "act", "god", "tac"};
        int size = wordArr.length;
        printAnagramsTogether(wordArr, size);
    }

    private static void printAnagramsTogether(String[] wordArr, int size) {

        DupArray dupArray = new DupArray(wordArr, size);

        int i;

        for (i=0; i<size; i++){
            char[] chars = dupArray.array[i].str.toCharArray();
            Arrays.sort(chars);
            dupArray.array[i].str = new String(chars);
        }

        Arrays.sort(dupArray.array, new compStr());

        for (i=0; i<size; i++){
            System.out.println(wordArr[dupArray.array[i].index]+" ");
            System.out.println(dupArray.array[i].str + " " +dupArray.array[i].index);
        }
    }

    private static class DupArray {

        Word[] array;
        int size;

        public DupArray(String str[], int size){
            this.size = size;
            array = new Word[size];

            int i;
            for(i =0; i<size; i++ ){
                array[i] = new Word(str[i], i);
            }
        }
    }

    private static class Word {
        String str;
        int index;

        Word(String str, int index){
            this.index = index;
            this.str = str;
        }
    }

    private static class compStr implements Comparator<Word> {

        @Override
        public int compare(Word o1, Word o2) {
            return o1.str.compareTo(o2.str);
        }
    }
}
