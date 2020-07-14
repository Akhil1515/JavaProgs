class SendDocument{
	{
		System.out.println("In SendDocument..");
	}
	public SendDocument() {
		System.out.println("Start to send document..");
	}
}

class EmailDocument extends SendDocument{
	static {
		System.out.println("In Email document..");
	}
	public EmailDocument(){
		System.out.println("Start to email document..");
	}
	
	{
		System.out.println("Email document is in progress..");
	}
	
	static {
		System.out.println("Email document is complete..");
	}
}
public class ProcessDocument extends EmailDocument{

	public static void main(String[] args) {
		System.out.println("Pre-process document before send");
		new ProcessDocument();
		System.out.println("Document has been processed and sent");

	}

}
