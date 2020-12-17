package com.cdsi.backend.inve.models.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import com.cdsi.backend.inve.dto.StockLibroDTO;

public interface IArticuloStockService {

	// PAGINACION DE ARTICULOS CON SU PRECIO Y STOCK
	// Page<StockLibroDTO> pagArtiPrecStock(Pageable pageable,String cia,String
	// cat);

	Page<StockLibroDTO> pagArtiFind(Pageable pageable, String cia, String cat, String lin, String sub, String fam, String pre, String alm);

	Page<StockLibroDTO> pagArtiFindCatalogo(Pageable pageable, String cia, String cat, String alm,String pre);
	
	Page<StockLibroDTO> pagArtiFindLinea(Pageable pageable, String cia, String cat, String lin, String alm,String pre);

	Page<StockLibroDTO> pagArtiFindSubLinea(Pageable pageable, String cia, String cat, String lin, String sub, String alm,String pre);
}
