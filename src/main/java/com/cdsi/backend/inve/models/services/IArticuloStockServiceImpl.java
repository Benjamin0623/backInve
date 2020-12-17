package com.cdsi.backend.inve.models.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.dto.StockLibroDTO;
import com.cdsi.backend.inve.models.dao.ArticuloStockDao;
import com.cdsi.backend.inve.models.dao.IArticuloDao;

@Service
public class IArticuloStockServiceImpl implements IArticuloStockService{

	@Autowired
	private ArticuloStockDao artiDao;
	private final Logger log = LoggerFactory.getLogger(ArticuloServiceImpl.class);
	
	/*@Override
	public Page<StockLibroDTO> pagArtiPrecStock(Pageable pageable, String cia, String cat) {
		return artiDao.pagArtiPreStock(pageable, cia, cat);
	}*/

	@Override
	public Page<StockLibroDTO> pagArtiFind(Pageable pageable,String cia, String cat, String lin, String sub, String fam, String alm, String pre) {
		
		return artiDao.findPagByCiaAndCatalogoAndLineaAndSubLineaAndFamAndAlmacenAndTipo(pageable, cia, cat, lin, sub, fam, alm, pre);
	}

	@Override
	public Page<StockLibroDTO> pagArtiFindLinea(Pageable pageable, String cia, String cat, String lin, String alm, String pre) {
		// TODO Auto-generated method stub
		return artiDao.findPagByCiaAndCatalogoAndLineaAndAlmacenAndTipo(pageable, cia, cat, lin, alm, pre);
	}

	@Override
	public Page<StockLibroDTO> pagArtiFindSubLinea(Pageable pageable, String cia, String cat, String lin, String sub,
			String alm, String pre) {
		// TODO Auto-generated method stub
		return artiDao.findPagByCiaAndCatalogoAndLineaAndSubLineaAndAlmacenAndTipo(pageable, cia, cat, lin, sub, alm, pre);
	}

	@Override
	public Page<StockLibroDTO> pagArtiFindCatalogo(Pageable pageable, String cia, String cat, String alm, String pre) {
		// TODO Auto-generated method stub
		return artiDao.findPagByCiaAndCatalogoAndAlmacenAndTipo(pageable, cia, cat, alm, pre);
	}

	

}
