package sicnu.sixteam.englishbackstage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/aboysky")
public class BasicSimpleController {
//    @Autowired
//    private RoleService roleService;
//    @Autowired
//    private PermissionRepos permissionRepos;

    @RequestMapping("/error")
    public String error_page(){
        return "error";
    }

    @ResponseBody
    @RequestMapping("/index")
    public String index(){
        return "indexTest";
    }

    @PreAuthorize("hasAnyAuthority('USER_PAGE')")
    @ResponseBody
    @RequestMapping("/userIndex")
    public String userIndex(){
        return "userIndexTest";
    }

    @ResponseBody
    @PreAuthorize("hasAnyAuthority('KEFU_PAGE')")
    @RequestMapping("/kefuIndex")
    public String kefuIndex(){
        return "kefuIndexTest";
    }

    @ResponseBody
    @PreAuthorize("hasAnyAuthority('ADMIN_PAGE')")
    @RequestMapping("/adminIndex")
    public String adminIndex(){
        return "adminIndex";
    }

    @ResponseBody
    @PreAuthorize("hasAnyAuthority('ENGINEER_PAGE')")
    @RequestMapping("/engineerIndex")
    public String engineerIndex(){
        return "engineerIndex";
    }

    @ResponseBody
    @RequestMapping("/index1")
    public String index1_page(){
        return "index1";
    }

    @ResponseBody
    @PreAuthorize("permitAll()")
    @RequestMapping("/my")
    public String login1_page(){
        return "login1";
    }

    @ResponseBody
    @PreAuthorize("permitAll()")
    @RequestMapping("/error403")
    public String erroe403(){
        return "error403";
    }


//    @PreAuthorize("hasAnyAuthority('MANAGE_GROUPS')")
//    @RequestMapping("/fileTree")
//    public String fileTree(){
//        return "fileTree";
//    }

//    // 查询table
//    @PreAuthorize("hasAnyAuthority('ADMIN_PAGE')")
//    @RequestMapping("/queryTable")
//    public String queryTable(){
//        return "queryTable";
//    }

    @ResponseBody
    @PreAuthorize("hasAnyAuthority('DEAL_FORM')")
    @RequestMapping("/select-forms")
    public String select_forms(){
        return "kefuSelectForms";
    }

    @ResponseBody
    @PreAuthorize("hasAnyAuthority('SUBMIT_ORDER')")
    @RequestMapping("/submit-forms")
    public String submit_forms(){
        return "kefuSubmitForms";
    }

    @ResponseBody
    @PreAuthorize("hasAnyAuthority('SELECT_ORDER')")
    @RequestMapping("/select-order")
    public String select_order(){
        return "engineerSelectOrder";
    }

    @ResponseBody
    @PreAuthorize("hasAnyAuthority('DEAL_ORDER')")
    @RequestMapping("/deal-order")
    public String engineerDealOrder(){
        return "engineerDealOrder";
    }
}

