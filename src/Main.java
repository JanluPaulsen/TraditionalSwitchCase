public class Main {
    public static void main(String[] args) {
        char NATOLetter = 'A';
        switch (NATOLetter){
            case 'A':
                System.out.println("A for Able");
                break;
            case 'B':
                System.out.println("B for Baker");
                break;
            case 'C':
                System.out.println("C for Charlie");
                break;
            case 'D':
                System.out.println("D for Dog");
                break;
            case 'E':
                System.out.println("E for Easy");
                break;
            default:
                System.out.println(NATOLetter + " not found");
        }
    }
}