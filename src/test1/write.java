package test1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class write {

	public static void main(String[] args) throws IOException {

		File f = new File("D:\\bharath.text");
		f.createNewFile();
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("hello");
		bw.newLine();
		bw.write("srujuna tinnava ra");
		bw.newLine();
		bw.write("em ayindhi ra");
		bw.newLine();
		bw.write("nannu vadilestunnava");
		bw.newLine();
		bw.flush();
		bw.close();

	}

}
