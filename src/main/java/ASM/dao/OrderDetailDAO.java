package ASM.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ASM.entity.OrderDetail;

public interface OrderDetailDAO extends JpaRepository<OrderDetail, Long>{

}
