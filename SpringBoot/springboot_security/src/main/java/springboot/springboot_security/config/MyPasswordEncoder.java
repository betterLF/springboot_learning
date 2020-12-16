package springboot.springboot_security.config;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author lifei
 * @date 2020/12/3 7:35
 */
public class MyPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return s.equals(charSequence.toString());
    }
}
