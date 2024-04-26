package Module_12;

class EncapTest{
    private String name;
    private String idNum;
    private int age;
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getIdNum(){
        return idNum;
    }
    public void setage(int newage){
        age = newage;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setIdNum(String newId){
        idNum = newId;
    }
}

public class M121 {

    public static void main(String[] args) {
        EncapTest encap = new EncapTest();
        encap.setName("Mohsin");
        encap.setIdNum("COSC231101024");
        encap.setage(19);
        System.out.println("Name : "+encap.getName());
        System.out.println("ID Number : "+encap.getIdNum());
        System.out.println("Age : "+encap.getAge());
    }
}