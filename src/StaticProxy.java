/*
 * ��̬����ģʽ�ܽ᣺
 * ��ʵ����ʹ������Ҫʵ��ͬһ���ӿ�
 *������������ʵ��ɫ
 *
 *�ô���
 *�������������ܶ���ʵ���������˵�����
 *��ʵ����רע���Լ�������
 *
 */
public class StaticProxy {
	
	public static void main(String[] args) {
		WeddingCompany weddingCompany = new WeddingCompany(new You());
		weddingCompany.HappyMarry();
	}
}

interface Marry{
	void HappyMarry();
}

/*
 * ��ʵ��ɫ  ��ȥ���
 */
class You implements Marry{

	@Override
	public void HappyMarry() {
		System.out.println(" I will marry ,happy!!!!");
		
	}
}

//���칫˾����������
class WeddingCompany implements Marry{

	//����˭---����ʵĿ���ɫ
	private Marry tatget;
	
	public WeddingCompany(Marry tatget) {
		super();
		this.tatget = tatget;
	}

	@Override
	public void HappyMarry() {
		before();
		this.tatget.HappyMarry();//�������ʵ����
		after();
		
	}
	
	private void before() {
		System.out.println("���֮ǰ�������ֳ�");
	}
	
	private void after() {
		System.out.println("���֮����β��");
	}
}