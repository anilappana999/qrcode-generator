package qrCodeGenerator;

import java.nio.file.FileSystems;
import java.nio.file.Path;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class App {

	private static void generateQRCodeImage(String text, int width, int height, String filePath) throws Exception
    {
QRCodeWriter qrCodeWriter = new QRCodeWriter();
BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height);

Path path = FileSystems.getDefault().getPath(filePath);
MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);
}

public static void main(String[] args) {
String	QR_CODE_IMAGE_PATH ="C:/Users/anils/Desktop/anil.png";
try {
   generateQRCodeImage("WELCOME TO LOVE TO LEARN", 350, 350,QR_CODE_IMAGE_PATH );
} catch (Exception e) {
   System.out.println("Could not generate QR Code, WriterException :: " + e.getMessage());
} 
}
	
}
