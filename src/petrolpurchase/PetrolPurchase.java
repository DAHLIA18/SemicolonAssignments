package petrolpurchase;

public class PetrolPurchase {
        private String location;
        private String petrolType;
        private int quantity;
        private double pricePerLitre;
        private double discountPercentage;

        public PetrolPurchase(String location, String petrolType, int quantity, double pricePerLitre, double discountPercentage) {
            this.location = location;
            this.petrolType = petrolType;
            this.quantity = quantity;
            this.pricePerLitre = pricePerLitre;
            this.discountPercentage = discountPercentage;
        }

        public void setLocation(String location){
            this.location = location;
        }

        public String getLocation(){
            return this.location;
        }

        public void setPetrolType(String petrolType){
            this.petrolType = petrolType;
        }

        public String getPetrolType(){
            return this.petrolType;
        }

        public void setQuantity(int quantity){
            this.quantity = quantity;
        }
        public int getQuantity(){
            return this.quantity;
        }

        public void setPricePerLitre(double pricePerLiter){
            this.pricePerLitre = pricePerLitre;
        }
        public double getPricePerLitre(){
            return this.pricePerLitre;
        }

        public void setDiscountPercentage(double discountPercentage){
            this.discountPercentage = discountPercentage;
        }
        public double getDiscountPercentage(){
            return this.discountPercentage;
        }

    }

