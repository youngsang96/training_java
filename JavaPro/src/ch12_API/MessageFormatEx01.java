package ch12_API;
import java.text.MessageFormat;
public class MessageFormatEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tableName = "CUST_INFO";
		String msg = "INSERT INTO " + tableName +" VALUES(''{0}'',''{1}'',''{2}'',''{3}'');";
		Object[][] arguments = {
				{"���ڹ�","02-123-1234","27","07-09"},
				{"������","032-333-1234","33","10-07"}
		};
		for(int i=0; i<arguments.length; i++) {
			String result = MessageFormat.format(msg, arguments[i]);
			System.out.println(result);
		}
	}

}
