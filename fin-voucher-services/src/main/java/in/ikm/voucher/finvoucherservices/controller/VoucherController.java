package in.ikm.voucher.finvoucherservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.ikm.voucher.finvoucherservices.contract.VoucherRequest;
import in.ikm.voucher.finvoucherservices.services.iVoucherService;

@RestController
@RequestMapping("/voucher")
public class VoucherController {

    @Autowired
    iVoucherService voucherservice;

    @RequestMapping(value = "/_create", method = RequestMethod.POST)
    public ResponseEntity<String> createvoucher(@RequestBody VoucherRequest request) {
        if(request.getAddress().equals("")){
            return new ResponseEntity<>("Address not blank", HttpStatus.BAD_REQUEST);
        }else if(request.getName().equals("")){
            return new ResponseEntity<>("Name not blank", HttpStatus.BAD_REQUEST);
        }else if(request.getAmount()<=0){
            return new ResponseEntity<>("Amount not blank", HttpStatus.BAD_REQUEST);
        }else{
        voucherservice.saveVoucher(request);
        return new ResponseEntity<>("Saved successfully", HttpStatus.OK);
        }

    }

}
