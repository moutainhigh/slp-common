package com.ai.slp.common.api.area.interfaces;

import java.util.List;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.slp.common.api.area.param.GnAreaCondition;
import com.ai.slp.common.api.area.param.GnAreaVo;

/**
 * 公共域-小区管理类，主要功能包括新增，修改，删除小区.<br>
 * 小区指街道下的小区<br>
 * 其中查询包括树查询。 Date: 2016年5月30日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author gucl
 */
public interface IGnAreaMaintainSV {

    /**
     * 添加区域.
     * <p/>
     * 注意：<strong>areaLevel为必须指定为5</strong>
     * 
     * @param Area 待添加的小区的信息
     * @throws BusinessException,SystemException
     * @ApiDocMethod
     * @ApiCode GN_0120
     */
	String addArea(GnAreaVo Area) throws BusinessException,SystemException;

    /**
     * 修改小区.
     * <p/>
     * 注意：<strong>areaLevel为必须指定为5</strong><br>
     * @param Area  待修改的机构的信息
     * @throws BusinessException,SystemException
     * @ApiDocMethod
     * @ApiCode GN_0121
     */
    void modifyArea(GnAreaVo Area) throws BusinessException,SystemException;

    /**
     * 删除小区.
     * <p/>
     * 注意：<strong>删除时仅依据租户ID、areaCode和areaLevel，其他条件忽略</strong><br>
     *       <strong>areaLevel为必须指定为5</strong>
     * @param gnAreaCondition待删除的小区条件
     * @throws BusinessException,SystemException
     * @ApiDocMethod
     * @ApiCode GN_0122
     */
    void deleteArea(GnAreaCondition gnAreaCondition) throws BusinessException,SystemException;

    /**
     * 批量删除小区.
     * <p/>
     * 注意：<strong>删除时仅依据租户ID、areaCode和areaLevel，其他条件忽略</strong><br>
     *       <strong>areaLevel为必须指定为5</strong>
     * 
     * @param gnAreaCondition
     * @throws BusinessException,SystemException
     * @ApiDocMethod
     * @ApiCode GN_0123
     */
    void deleteAreas(List<GnAreaCondition> gnAreaCondition) throws BusinessException,SystemException;
}