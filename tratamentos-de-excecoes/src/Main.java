public class Main {
    public static void main(String[] args) {
        try{
            System.out.println("teste");

        }catch (NumberFormatException e){
            System.out.println("catch para inputs invalidos. EX: String em int ou double");

        }catch (ArithmeticException e){
            System.out.println("catch para divisoes por 0");

        }
    }
}
