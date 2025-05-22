public class SignedText{
    private String ln = "";
    private String fn = "";
    
    public SignedText(String firstN, String lastN){
        fn = firstN;
        ln = lastN;
    }

    public String getSignature(){
        return fn.substring(0,1) + "-" + ln;
    }

    public String addSignature(String text){
        int locate = text.indexof(getSignature);
        if(this.text.indexof(getSignature) > 0){
            return text.substring(locate, (locate + getSignature.length())) + text.substring(locate+getSignature.length());
        }
        return text
    }
}
