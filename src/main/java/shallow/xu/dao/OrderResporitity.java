package shallow.xu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import shallow.xu.entity.OrderEntity;

import java.util.List;

/**
 * Created by Zhao.Xu on 2017/7/12.
 */
public interface OrderResporitity extends JpaRepository<OrderEntity, Long> {
    List<OrderEntity> findAllById(String id);
}
