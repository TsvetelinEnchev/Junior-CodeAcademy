package Exercises_From_Mentors.exercise_DanceStudio;

public class Client {
  private String firstName;
  private String middleName;
  private String lastName;
  private int idNum;
  private String email;
 private boolean hasCard;
  private String payingMethod;
  private double discount;
  private double tax =10;

  public Client(String firstName,String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public Client(String firstName, String middleName, String lastName, int idNum, String email,boolean hasCard,
      String payingMethod) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.idNum = idNum;
    this.email = email;
    this.hasCard = hasCard;
    this.payingMethod = payingMethod;
    this.getTax();
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getIdNum() {
    return idNum;
  }

  public void setIdNum(int idNum) {
    this.idNum = idNum;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPayingMethod() {
    return payingMethod;
  }

  public void setPayingMethod(String payingMethod) {
    if (payingMethod.equals(null)) {}
    this.payingMethod = payingMethod;
  }

  public double getDiscount() {
    return discount;
  }

  public void setDiscount(double discountInPercents) {
    this.discount = (discountInPercents * this.tax)/100;
  }

  public boolean isHasCard() {
    return hasCard;
  }

  public void setHasCard(boolean hasCard) {
    this.hasCard = hasCard;
  }

  public double getTax() {
    return tax;
  }
  public  double setTax() {
    return this.tax -= this.discount;
  }

  @Override
  public String toString() {
    return "Client{" +
        "firstName='" + firstName + '\'' +
        ", middleName='" + middleName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", idNum=" + idNum +
        ", email='" + email + '\'' +
        ", hasCard=" + hasCard +
        ", payingMethod='" + payingMethod + '\'' +
        ", discount=" + discount +
        ", tax=" + tax +
        '}'+"\n";
  }
}
