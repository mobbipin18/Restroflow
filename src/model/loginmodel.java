
package model;


public class loginmodel {
    String username44,password44,txtfullname;
    public loginmodel(String txtfullname, String username44, String password44)
    {
        this.username44= username44;
        this.password44= password44;
        this.txtfullname= txtfullname;
    }

    public String getUsername44() {
        return username44;
    }

    public String getPassword44() {
        return password44;
    }

    public String getTxtfullname() {
        return txtfullname;
    }

    public void setUsername44(String username44) {
        this.username44 = username44;
    }

    public void setPassword44(String password44) {
        this.password44 = password44;
    }

    public void setTxtfullname(String txtfullname) {
        this.txtfullname = txtfullname;
    }
    
}
