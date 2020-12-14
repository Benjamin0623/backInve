package com.cdsi.backend.inve.models.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.cdsi.backend.inve.dto.StockLibroDTO;

public interface IArticuloStockService {

    // PAGINACION DE ARTICULOS CON SU PRECIO Y STOCK
    Page<StockLibroDTO> pagArtiPrecStock(Pageable pageable,String cia,String cat);
}
