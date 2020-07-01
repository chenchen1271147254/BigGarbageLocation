package com.rp.largegarbage.service;

import com.rp.largegarbage.entity.OrderGar;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

/**
 * @Description
 * @Author liulida <2979284403@qq.com>
 * @Version v1.0.0
 * @Since 1.0
 * @Date 2020/6/28 11:14
 */
public interface OrderGarService {

    /**
     * 发起人创建订单
     */
    public void initiatorCreateOrder(MultipartFile[] files, double lng, double lat, Integer rewardPoints, String desc, Integer initiator)throws Exception;


    /**
     * 移动端临时申请人创建订单
     */
    public void visitCreateOrder(MultipartFile[] files, double lng, double lat, Integer rewardPoints, String desc, Integer visitor)throws Exception;
    /**
     * 后台发起人审核确认订单
     */
    public void confirmOrder(Integer orderId,Integer initiator);
    /**
     * 后台调度人员指派订单
     */
    public void distributeOrder(Integer orderId, Integer dispatcher, Integer driver);
    /**
     * 移动端司机接单
     */
    public void takingOrder(Integer orderId,String carCode) ;
    /**
     * 移动端司机消单
     */
    public void completeOrder(Integer orderId,MultipartFile[] files, double lng, double lat,String desc,Integer driver) throws Exception;
    /**
     * 临时申请人/后台发起人取消订单
     */
    public void cancelOrder(Integer orderId);
    /**
     * 订单查询
     */
    public List<OrderGar> queryOrderGarList();


}
