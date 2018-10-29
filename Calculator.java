public class Calculator {
    int n =0;
    int total =0;
    char previousOperator =' ';
    States currentState;

    public Calculator(){
       currentState = new State0(this, ' ');
    }
    int getTotal(){
        return  total;
    }
    int getN(){
        return n;
    }

    public char getPreviousOperator(){
        return previousOperator;
    }

    public void setN(int c){
        n = c;
    }
    void setTotal(int t){
        total = t;
    }

    void setPreviousOperator(char p){
        previousOperator = p;
    }

    void setCurrentState(States currState){
        currentState = currState;
    }
    public States getCurrentState(){
        return currentState;

    }

    /*public static void main(String[] args){
        System.out.println("Enter values to calculate: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char inputArray[] =input.toCharArray();
        for(int i = 0; i<inputArray.length; i++){
            currentState.update(inputArray[i], this);
        }

    }*/

}
