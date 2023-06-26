package in.ikm.voucher.finvoucherservices.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ikm.voucher.finvoucherservices.contract.VoucherRequest;
import in.ikm.voucher.finvoucherservices.model.Voucher;
import in.ikm.voucher.finvoucherservices.repository.VoucherRepository;

@Service
public class VoucherServiceImpl implements iVoucherService {

    @Autowired
    ModelMapper modelmapper;

    @Autowired
    VoucherRepository repository;

    public void saveVoucher(VoucherRequest request) {

        Voucher voucher = modelmapper.map(request, Voucher.class);
        repository.save(voucher);

    }
}
