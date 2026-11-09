class Factorial{
    public static void main(String args[]){  
        System.out.println("Factorial of 5 is :"+factorial(5));    
    }
    
    public static int factorial(int n){
        if(n <0){
            throw new IllegalArgumentException("Number must be non-negative");
        } 
        long result = 1;
        for(int i=1; i<=n; i++){
            result *= i;
        }
        return (int) result;
    }
}