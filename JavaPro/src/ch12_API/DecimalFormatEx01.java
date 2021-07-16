package ch12_API;
import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormatEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df1 = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("000,000");
		try {
			Number num = df1.parse("1,234.56");
			double d = num.doubleValue();
			System.out.println(d + " -> "+ df1.format(num));
			System.out.println(d + " -> "+ df2.format(num));
		}catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
