import java.util.*;


/**

 * converting the digits from 0 to 99 into letters
 * @author leiy
 * @Time 2019-06-20 10:49:01
 *
 */
public class LetterConvert {

    public static void main(String[] args){
        int[] d = {3, 22};
        List<String> resultList = new LetterConvert().convertLetter(d);
        System.out.println(resultList);

    }

    /***
     * main funtion to convert digit into letters
     * @param inputData
     * @return rstList
     */
    public  List<String> convertLetter(int[] inputData) {

        char[][] charSet = new char[][]{
                {},{},
                {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'},
                {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'},
                {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}
        };

        List<String> rstList = new LinkedList<>();
        if(null == inputData){
            return rstList;
        }

        int length = inputData.length;
        for (int i = 0; i < length; i++) {
            if(inputData[i] < 0 || inputData[i] > 99){
                System.out.println(inputData[i] + " is out of boundaries, please make sure the digitle is in[0, 99]" );
                continue;
            }
            mixData(rstList, inputData[i], charSet);
        }
       return removeDuplication(rstList);

    }

    /***
     * mix the current number with result list
     * @param rstList the result List
     * @param index each of the input array data
     * @param charSet original charset
     */
    private  void mixData(List<String> rstList, int index, char[][] charSet){
        List<String> l=new LinkedList<>();
        List<String> tt=new LinkedList<>(rstList);
        rstList.clear();

        if(index < 10) {
            for (int i = 0; i < charSet[index].length; i++) {
                l.add(String.valueOf(charSet[index][i]));
            }
        }else if(index < 99){
            int sw = index/10;
            int gw = index%10;

            for (int i = 0; i < charSet[sw].length; i++) {
                l.add(String.valueOf(charSet[sw][i]));
            }

            for (int i = 0; i < charSet[gw].length; i++) {
                l.add(String.valueOf(charSet[gw][i]));
            }
        }
        if(tt.size()==0){
            for(int i=0;i<l.size();i++){
                rstList.add(l.get(i));
            }
        }else{
            for(int i=0;i<tt.size();i++){
                for(int j=0;j<l.size();j++){
                    rstList.add(tt.get(i)+l.get(j));
                }
            }
        }
    }

    /***
     *
     * @param listData original
     * @return result data which is not repeat
     */
    private List<String> removeDuplication(List<String> listData){

        Set<String> middleHashSet = new HashSet<String>(listData);
        listData.clear();
        listData = new ArrayList<String>(middleHashSet);
        return listData;
    }

}

