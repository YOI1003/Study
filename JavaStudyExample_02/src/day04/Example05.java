package day04;

interface IAdapter
{
	HDMI RGBtoHDMI(RGB rgb);
}
class HDMIConverter implements IAdapter
{

	@Override
	public HDMI RGBtoHDMI(RGB rgb) {
		// TODO Auto-generated method stub
		return new HDMI();
		//더 디테일하게 만들거면 rgb를 전달받은 만큼
		//HDMI에서 rgb의 정보를 받아 생성하도록 HDMI의 생성자를
		//수정해주면 더 완벽하다.
	}
	
}
class HDMI
{
	int[] images;
	
	int[] getImages()
	{
		return images;
	}
	
	public void setImage(int [] images) {
		this.images = images;
	}
	
}
class RGB
{
	int[] images;
	//alt + shift + s + r: 필드 값을 이용해 getter, setter를 만드는 기능

	public int[] getImages() {
		return images;
	}

	public void setImages(int[] images) {
		this.images = images;
	}
	
	//getter: get필드명으로 구성된 이 메소드는 필드를 return하는 기능을 가짐.
	//setter: set필드명으로 구성된 이 메소드는 전달한 값으로 필드를 수정하는 기능을 가짐
	
}


public class Example05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
