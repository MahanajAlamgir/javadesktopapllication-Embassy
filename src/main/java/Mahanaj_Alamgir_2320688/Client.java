package Mahanaj_Alamgir_2320688;

public class Client {
    private int PassportNumber;
    private String FullName,Marital_Status,Language;
    private String Email;
    private String PhoneNumber;
    private int NID_Number,Birth_Certificate_No;
    private String criminal_records,legal_residence;
    private int income;

    public Client() {
    }

    public Client(int passportNumber, int birth_Certificate_No, int NID_Number, String phoneNumber, String email, String language, String marital_Status, String fullName, String criminal_records, String legal_residence, int income) {
        PassportNumber = passportNumber;
        Birth_Certificate_No = birth_Certificate_No;
        this.NID_Number = NID_Number;
        PhoneNumber = phoneNumber;
        Email = email;
        Language = language;
        Marital_Status = marital_Status;
        FullName = fullName;
        this.criminal_records = criminal_records;
        this.legal_residence = legal_residence;
        this.income = income;
    }

    public int getPassportNumber() {
        return PassportNumber;
    }

    public void setPassportNumber(int passportNumber) {
        PassportNumber = passportNumber;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getMarital_Status() {
        return Marital_Status;
    }

    public void setMarital_Status(String marital_Status) {
        Marital_Status = marital_Status;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public int getNID_Number() {
        return NID_Number;
    }

    public void setNID_Number(int NID_Number) {
        this.NID_Number = NID_Number;
    }

    public int getBirth_Certificate_No() {
        return Birth_Certificate_No;
    }

    public void setBirth_Certificate_No(int birth_Certificate_No) {
        Birth_Certificate_No = birth_Certificate_No;
    }

    public String getCriminal_records() {
        return criminal_records;
    }

    public void setCriminal_records(String criminal_records) {
        this.criminal_records = criminal_records;
    }

    public String getLegal_residence() {
        return legal_residence;
    }

    public void setLegal_residence(String legal_residence) {
        this.legal_residence = legal_residence;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return "Client{" +
                "PassportNumber=" + PassportNumber +
                ", FullName='" + FullName + '\'' +
                ", Marital_Status='" + Marital_Status + '\'' +
                ", Language='" + Language + '\'' +
                ", Email='" + Email + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", NID_Number=" + NID_Number +
                ", Birth_Certificate_No=" + Birth_Certificate_No +
                ", criminal_records='" + criminal_records + '\'' +
                ", legal_residence='" + legal_residence + '\'' +
                ", income=" + income +
                '}';
    }
}
