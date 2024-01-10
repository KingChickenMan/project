package org.example;

public class User {
    private String password;

    public void initPassword(PasswordGenerator passwordGenerator) {
        // as-is
//      RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();
        //만일 다른 패키지로 옮겼을 때 삭제하고, 결합을 끊을 수 있음. 더 낮은 결합을 가진 설계를 얻을 수 있었음.

        // to-be
        String password = passwordGenerator.generatePassword();
        /*
        비밀번호는 최소 8자 이상 12자 이하여야 한다.
         */
        if (password.length() >= 8 && password.length() <= 12) {
            this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }
}
