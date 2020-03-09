import java.util.ArrayList;
public class Method{
    public void method() throws ClassCastException{
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("Hola mundo");
        myList.add(48);
        myList.add("Adios mundo");
        for(int i = 0; i < myList.size(); i++) {
            try{
                Integer castedValue = (Integer) myList.get(i);
                System.out.println(castedValue);
            } catch(ClassCastException e){
                System.out.println("El elemento "+i+" del ArrayList 'myList' no puede ser convertido a Integer");    
            }
        }
    }
}