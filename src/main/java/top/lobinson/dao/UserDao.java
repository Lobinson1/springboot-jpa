package top.lobinson.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import top.lobinson.entity.User;
import top.lobinson.entity.UserOrg;

import java.util.List;

/**
 * @author Lobin
 * @date 2020/4/28
 */
@RepositoryRestResource(path = "user")
public interface UserDao extends JpaRepository<User, Integer>, JpaSpecificationExecutor<User> {

	List<User> findAllByAgeBetween(int from, int to);

	@Query(value = "select u.* from t_user u, t_organization o, t_user_org uo where u.id = uo.user_id and o.id = uo.org_id and o.id = ?1", nativeQuery = true)
	List<User> findByOrgId(int orgId);

	Page<User> findAllByIdBefore(Integer before, Pageable pageable);

	@Query(value = "select u.user_name as userName, o.org_name as orgName from t_user u, t_organization o, t_user_org uo where u.id = uo.user_id and o.id = uo.org_id", nativeQuery = true)
	List<UserOrg> getUserOrg();

}
