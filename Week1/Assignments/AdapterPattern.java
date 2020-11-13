/* CoffeeMachineInterface
*/
package Week1.Assignments;

interface CoffeeMachineInterface {

    void chooseFirstSelection();
    
    void chooseSecondSelection();
    
}
/* OldCoffeeMachine */
class OldCoffeeMachine {

    void selectA(){
    System.out.println("YOu have selected OptionA");
    }
    void selectB(){
    System.out.println("YOu have selected OptionB");
    }
    
    
}
/* CoffeeTouchScreenAdapter */
class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
    private OldCoffeeMachine OldVendingMachine;
    
    CoffeeTouchscreenAdapter(OldCoffeeMachine oldmachine){
        this.OldVendingMachine = oldmachine;
    }
    
    public void chooseFirstSelection() {
        OldVendingMachine.selectA();
    }
    
    public void chooseSecondSelection() {
        OldVendingMachine.selectB();
    }
}