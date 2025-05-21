import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImgVidAud {
    public static void main(String[] args) throws IOException {
        File f= new File("D:\\10000_Coders_Tasks\\Java\\InputOuput\\output.jpeg");
        FileInputStream fis= new FileInputStream("D:\\10000_Coders_Tasks\\Java\\InputOuput\\hero_270x270.jpeg");
        if(f.exists()){
            FileOutputStream fos= new FileOutputStream(f);
            int i=0;
            while ((i=fis.read()) !=-1 ) {
                fos.write(i);
            }
        }
    }
}
