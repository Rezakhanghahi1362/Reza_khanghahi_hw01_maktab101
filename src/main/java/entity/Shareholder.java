package entity;

public class Shareholder {
    private int id;
    private String name;
    private String phoneNumber;
    private String nationalCode;


    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public String getNationalCode(){
        return nationalCode;
    }
    public void setNationalCode(String nationalCode){
        this.nationalCode=nationalCode;
    }
}
