public class Strings {
    public static void main(String[] args) {
        String girl = "Sambrin";
        String boy = "Deva";
        System.out.println(girl+" "+boy);
        String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(text.length());
        System.out.println(text.toLowerCase());
        String newText = text.toLowerCase();
        System.out.println(newText.toUpperCase());
        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate"));
        String firstName = "Jay";
        String lastName = "Deva";
        System.out.println(firstName.concat(lastName));
    }
}
