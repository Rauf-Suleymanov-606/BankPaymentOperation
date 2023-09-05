public class Payment {
        public static void getPayment(String bankName) {
            if (bankName.equals("LordBank")) {
                Bank lordBank = new LordBank(141300, 150);
                System.out.println(lordBank.paymentMethod());

            } else if (bankName.equals("WaterBank")) {
                Bank waterBank = new WaterBank(141400, 200);
                System.out.println(waterBank.paymentMethod());

            } else {
                System.out.println("Unfortunately, there is not considered any payment for this bank");
            }
        }
    }

