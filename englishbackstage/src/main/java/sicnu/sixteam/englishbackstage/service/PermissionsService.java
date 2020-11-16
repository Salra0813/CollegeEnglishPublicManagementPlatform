package sicnu.sixteam.englishbackstage.service;

import java.util.List;

public interface PermissionsService {

    List<String> getPermissionsByPhone(String phonenum);
}
