package in.ikm.voucher.finvoucherservices.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "voucherdetails")
public class Voucher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    @NotBlank
    private String name;

    @Column(name = "address")
    @NotBlank
    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "headid")
    @NotBlank
    private int headid;

    @Column(name="amount",precision=10, scale=2)
    @NotBlank
    private float amount;

}
