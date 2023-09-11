
package TareaConversion;

//Conversion del ejemplo de Ruby(Rspec) a Java (JUnit)
public class StringCalculator {
    public StringCalculator(){}
    
    public int add(String input){
        return 0;
    }
    
    public int addTwo(String input){
        if(input.isEmpty()){
            return 0;
        }else{
            return Integer.parseInt(input);
        }
    }
    
    public int addThree(String input){
        if(input.isEmpty()){
            return 0;
        }else{
            String[] numbers = input.split(",");
            int sum = 0;
            for (int i=0;i<numbers.length;i++) {
                sum = sum + Integer.parseInt(numbers[i]);
            }
            return sum;
        }
    }
}
