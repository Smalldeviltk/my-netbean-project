package Demo_Strut_1;

import Demo_Strut_1.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;

public class LogonAction extends Action {

    public ActionForward execute(
            ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {
        LogonForm theForm = (LogonForm) form;
        String forward = "Failure";

        if (theForm.getUserName().equals("abc")) {
            forward = "Success";
        }
        return mapping.findForward(forward);
    }
}
