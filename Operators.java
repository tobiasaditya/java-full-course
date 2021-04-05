import org.graalvm.compiler.core.common.type.ArithmeticOpTable.BinaryOp.And;

public class Operators {
    public static void main(String[] args) {
        int result = 1+2; //1+2 = 3
        System.out.println("1+2 = " + result);
        int prevResult = result;
        System.out.println("Previous result = " + prevResult);

        result = result -1; //3-1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("Previous result = " + prevResult);

        result = result*10; //2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3;
        System.out.println("4%3= " + result);

        result++;
        System.out.println("1+1 = " + result);

        result--;
        System.out.println("2-1 = " + result);

        result+=2;
        System.out.println("1+2 = " +result);

        result *= 10;
        System.out.println("3*10 = " + result);

        result /= 3;
        System.out.println("30/3 = "+ result);

        result-= 2;
        System.out.println("10-2 = " +result);

        boolean isAlien = true;
        if (isAlien == false){
            System.out.println("Not an Alien!");
        } else{
            System.out.println("Alien! Run!");
        }

        int topScore = 100;
        if (topScore==100){
            System.out.println("You got top score!");
        }
        else if (topScore<100 && topScore>60){ //AND
            System.out.println("You pass!");
        }
        else if(topScore<100 || topScore>100){ // OR
            System.out.println("You take the exam!");
        }
        else{
            System.out.println("You fail!");
        }
        
        //Shortcut if else
        int myAge = 12;
        boolean isOld = (myAge>=17)? true:false;
        //Jika myAge >=17, isOld bernilai true, jika tidak, maka isOld bernilai false
        if (isOld){
            System.out.println("You are old!");
        }
        else{
            System.out.println("You are not old, yet!");
        }

    }
    
}
