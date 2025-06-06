public class Main 
    public static void main(String [] args) 
        SignedText st1 = new SignedText("", "Wong");
        String temp = st1.getSignature();
        System.out.println(temp); // "Wong"

        SignedText st2 = new SignedText("henri", "dubois");
        temp = st2.getSignature();
        System.out.println(temp); // "h-dubois"

        SignedText st3 = new SignedText("GRACE", "LOPEZ");
        temp = st3.getSignature();
        System.out.println(temp); // "G-LOPEZ"

        SignedText st4 = new SignedText("", "FOX");
        String text = "Dear";
        temp = st4.addSignature(text);
        System.out.println(temp); // "DearFOX"

        text = "Best wishesFOX";
        temp = st4.addSignature(text);
        System.out.println(temp); // "Best wishesFOX"

        text = "FOXThanks";
        temp = st4.addSignature(text);
        System.out.println(temp); // "ThanksFOX"

        text = "G-LOPEZHello"; 
        temp = st3.addSignature(text);
        System.out.println(temp); // "HelloG-LOPEZ"
    }
}
