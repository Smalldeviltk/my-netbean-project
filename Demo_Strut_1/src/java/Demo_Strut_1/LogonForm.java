package Demo_Strut_1;

import Demo_Strut_1.*;
import org.apache.struts.action.ActionForm;

public class LogonForm extends ActionForm {

    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
