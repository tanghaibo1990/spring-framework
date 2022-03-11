package test;

public class YoungMan {
	private BeautifulGirl beautifulGirl;

	YoungMan(){

		// 可能你比较牛逼，指腹为婚

		// beautifulGirl = new BeautifulGirl();

	}

	public void setBeautifulGirl(BeautifulGirl beautifulGirl) {

		this.beautifulGirl = beautifulGirl;

	}

	public static void main(String[] args){

		YoungMan you = new YoungMan();

		BeautifulGirl beautifulGirl = new BeautifulGirl();

		beautifulGirl.setEat("各种投其所好");

		// 然后你有女票了

		you.setBeautifulGirl(beautifulGirl);

	}
}
