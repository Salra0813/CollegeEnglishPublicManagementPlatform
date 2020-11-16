package sicnu.sixteam.englishbackstage.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface PermissionsMapper {

    List<String> getPermissionsByPhone(@Param("phonenum") String phonenum);
}
