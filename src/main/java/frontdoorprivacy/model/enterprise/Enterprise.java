package frontdoorprivacy.model.enterprise;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Enterprise {

    private long enid;
    private String enterpriseName;
    private String enterpriseNumber;
    private String address;
    private String enterpriseId;
    private String password;
    private String phoneNumber;
    private String createDateTime;
    private String updateDateTime;
    private String accountNumber;
    private String useYN;

    public Enterprise(String enterpriseName, String enterpriseNumber, String address, String enterpriseId, String password,
                      String phoneNumber, String createDateTime, String updateDateTime, String accountNumber) {
        this.enterpriseName = enterpriseName;
        this.enterpriseNumber = enterpriseNumber;
        this.address = address;
        this.enterpriseId = enterpriseId;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.createDateTime = createDateTime;
        this.updateDateTime = updateDateTime;
        this.accountNumber = accountNumber;
    }

}
