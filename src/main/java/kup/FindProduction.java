package kup;

public class FindProduction {
    public static long getResult(long m,long n){

        //        Writing lambda for the given requirement
        ProductionOfNumbers productionOfNumbers= ((x, y) -> {
            long res = 1;
            for(long a= y; a>=x;a--){
                res = res * a;
            }
            return res;
        });
       return productionOfNumbers.getProduction(m,n);
    }
    public static void main(String[] args) {

//      getting output
        long answer1 = FindProduction.getResult(5,15);
        long answer2 = FindProduction.getResult(2,2);

        System.out.println(answer1);
        System.out.println(answer2);

    }
}
