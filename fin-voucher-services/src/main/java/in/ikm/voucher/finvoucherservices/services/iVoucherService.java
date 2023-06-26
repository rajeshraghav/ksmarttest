package in.ikm.voucher.finvoucherservices.services;

import org.springframework.stereotype.Service;

import in.ikm.voucher.finvoucherservices.contract.VoucherRequest;

@Service
public interface iVoucherService {
    public void saveVoucher(VoucherRequest request);
}
