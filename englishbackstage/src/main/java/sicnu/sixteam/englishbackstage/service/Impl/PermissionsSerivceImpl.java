package sicnu.sixteam.englishbackstage.service.Impl;

import org.springframework.stereotype.Service;
import sicnu.sixteam.englishbackstage.mapper.PermissionsMapper;
import sicnu.sixteam.englishbackstage.mapper.UserMapper;
import sicnu.sixteam.englishbackstage.model.Permissions;
import sicnu.sixteam.englishbackstage.service.PermissionsService;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "PermissionsSerivce")
public class PermissionsSerivceImpl implements PermissionsService {

    @Resource
    PermissionsMapper permissionsMapper;

    @Override
    public List<String> getPermissionsByPhone(String phonenum) {
        return permissionsMapper.getPermissionsByPhone(phonenum);
    }
}
