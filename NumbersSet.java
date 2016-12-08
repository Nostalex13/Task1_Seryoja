import java.util.Scanner;

/**
 * Created by Nostalex on 10.10.2016.
 */
public class NumbersSet {
    private int lowBoundary;
    private int highBoundary;

    public NumbersSet(){
        while(!validateInput());
    }

    public boolean validateInput(){
        try {
            System.out.println("\t\n *Please enter lower boundary* ");
            Scanner scan = new Scanner(System.in);
            lowBoundary = scan.nextInt();
            System.out.println("\t *Please enter upper boundary* ");
            highBoundary = scan.nextInt();
            if(lowBoundary >= highBoundary) throw new IndexOutOfBoundsException();
            return true;
        }
        catch(IndexOutOfBoundsException ex){
            System.out.println("\t *Upper boundary can`t be equal or less than lower one* ");
        }
        return false;
    }

    public int getLength(){
        return highBoundary - lowBoundary;
    }

    public int getLowBoundary() {
        return lowBoundary;
    }

    public void setLowBoundary(int lowBoundary) {
        this.lowBoundary = lowBoundary;
    }

    public int getHighBoundary() {
        return highBoundary;
    }

    public void setHighBoundary(int highBoundary) {
        this.highBoundary = highBoundary;
    }
}
