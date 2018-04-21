package User;


public class student {

    private String id;
    private String name;
    private Boolean feeStatus;


    public student(String id, String name, Boolean feeStatus) {
        this.id = id;
        this.name = name;
        this.feeStatus = feeStatus;
    }

    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getFeeStatus() {
        return feeStatus;
    }

    public void setFeeStatus(Boolean feeStatus) {
        this.feeStatus = feeStatus;
    }


}
