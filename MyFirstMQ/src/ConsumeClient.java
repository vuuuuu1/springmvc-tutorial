
public class ConsumeClient {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		 MqClient client = new MqClient();
		 String message = client.consume();
		 System.out.println("��ȡ����ϢΪ�� "+message);
	}

}
