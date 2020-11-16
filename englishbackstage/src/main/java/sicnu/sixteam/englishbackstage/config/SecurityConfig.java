package sicnu.sixteam.englishbackstage.config;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import sicnu.sixteam.englishbackstage.model.User;
import sicnu.sixteam.englishbackstage.service.MyPasswordEncoder;
import sicnu.sixteam.englishbackstage.service.UserService;


/**
 * 参考网址：
 * https://blog.csdn.net/XlxfyzsFdblj/article/details/82083443
 * https://blog.csdn.net/lizc_lizc/article/details/84059004
 * https://blog.csdn.net/XlxfyzsFdblj/article/details/82084183
 * https://blog.csdn.net/weixin_36451151/article/details/83868891
 * 查找了很多文件，有用的还有有的，感谢他们的辛勤付出
 * Security配置文件，项目启动时就加载了
 * @author 程就人生
 *
 */
@Configuration
@EnableWebSecurity() //debug = true
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    // 配置数据源,注意,这里必须使用Resource标签,不能使用Autowired
    @Resource
    private DataSource dataSource;
    @Resource
    private UserService userService;

    // 配置websecurity的一些配置,一般用的不多
    @Override
    public void configure(WebSecurity web) throws Exception {
//        web.ignoring().antMatchers("/static/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable();
        http
                .authorizeRequests()
                .antMatchers("/static/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
//                .loginProcessingUrl("/login")
//                .loginPage("/aboysky/my")
                .successForwardUrl("/aboysky/index")
                // 将自定义的successHandle注入进security框架中运行
//                .successHandler(new LoginSuccessHandle())
                .permitAll()
                .and()
                .logout()
                .permitAll()
                .and()
                .exceptionHandling().accessDeniedPage("/basic/error403");

    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                // 配置userDetailService,其实可以从UserDetail开始就继承,然后从UserDetails使用
                .userDetailsService(userService);
//                .and()
//                .jdbcAuthentication().dataSource(dataSource).authoritiesByUsernameQuery("SELECT user_name,role_name FROM user_role JOIN USER USING (uid) JOIN role USING (rid) WHERE user_name= ?")
//                .usersByUsernameQuery("select user_name,password,status from user where user_name= ?");
//                .and()
//                .inMemoryAuthentication()
//                    .withUser("123").password("USER").roles("USER").and()
//                    .withUser("ENGINEER").password("123").roles("USER","ENGINEER").and()
//                    .withUser("ADMIN").password("123").roles("ADMIN","USER")
//                    .and().withUser("KEFU").password("123").roles("USER","KEFU");

    }


}