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
	
	@Override
	public Page<StockLibroDTO> pagArtiPrecStock(Pageable pageable, String cia, String cat) {
		return artiDao.pagArtiPreStock(pageable, cia, cat);
	}
}
