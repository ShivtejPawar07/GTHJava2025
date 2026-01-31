import java.io.*;
class DLAApp{
	public static void main(String[]x){
		File f=new File("D:\\Om");
		File list[]=f.listFiles();
		for(File f1:list){
			/*if(f1.isDirectory()){
				System.out.println(f1);
				
			}*/
			System.out.println(f1);
		}

	}
}