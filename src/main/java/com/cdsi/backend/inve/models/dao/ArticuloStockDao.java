package com.cdsi.backend.inve.models.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.dto.StockLibroDTO;
import com.cdsi.backend.inve.models.entity.IdArticulo;

@Repository
public interface ArticuloStockDao extends PagingAndSortingRepository<StockLibroDTO, IdArticulo> {

	// METODO QUE NOS DEVUELVE EL ARTICULO CON SU PRECIO,STOCK Y COMPROMISO
	// Page<StockLibroDTO> pagArtiPreStock(Pageable pageable,@Param("cia") String
	// cia, @Param("cat") String cat);

	Page<StockLibroDTO> findPagByCiaAndCatalogoAndLineaAndSubLineaAndFamAndAlmacenAndTipo(Pageable pageable,
			@Param("cia") String cia, @Param("cat") String cat, @Param("lin") String lin, @Param("sub") String sub,
			@Param("fam") String fam, @Param("pre") String pre, @Param("alm") String alm);

	Page<StockLibroDTO> findPagByCiaAndCatalogoAndLineaAndAlmacenAndTipo(Pageable pageable, @Param("cia") String cia,
			@Param("cat") String cat, @Param("lin") String lin, @Param("pre") String pre, @Param("alm") String alm);

	Page<StockLibroDTO> findPagByCiaAndCatalogoAndLineaAndSubLineaAndAlmacenAndTipo(Pageable pageable,@Param("cia") String cia,@Param("cat") String cat,
			@Param("lin") String lin,@Param("sub") String sub, @Param("pre") String pre, @Param("alm") String alm);


}
