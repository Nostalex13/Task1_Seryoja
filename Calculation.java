import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nostalex on 10.10.2016.
 */
public class Calculation {
    private NumbersSet calcSet;
    private List<Integer> palindrome = new ArrayList<>();

    public Calculation(){
        calcSet = new NumbersSet();
    }

    public Calculation(NumbersSet _set){
        calcSet = _set;
    }

    public void NauchniyAlgoritm(){
        Integer tempInt;
        String tempStr;

        for(int i=calcSet.getLowBoundary(); i<=calcSet.getHighBoundary(); i++){

            if (i <= -10 || i >= 10) {
                tempInt = Math.abs(i);
                tempStr = tempInt.toString();

                if (tempStr.equals(new StringBuilder(tempStr).reverse().toString())) {
                    palindrome.add(i);
                }
            }
        }

        Results res = new Results();
        res.OchenNuzniyMetod(palindrome);
    }
}
