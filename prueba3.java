import java.io.*;
public class prueba3{
    public static void main(String[] args){
        try{
            FileWriter fw=new FileWriter("prueba.txt");
            fw.write("funciona");
            fw.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
