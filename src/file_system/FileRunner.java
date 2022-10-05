package file_system;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;
import java.util.logging.Logger;

public class FileRunner {
	private static final Logger log = Logger.getLogger(DateTimeRunner.class.getName());
	static Scanner sc = new Scanner(System.in);
	String getString(){
		log.info("Enter string:");
		String str = sc.nextLine();
		return str;
	}
	int getInt(){
		int num=0;
		log.info("Enter number of key -> value pairs: ");
		try{
		 num= sc.nextInt();
		 }catch(Exception e){
		 log.info("Invalid input");
		 }
		 sc.nextLine();
		return num;
	}
	String getStringLine(){
		log.info("Enter string:");
		String str = sc.nextLine();
		return str+"\n";
	}
	public void putValue(Properties prop,int n) {
		prop.put(getString(), getString());
	}
	public FileOutputStream file(String path) throws FileNotFoundException {
		return new FileOutputStream(new File(path));
	}
	public static void main(String[] args) throws IOException {
		String runAgain;
		do{
			log.info("Enter between 1 - 10 to execute the FIle Operation");
			try {
				FileRunner test = new FileRunner();
				Properties prop = new Properties();
				int n;
				int val = 0;
				int questionNumber= test.getInt();
				switch(questionNumber){
				case 1:
					//1. Store the values in the corresponding file
					FileOutputStream file1 = test.file("/home/inc12/git/repository4/tasks/src/file_system/sample.txt");
					file1.write(test.getStringLine().getBytes());
					file1.flush();
					file1.write(test.getStringLine().getBytes());
					file1.flush();
					file1.write(test.getString().getBytes());
					break;
				case 2:
					//2. Store the values in the corresponding file using Properties class
					FileOutputStream file2 = test.file("/home/inc12/git/repository4/tasks/src/file_system/myprops.txt"); // create new file if not exist
					n = test.getInt();
					while(val<n) {
						test.putValue(prop,n);
						val++;
					}
					prop.store(file2,"Values added");
					log.info("FIle updated");
					break;
				case 3:
					//3. Read value from file
					FileInputStream reader = new FileInputStream("/home/inc12/git/repository4/tasks/src/file_system/myprops.txt"); // crete new file if not exist
					prop.load(reader);
					prop.list(System.out);
					break;
				case 4:
					// creating a directory and repeat 1,2,3 task
					 File file = new File("/home/inc12/myDir");
					if (!file.exists()) {
			            if (file.mkdirs()) {
			                log.info("new folders created!");
			            }
			        }
			        FileOutputStream file3 = new FileOutputStream(new File("/home/inc12/myDir/sample.txt"));
					FileOutputStream file4 = new FileOutputStream(new File("/home/inc12/myDir/myprops.txt"));
					//1. Store the values in the corresponding file
					file3.write(test.getStringLine().getBytes());
					file3.flush();
					file3.write(test.getStringLine().getBytes());
					file3.flush();
					file3.write(test.getString().getBytes());
					//2. Store the values in the corresponding file using Properties class
					Properties prop2 = new Properties();
					n = test.getInt();
					while(val<n) {
					test.putValue(prop2,n);
					val++;
					}
					prop2.store(file4,"Values added");
					log.info("FIle updated");
					//3. Read value from file
					FileInputStream reader2 = new FileInputStream(new File("/home/inc12/myDir/myprops.txt")); // create new file if not exist
					prop2.load(reader2);
					prop2.list(System.out);
					break;
				case 5:
					Tester testObj =new Tester("Balaji");
					log.info(""+testObj);
					break;
				case 6:
					OpertationPojo pojoObj = new OpertationPojo("Balaji",21);
					log.info(""+pojoObj);
					break;
				case 7:
					OpertationPojo pojoObj2 = new OpertationPojo();
					log.info(""+pojoObj2);// default will be printed (null and 0)
					break;
				case 8:
					Rainbow colour1 =Rainbow.VIOLET;
					Rainbow colour2 =Rainbow.INDIGO;
					Rainbow colour3 =Rainbow.BLUE;
					Rainbow colour4 =Rainbow.GREEN;
					Rainbow colour5 =Rainbow.YELLOW;
					Rainbow colour6 =Rainbow.ORANGE;
					Rainbow colour7 =Rainbow.RED;
					log.info(colour1+" and its code "+colour1.code);
					log.info(colour2+" and its code "+colour2.code);
					log.info(colour3+" and its code "+colour3.code);
					log.info(colour4+" and its code "+colour4.code);
					log.info(colour5+" and its code "+colour5.code);
					log.info(colour6+" and its code "+colour6.code);
					log.info(colour7+" and its code "+colour7.code);
					log.info(""+java.util.Arrays.asList(Rainbow.values()));
					break;
				case 9:
					log.info("Singleton class object(Only one) is created");
					Singleton x = Singleton.getInstance();
//					Singleton y = Singleton.getInstance();
					log.info(""+x);
					break;
				default:
					log.info("value must be 1 - 9");
				}
			}catch(Exception e) {
				log.info(""+e);
			}
			log.info("do you want to exit Y/N");
			runAgain = sc.next();
		}while(runAgain.equalsIgnoreCase("n"));
		sc.close();
	}	
}
