package com.inventariosecretaria.util;

import java.awt.Color;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.inventariosecretaria.entity.AsignacionEquipo;
import com.lowagie.text.Document;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

@Component("/views/cargoequipo/cargo")
public class ListarEquipo extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		@SuppressWarnings("unchecked")
		List<AsignacionEquipo> listadocedula = (List<AsignacionEquipo>) model.get("listadocedula");
		
		document.open();
		
		
		PdfPTable tablaTitulo = new PdfPTable(1);
		PdfPCell celda = null;
		
		
		celda = new PdfPCell(new Phrase("Listado de Equipos a Cargo"));
		celda.setBorder(0);
		celda.setBackgroundColor(new Color(40,190,38));
		
		tablaTitulo.addCell(celda);
		tablaTitulo.setSpacingAfter(30);
		
	
		
		PdfPTable tablaVista = new PdfPTable(3);
		listadocedula.forEach(vista ->{
			
			tablaVista.addCell(vista.getIdequipo().getNombreequipo());
			tablaVista.addCell(vista.getIdequipo().getSerie());
			tablaVista.addCell(vista.getIdequipo().getModelo());
			
		});
		
		document.add(tablaTitulo);
		document.add(tablaVista);
	}

	
	
	
}
