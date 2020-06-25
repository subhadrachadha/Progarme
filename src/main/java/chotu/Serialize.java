package chotu;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialize {
	public static void main(String[] args) {
		byte[][] packet=new Serialize().serialize("//home//subhadra.singh//eclipse-workspace-new//Program//src//main//java//resources//cache.png");
		new Serialize().deserialize(packet);
	}
	public byte[][] serialize(String filename)
    {
 
        StringBuilder contents = new StringBuilder();
        byte[][] packet = null;
 
        try {
            File f = new File("//home//subhadra.singh//eclipse-workspace-new//Program//src//main//java//resources//cache.png");
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bout);
            oos.writeObject(f);
            oos.flush();
            oos.close();
 
            // read 
 
            try {
 
//              BufferedReader input =  new BufferedReader(new FileReader(f));
                BufferedInputStream bStream = new BufferedInputStream( new FileInputStream(f));
 
                try {
                    String line = null; //not declared within while loop
                     
                    int bit = 0;
 
                    while (( bit = bStream.read()) != -1){
                        contents.append((char)bit);
//                      contents.append(System.getProperty("line.separator"));
                    }
                }
                finally {
                    bStream.close();
                }
            }
            catch (IOException ex){
                ex.printStackTrace();
            }
 
 
            // end of read
            byte[] obj = bout.toByteArray();
            byte[] content = contents.toString().getBytes(); 
 
            System.out.println("File Object size: "+obj.length);
            System.out.println("File Content Size: "+content.length);
 
 
            packet = new byte[][]{obj, content};
 
 
        }
        catch(Exception e) {
            System.out.println("Exception during serialization: " + e);
            System.exit(0);
        }
 
        return packet;
 
    }
	
	public void deserialize(byte[][] packet)
    {
        try {
 
 
            ByteArrayInputStream bin = new ByteArrayInputStream(packet[0]);
 
            ObjectInputStream ois = new ObjectInputStream(bin);
            File newFile = (File)ois.readObject();
            ois.close();
 
            // write
            FileOutputStream fos = new FileOutputStream("//home//subhadra.singh//eclipse-workspace-new//Program//src//main//java//resources//recovereduser.png");
 
            System.out.println(" Recover content length: "+packet[1].length);
             
            fos.write(packet[1]);
            fos.flush();
            fos.close();
 
 
        }
        catch(Exception e) {
            System.out.println("Exception during deserialization: " +
                    e);
            System.exit(0);
        } 
    }
}
