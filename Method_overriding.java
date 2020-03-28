 class vechile {
     public void speedofvechile() {
         System.out.println("The vechile speed is too slow!");
     }
 }
 //This is sub class of vechile class 
class car extends vechile{
    public void speedofvechile(){
        super.speedofvechile();//it won't overide the parent class
        System.out.println("That car speed is 60Km/h now");
    }
}
//This is the main class to get the out put
class main{
    public static void main(String[] args) {
        car obj1=new car();//create an object to get the details from car class
        obj1.speedofvechile();//call the method to perform
    }
}
