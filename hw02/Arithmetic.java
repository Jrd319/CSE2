public class Arithmetic {
    public static void main(String[] args){
        
        //Number of pairs of pants
        int numPants = 3;
        //Cost per pair of pants
        double pantsPrice = 34.98;

        //Number of sweatshirts
        int numShirts = 2;
        //Cost per shirt
        double shirtPrice = 24.99;

        //Number of belts
        int numBelts = 1;
        //cost per box of envelopes
        double beltCost = 33.99;

        //the tax rate
        double paSalesTax = 0.06;
        
        double totalCostofShirts=numShirts*shirtPrice; //calculating the total cost of shirts
        double totalCostofBelts=numBelts*beltCost;  //calculating total cost of belts
        double totalCostofPants=numPants*pantsPrice; //calculating total cost of pants
        
        double TaxonPants=paSalesTax*totalCostofPants; //finding tax on pants
        double roundedPants=Math.round(TaxonPants*100)/100.0; //rounding the results
        double TaxonShirts=paSalesTax*totalCostofShirts; //finding tax on shirts
        double roundedShirts=Math.round(TaxonShirts*100)/100.0; //rounding the results
        double TaxonBelts=paSalesTax*totalCostofBelts; //finding the tax on belts
        double roundedBelts=Math.round(TaxonBelts*100)/100.0; //rounding the results
        
        double totalCostnoTax=totalCostofBelts+totalCostofPants+totalCostofShirts; //calculating total cost w/o tax
        double TaxonSale=paSalesTax*totalCostnoTax; //calculating tax on whole sale
        double roundedTotal=Math.round(TaxonSale*100)/100.0; //rounding
   
        double FinalCost=totalCostnoTax+TaxonSale; //calculating final price
        double roundedFinal=Math.round(FinalCost*100)/100.0; //rounding
    
        System.out.println("The total cost of the pants was: $"+totalCostofPants); //printing cost of pants
        System.out.println("The total cost of the shirts was: $"+totalCostofShirts); //printing cost of shirts
        System.out.println("The total cost of the belts was: $"+totalCostofBelts); //printing cost of belts
        
        System.out.println("The sales tax on the pants was: $"+roundedPants); //printing tax on pants
        System.out.println("The sales tax on the shirts was: $"+roundedShirts); //printing tax on shirts
        System.out.println("The sales tax on the belts was: $"+roundedBelts); //printing tax on belts
        
        System.out.println("The total cost before tax was: $"+totalCostnoTax); //printing cost w/o tax
        System.out.println("The total tax on the sale was: $"+roundedTotal); //printing total tax
        
        System.out.println("The final cost of the purchase was: $"+roundedFinal); //printing final total
   
    }    
}
