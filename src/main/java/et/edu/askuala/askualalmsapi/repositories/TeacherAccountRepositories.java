package et.edu.askuala.askualalmsapi.repositories;

import et.edu.askuala.askualalmsapi.domains.TeacherAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherAccountRepositories  extends CrudRepository <TeacherAccount,Long > {
}
