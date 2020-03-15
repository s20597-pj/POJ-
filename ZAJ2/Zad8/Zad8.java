
/*
Summary:Cipher code
Author: Mateusz Hinca
*/
public class Cipher
{
    public static void main(String[] args) {
        CipherCrypter matthewCrypted = new CipherCrypter("Mateusz");
        System.out.println(matthewCrypted.getName());
        System.out.println(matthewCrypted.getCryptedName());
    }

}
class CipherCrypter {
    private String cryptedName="",name="";
    public CipherCrypter(String name){
        this.name = name;
        for (int i=0;i<name.length();i++){
            int codedChar=(((int)name.charAt(i)+3)%26)+65;
            System.out.println(codedChar);
            this.cryptedName=cryptedName+(char)codedChar;
        }
    }
    public String getName(){
        return name;
    }
    public String getCryptedName(){
        return cryptedName;
    }
}