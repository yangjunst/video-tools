import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/********************************************
 * 文件名称: DynamicProxy.java
 * 功能说明: 
 * 开发人员: 雪域青竹
 * 开发时间: 2021/2/18 8:15
 *********************************************/
interface Inter{
    void show();
}
class Target implements Inter{

    @Override
    public void show() {
        System.out.println("target show run ...");
    }
}
public class DynamicProxy  implements InvocationHandler {
    private Inter target;

    public DynamicProxy(Inter target) {
        this.target = target;
    }

    public Inter getProxyInstance(){
        return (Inter) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(target,args);
    }

    public static void main(String[] args) {
        Inter inter=new Target();
        DynamicProxy proxy=new DynamicProxy(inter);
        Inter p=proxy.getProxyInstance();
        p.show();


    }
}
