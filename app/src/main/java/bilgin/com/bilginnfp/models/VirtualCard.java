package bilgin.com.bilginnfp.models;

/**
 * DAVID DAVENPORT'UN ASKERLERİYİZ
 *
 * @author Mehmet Can Altuntaş
 * github.com/mehmetcc
 */
public class VirtualCard {

    // variables
    private String id;
    private float limit;
    private float available;
    private float debt;

    // constructor(s)
    public VirtualCard(String id, float limit) {
        this.id = id;
        this.limit = limit;
        this.available = limit;
    }

    // methods
    public boolean isEligibleForPayment(float amountToPay) {
        boolean isEligible = false;

        if (available - amountToPay >= 0)
            isEligible = true;

        return isEligible;
    }

    public boolean makePayment(float amountToPay) {
        boolean isEligible = this.isEligibleForPayment(amountToPay);

        if (isEligible) {
            available -= amountToPay;
            debt += amountToPay;
        }

        return isEligible;
    }


    // getters and setters
    public String getId() {
        return id;
    }

    public float getLimit() {
        return limit;
    }

    public float getAvailable() {
        return available;
    }

    public float getDebt() {
        return debt;
    }

}
