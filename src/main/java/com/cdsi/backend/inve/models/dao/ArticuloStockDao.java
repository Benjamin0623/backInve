package com.cdsi.backend.inve.models.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.dto.StockLibroDTO;
import com.cdsi.backend.inve.models.entity.IdArticulo;

@Repository
public interface ArticuloStockDao extends PagingAndSortingRepository<StockLibroDTO, IdArticulo> {

	//METODO QUE NOS DEVUELVE EL ARTICULO CON SU PRECIO,STOCK Y COMPROMISO
		@Query(value = "SELECT * FROM INVE.ARINDA1_VIEW WHERE NO_CIA = :cia AND TIPO_ARTI = :cat AND 0 < Inve.F_Saldo_Articulo(:cia, '1L001', NO_ARTI, SysDate) AND VIGENTE='S'",
			   countQuery = "SELECT count(*) FROM INVE.ARINDA1_VIEW WHERE NO_CIA = :cia AND TIPO_ARTI = :cat AND 0 < Inve.F_Saldo_Articulo(:cia, '1L001', NO_ARTI, SysDate) AND VIGENTE='S'",
			   nativeQuery = true)
		Page<StockLibroDTO> pagArtiPreStock(Pageable pageable,@Param("cia") String cia, @Param("cat") String cat);
		
}
