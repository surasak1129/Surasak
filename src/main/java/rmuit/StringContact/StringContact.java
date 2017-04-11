package rmuit.StringContact;

public class StringContact {
	public void stringContact(String[] str) {
		String strContact = "";
		for (int i = 0; i < 5; i++) {
			strContact = strContact + str[i];
		}
		System.out.print(strContact);
	}

	public static void main(String[] args) {
		StringContact s = new StringContact();
		String[] str = new String[5];
		str[0] = "A";
		str[1] = "B";
		str[2] = "C";
		str[3] = "D";
		str[4] = "E";
		s.stringContact(str);
	}

}
