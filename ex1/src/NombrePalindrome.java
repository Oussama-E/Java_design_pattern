public class NombrePalindrome implements Observer{
    private int nb = 0;
    @Override
    public void traiterLigne(String ligne) {
        for (String mot : ligne.trim().split(" ")) {
            StringBuffer temp = new StringBuffer(mot);
            if (mot.equals(temp.reverse().toString())) {
                nb++;
            }
        }

    }

    @Override
    public void render() {
        System.out.println("Nombre de palindrome(s) : " + nb);
    }
}
