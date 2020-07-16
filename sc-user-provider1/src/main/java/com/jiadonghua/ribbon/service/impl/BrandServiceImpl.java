package com.jiadonghua.ribbon.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jiadonghua.ribbon.mapper.BrandMapper;
import com.jiadonghua.ribbon.service.IBrandService;
import com.jiadonghua.user.entity.Brand;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jiadonghua
 * @since 2020-07-16
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements IBrandService {

}
