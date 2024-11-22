package es.iessoterohernandez.daw.endes.HelloWorldPdf;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
/**
 * Hello world!
 */
public class HelloWolrdPdf {
    public static void main(String[] args) {
    	try {
            // Crear un escritor PDF y un documento
            PdfWriter writer = new PdfWriter("HolaMundo.pdf");
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf);

            // Agregar un párrafo con el texto "Hola Mundo"
            document.add(new Paragraph("Hola Mundo"));

            // Cerrar el documento
            document.close();
            
            System.out.println("PDF creado exitosamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
