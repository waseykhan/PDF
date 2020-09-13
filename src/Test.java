import java.io.File;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.apache.pdfbox.text.PDFTextStripper;

public class Test {

	public static void main(String[] args) throws IOException {
		//PDDocument pdf1 = new PDDocument();
		//File f = new File("C:\\PDFexample\\newDoc2.pdf");
		//adds 5 new pages to the pdf
//			pdf1.addPage(new PDPage());
//			pdf1.save("C:\\PDFexample\\newDoc3.pdf");
//			pdf1.close();
			PDDocument load = PDDocument.load(new File("C:\\PDFexample\\newDoc3.pdf"));
			//get the page you need to add the content to
			PDPage page = load.getPage(1);
			//load.addPage(new PDPage());
			System.out.println("Document loaded");
			//to retrieve text from the document
			//PDFTextStripper strip = new PDFTextStripper();
			//System.out.println(strip.getText(load));
			//load the image from the file
			PDImageXObject image = PDImageXObject.createFromFile("C:\\Users\\Abdul Wasey\\Desktop\\AWK\\pic.png", load);
			//the content stream adds the content to the page loaded and the page the data must be assigned to
			PDPageContentStream ppc = new PDPageContentStream(load, page);
			ppc.drawImage(image, 1, 2);
			//start the stream
			//ppc.beginText();
			//ppc.setFont(PDType1Font.TIMES_BOLD, 15);
			//scales the text
			//ppc.setLeading(14.5f);
			//set the content stream or delimeters
			//ppc.newLineAtOffset(25, 700);
			//type the text
			//String text = "First text for the first pdf";
			//ppc.setFont(PDType1Font.HELVETICA_BOLD, 15);
			//String text2 = "This is the third line for testing purposes";
			//show the text
			//ppc.showText(text);
			//ppc.newLine();
			//ppc.showText(text2);
			//ppc.endText();
			//close the stream
			ppc.close();
			System.out.println("Content added");
			//needed to modify the pdf editorial
			//PDDocumentInformation info = load.getDocumentInformation();
		//	System.out.println(load.getNumberOfPages());
//			for(int i = 0; i < 5; i++) {
//				PDPage newPgae = new PDPage();
//				 load.addPage(newPgae);
//				}
//			load.removePage(10);
//			load.removePage(9);
			//System.out.println("Pages removed");
//			info.setAuthor("Abdul Wasey Khan");
//			info.setTitle("First PDF manipulation");
//			Calendar c = new GregorianCalendar();
//			c.set(2020, 8, 13);
//			info.setCreationDate(c);
//			info.setModificationDate(c);
//			info.setKeywords("Helps in searching");
//			System.out.println(info.getAuthor() + " " + info.getModificationDate());
			//System.out.println(load.getNumberOfPages());
			//always add a save statement
			load.save(new File("C:\\PDFexample\\newDoc3.pdf"));
			load.close();
		
		
	}

}
