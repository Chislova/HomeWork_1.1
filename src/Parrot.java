public class Parrot {
    String s;
    public Parrot(){
        s = "Sqwak!";
    }

    public String teach(String phrase){
        this.s = phrase;
        return s;
    }

    public void speak(){
        System.out.println(this.s);
    }
}
