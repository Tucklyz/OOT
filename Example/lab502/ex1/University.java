package lab502.ex1;
public class University{
    private String uname;
    private String province;

    public University(){}

    public University(String uname, String province){
        this.uname = uname;
        this.province = province;
    }

    public void setUname(String uname){
        this.uname = uname;
    }
    public String getUname(){
        return uname;
    }

    public void setProvince(String province){
        this.province = province;
    }
    public String getProvince(){
        return province;
    }
}