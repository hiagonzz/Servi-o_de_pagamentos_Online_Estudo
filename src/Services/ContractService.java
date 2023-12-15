package Services;

import java.time.LocalDate;

import Entities.Contract;
import Entities.Installment;

public class ContractService {
    private OnlinePaymentservice onlinePaymentservice;

    public ContractService(OnlinePaymentservice onlinePaymentservice){
        this.onlinePaymentservice = onlinePaymentservice;

    }

    public void processContract(Contract contract, int months){
        contract.getInstalments().add(new Installment(LocalDate.of(2018, 8, 25),208.08));    
        contract.getInstalments().add(new Installment(LocalDate.of(2018, 7, 25),206.04));
        
        }
}
