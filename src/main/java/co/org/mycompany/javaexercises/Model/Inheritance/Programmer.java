package src.main.java.co.org.mycompany.javaexercises.Model.Inheritance;

public class Programmer extends Person {

    private String favoriteLanguage;

    public Programmer() {
        super();
    }

    /**
     * 
     * @param fullName
     * @param age
     * @param idCard
     * @param favoriteLanguage
     */
    public Programmer(String fullName, byte age, int idCard, String favoriteLanguage) {
        super(fullName, age, idCard);
        this.favoriteLanguage = favoriteLanguage;
    }

    @Override
    public String introduceOneself() {
        return super.introduceOneself()+" Also, my favorite programming language is "+favoriteLanguage+".";
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }
    
}
