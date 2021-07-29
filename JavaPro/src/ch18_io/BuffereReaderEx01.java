package ch18_io;
import java.io.*;

/*
 * ���� ��Ʈ�� : �ٸ� ��Ʈ���� �̿��Ͽ� ���ο� ��� �߰��ϴ� ����� ���� ��Ʈ��
 *            ��ü ������ �ٸ� ��Ʈ���� �Ű������� �Է¹޴´�.
 *  BufferedReader : ���۸� ������ �߰��Ͽ� IO ���� ����Ű�� ��Ʈ��.
 *  => readLine() �޼��带 �̿��Ͽ� ���پ� ���� �� �ִ� ��� �߰�.
 *  new BufferedReader(Reader) ��ü ���� ����
 *  
 *  Ű���忡�� ���پ� �о ȭ�鿡 ����ϰ�, buffered.txt ���Ͽ��� �����ϱ�. 
 */

public class BuffereReaderEx01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		FileWriter fw = new FileWriter("buffered.txt");
		String data = null;
		while((data = br.readLine()) != null) {
			System.out.println(data);
			fw.write(data+"\n");
		}
		fw.flush();
		fw.close();
	}

}
