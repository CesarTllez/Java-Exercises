package src.main.java.co.org.mycompany.javaexercises.Model.Inheritance;

public abstract class Person {

    protected String fullName;
    protected byte age;
    protected int idCard;

    public Person(){}
    
    /**
     * 
     * @param fullName
     * @param age
     * @param idCard
     */
    public Person(String fullName, byte age, int idCard) {
        this.fullName = fullName;
        this.age = age;
        this.idCard = idCard;
    }

    public String introduceOneself(){
        return "Hi, my name's "+fullName+", I'm "+age+" years old.";
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

}
