package com.sunlei.schoolshop.Dao;

import com.sunlei.schoolshop.Entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 孙磊
 * 商品Dao类
 */
@Transactional
public interface GoodsDao extends JpaRepository<Goods,Integer> {
}
