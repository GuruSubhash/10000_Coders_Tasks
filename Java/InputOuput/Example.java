import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example {
    public static void main(String[] args) throws IOException {
        String location = "D:\\10000_Coders_Tasks\\Java\\InputOuput\\old.text";
        File file= new File(location);
        String name="Guru Subhash";
        StringBuilder collectedData=new StringBuilder("");
        if(file.exists()){
            FileOutputStream fos = new FileOutputStream(location);
            fos.write(name.getBytes());
            FileInputStream fis=new FileInputStream(location);
            while(true){
                int i=fis.read();
                if(i==-1) break;
                collectedData.append((char)i);
            }
        }
        String location2="D:\\10000_Coders_Tasks\\Java\\InputOuput\\new.txt";
        File f2= new File(location2);
        if(f2.exists()){
            FileOutputStream fos2 = new FileOutputStream(location2);
            fos2.write((String)collectedData.getBytes());
            FileInputStream fis2=new FileInputStream(location2);
            while(true){
                int i=fis2.read();
                if(i==-1) break;
                System.out.print((char)i);
            }
        }
    }
}
