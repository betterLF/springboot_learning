package springboot.springboot_data_mybatis.bean;

/**
 * @author lifei
 * @date 2020/11/29 9:27
 */
public class Employee {
        private Integer eid;

        private String ename;

        private Integer age;

        private String sex;

        private Integer did;

        public Employee(Integer eid, String ename, Integer age, String sex, Integer did) {
            this.eid = eid;
            this.ename = ename;
            this.age = age;
            this.sex = sex;
            this.did = did;
        }

        public Employee() {
            super();
        }

        public Integer getEid() {
            return eid;
        }

        public void setEid(Integer eid) {
            this.eid = eid;
        }

        public String getEname() {
            return ename;
        }

        public void setEname(String ename) {
            this.ename = ename == null ? null : ename.trim();
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex == null ? null : sex.trim();
        }

        public Integer getDid() {
            return did;
        }

        public void setDid(Integer did) {
            this.did = did;
        }

        @Override
        public String toString() {
            return "employee{" +
                    "eid=" + eid +
                    ", ename='" + ename + '\'' +
                    ", age=" + age +
                    ", sex='" + sex + '\'' +
                    ", did=" + did +
                    '}';
        }
    }

