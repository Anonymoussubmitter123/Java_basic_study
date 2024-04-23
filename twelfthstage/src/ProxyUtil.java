import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 创建一个代理
public class ProxyUtil {
    // 方法的作用：给一个明星的对象，创建一个代理
    // 形参：被代理的明星对象
    // 返回值：给明星创建的代理
    public static Star createProxy(BigStar bigStar) {
        // 为对象产生代理对象的方法
        Star star = (Star) Proxy.newProxyInstance(
                ProxyUtil.class.getClassLoader(),  // 参数一:用于指定用哪个类加载器，去加载生成的代理类
                new Class[]{Star.class},  // 参数二:指定接口，这些接口用于指定生成的代理长什么，也就是有哪些方法
                new InvocationHandler() {  // 参数三:用来指定生成的代理对象要干什么事情
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // 参数1是代理的对象， 参数2是要运行的方法， 参数3是调用方法时，传递的实参
                        if ("sing".equals(method.getName())) {
                            System.out.println("准备话筒，收钱");
                        } else if ("dance".equals(method.getName())) {
                            System.out.println("准备场地，收钱");
                        }
                        return method.invoke(bigStar, args);
                    }
                }
        );
        return star;
    }
}
