package severina.testtask;

/**
 * Created by Звёздочка on 07.10.2018.
 */

public class Split extends MainActivity {
//Split text to four words by each line
    public String Splitm(String str) {
        int count=0;
        String resStr="";
        if (str.length() > 0) // Test is empty line
        {
            for (int i = SpaceCount(str); i < str.length(); i++) {
                resStr+=str.charAt(i);
                if (str.charAt(i)==' '){
                    count++;
                }
                if (count==4)
                {
                     resStr+="\n";
                     count=0;
                }
            }

        }
        return (resStr);
    }
//Delete space before text
    public int SpaceCount(String str){
        int temp =0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==' '){
                temp++;
            }
            else break;
        }
        return temp;
    }

}