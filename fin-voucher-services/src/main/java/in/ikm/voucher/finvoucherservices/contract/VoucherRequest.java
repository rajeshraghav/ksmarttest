package in.ikm.voucher.finvoucherservices.contract;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VoucherRequest {

    private Long id;
    private String name;
    private String address;
    private String phone;
    private int headid;
    private float amount;
    
}
