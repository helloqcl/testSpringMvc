package personal.qcl.test.testSpringMVC.entities;

public class People {
    private int pId;
    private  boolean pSex;
    private String pName;
    private String pEmail;

    public People() {
    }

    public People(int pId, boolean pSex, String pName) {
        this.pId = pId;
        this.pSex = pSex;
        this.pName = pName;
    }

    public People(int pId, boolean pSex, String pName, String pEmail) {
        this.pId = pId;
        this.pSex = pSex;
        this.pName = pName;
        this.pEmail = pEmail;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public boolean ispSex() {
        return pSex;
    }

    public void setpSex(boolean pSex) {
        this.pSex = pSex;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpEmail() {
        return pEmail;
    }

    public void setpEmail(String pEmail) {
        this.pEmail = pEmail;
    }

    @Override
    public String toString() {
        return "people{" +
                "pId=" + pId +
                ", pSex=" + pSex +
                ", pName='" + pName + '\'' +
                ", pEmail='" + pEmail + '\'' +
                '}';
    }
}

