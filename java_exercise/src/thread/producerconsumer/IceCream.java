package thread.producerconsumer;

public class IceCream {
    private int id;
    private String flavor;
    public IceCream(int id,String flavor){
        this.id=id;
        this.flavor=flavor;
    }
    //重写toString
    public String toSteing(){
        return "冰淇淋#"+id+"("+flavor+"味)";
    }
}
