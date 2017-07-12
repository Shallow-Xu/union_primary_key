package shallow.xu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shallow.xu.dao.OrderResporitity;
import shallow.xu.entity.OrderEntity;

import java.util.List;

/**
 * Created by Zhao.Xu on 2017/7/12.
 */
@Service
public class OrderService {

    @Autowired
    private OrderResporitity orderResporitity;

    public List<OrderEntity> getById(String id) {
        return orderResporitity.findAllById(id);
    }

}
