package singleton.prototype;

public class DownloaderClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Downloader downloader1=Downloader.getInstance();
		Downloader downloader2=Downloader.getInstance();
		if(downloader1==downloader2)
		{
			System.out.println("same instance");
		}
	}

}
