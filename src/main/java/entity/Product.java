package entity;

public class Product {
    private int id;
    private String name;
    private String creatDate;
    private int categoryId;
    private int brandId;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getCreatDate(){
        return creatDate;
    }
    public void setCreatDate(String creatDate){
        this.creatDate=creatDate;
    }
    public int getCategoryId(){
        return categoryId;
    }
    public void setCategoryId(int categoryId){
        this.creatDate=creatDate;
    }
    public int getBrandId(){
        return brandId;
    }
    public void setBrandId(int brandId){
        this.brandId=brandId;
    }
}
