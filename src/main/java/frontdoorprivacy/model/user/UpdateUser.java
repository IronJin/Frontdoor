package frontdoorprivacy.model.user;

public class UpdateUser {
        private int id;
        private String P_PhoneNumber;
        private String P_UserId;
        private String P_Password;
        private String P_Email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getP_PhoneNumber() {
        return P_PhoneNumber;
    }

    public void setP_PhoneNumber(String p_PhoneNumber) {
        P_PhoneNumber = p_PhoneNumber;
    }

    public String getP_UserId() {
        return P_UserId;
    }

    public void setP_UserId(String p_UserId) {
        P_UserId = p_UserId;
    }

    public String getP_Password() {
        return P_Password;
    }

    public void setP_Password(String p_Password) {
        P_Password = p_Password;
    }

    public String getP_Email() {
        return P_Email;
    }

    public void setP_Email(String p_Email) {
        P_Email = p_Email;
    }

    public UpdateUser() {
    }
}
