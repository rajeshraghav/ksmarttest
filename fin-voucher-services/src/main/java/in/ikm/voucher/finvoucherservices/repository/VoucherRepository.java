package in.ikm.voucher.finvoucherservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ikm.voucher.finvoucherservices.model.Voucher;

@Repository
public interface VoucherRepository extends JpaRepository<Voucher,Long>{
    
}
