package table.practice.table.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import table.practice.table.Model.User;

public interface IRepository extends JpaRepository<User,Long> {


}
