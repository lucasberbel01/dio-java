public class Quadrilateros {
    public double area(double n1){

        return n1*n1;
    }

    public double area(double n1,double n2){

        return n1*n2;
    }

    public double area(double baseMaior,double altura, double baseMenor){

        return ((baseMaior+baseMenor)*altura)/2;
    }
}
