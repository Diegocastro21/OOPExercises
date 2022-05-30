package DiscountSystem;

public class DiscountRate {

    private static double serviceDiscountPremium = 0.2;
    private static double serviceDiscountGold = 0.15;
    private static double serviceDiscountSilver = 0.1;
    private static double productDiscountPremium = 0.1;
    private static double productDiscountGold = 0.1;
    private static double productDiscountSilver = 0.1;

    public static double getServiceDiscountRate(String type){
        if (type.equalsIgnoreCase("Premium")){
            return serviceDiscountPremium;
        } else if (type.equalsIgnoreCase("gold")) {
            return serviceDiscountGold;
        }else if (type.equalsIgnoreCase("silver")) {
            return serviceDiscountSilver;
        }
        return 0.0;
    }

    public static double getProductDiscountRate(String type){
        if ("Premium".equalsIgnoreCase(type)){
            return productDiscountPremium;
        } else if ("gold".equalsIgnoreCase(type)) {
            return productDiscountGold;
        }else if ("silver".equalsIgnoreCase(type)) {
            return productDiscountSilver;
        }
        return 0.0;
    }
}
