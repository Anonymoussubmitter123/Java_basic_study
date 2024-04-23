public class User {
    private String name;
    private int id;
    private String passWord;
    private String path;
    private int[] data;

    public User() {
    }

    public User(String name, int id, String passWord, String path, int[] data) {
        this.name = name;
        this.id = id;
        this.passWord = passWord;
        this.path = path;
        this.data = data;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     *
     * @return passWord
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * 设置
     *
     * @param passWord
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    /**
     * 获取
     *
     * @return path
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置
     *
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取
     *
     * @return data
     */
    public int[] getData() {
        return data;
    }

    /**
     * 设置
     *
     * @param data
     */
    public void setData(int[] data) {
        this.data = data;
    }

    public String toString() {
        return "User{name = " + name + ", id = " + id + ", passWord = " + passWord + ", path = " + path + ", data = " + data + "}";
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
