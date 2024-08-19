public class AadheeShah {

    public static void main(String[] args) {
        String domain = "https://www.google.com";
        int dot = domain.lastIndexOf(".");
        String lastWord = domain.substring(dot + 1);

        System.out.println(lastWord);

        if (domain.equals("com")) {
            System.out.println("This is a .com domain");
        } else if (domain.equals("pk")){
            System.out.println("This is a .pk domain");
        } else {
            System.out.println("This is not a .com or .pk domain");
        }
    }
}