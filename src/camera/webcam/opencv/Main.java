package camera.webcam.opencv;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.videoio.VideoCapture;

public class Main {

	static {	
		System.out.println(System.getProperty("java.library.path"));
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
//		System.loadLibrary("opencv_java430");
	}

	public static void main(String[] args) {
		
		// Register the default camera
		VideoCapture cap = new VideoCapture();
		cap.open(0);

		// Check if video capturing is enabled
		if (!cap.isOpened()) {
			System.exit(-1);
		}

		// Matrix for storing image
		Mat image = new Mat();
		// Frame for displaying image
		MyFrame frame = new MyFrame();
		frame.setVisible(true);

		// Main loop
		while (true) {
			// Read current camera frame into matrix
			cap.read(image);
			// Render frame if the camera is still acquiring images
			if (image != null) {
				frame.render(image);
			} else {
				System.out.println("No captured frame -- camera disconnected");
				break;
			}
		}

	}
}