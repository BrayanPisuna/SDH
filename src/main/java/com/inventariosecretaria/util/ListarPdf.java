package com.inventariosecretaria.util;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.inventariosecretaria.entity.AsignacionPeriferico;
import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

@Component("/views/cargo/Cargoequipos")
public class ListarPdf extends AbstractPdfView{

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		@SuppressWarnings("unchecked")
		List<AsignacionPeriferico> listadocedula = (List<AsignacionPeriferico>) model.get("listadocedula");
		
		
		PdfPTable tablaVista = new PdfPTable(3);
		
		listadocedula.forEach(vista ->{
			
			tablaVista.addCell(vista.getIdperiferico().getSerie());
			tablaVista.addCell(vista.getIdperiferico().getNombreperiferico());
			tablaVista.addCell(vista.getIdperiferico().getModelo());
			
		});
		
		document.add(tablaVista);
		
	}

}
