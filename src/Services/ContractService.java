package Services;

import java.time.LocalDate;

import Entities.Contract;
import Entities.Installment;

public class ContractService {
    private OnlinePaymentservice onlinePaymentservice;

    public ContractService(OnlinePaymentservice onlinePaymentservice) {
        this.onlinePaymentservice = onlinePaymentservice;

    }

    public void processContract(Contract contract, int months) {
        double basicQuota = contract.getTotalValue() / months;


        for(int i=1; i <= months; i++){
            LocalDate dueDate = contract.getDate().plusMonths(i);


            double interest = onlinePaymentservice.interest(basicQuota, i);
            double fee = onlinePaymentservice.PaymentFee(basicQuota + interest);


            double quota = basicQuota + interest + fee;

            contract.getInstalments().add(new Installment(dueDate, quota));
        }
    }
}
