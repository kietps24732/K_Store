package ASM.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ASM.entity.Category;

public interface CategoryDAO extends JpaRepository<Category, String>{

}
