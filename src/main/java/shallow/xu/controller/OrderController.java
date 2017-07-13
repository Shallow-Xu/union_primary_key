package shallow.xu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import shallow.xu.entity.OrderEntity;
import shallow.xu.service.OrderService;

import java.util.List;

/**
 * Created by Shallow Xu on 2017/7/12.
 */
@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/get/{id}")
    @ResponseBody
    public List<OrderEntity> getOrder(@PathVariable("id") String id) {
        return orderService.getById(id);
    }
}
