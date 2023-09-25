package entity;

public class ShareholderBrand {
    private int shareholderId;
    private int brandId;


    public int getShareholderId(){
        return shareholderId;
    }
    public void setShareholderId(int shareholderId){
        this.shareholderId=shareholderId;
    }
    public int getBrandId(){
        return brandId;
    }
    public void setBrandId(int brandId){
        this.brandId=brandId;
    }
}
