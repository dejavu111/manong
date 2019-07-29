import com.alibaba.fastjson.JSONObject;
import com.manong.pojo.Product;
import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * @author ：dejavu111
 * @date ：Created in 2019/5/26 22:26
 * @description：
 * @modified By：
 * @version: $
 */

public class t {
    @Test
    public void json(){
        Product product = new Product();
        product.setCategoryId((short) 22);
        product.setDescription("a");
        product.setId(11);
        String jsonString = JSONObject.toJSONString(product);
        Jedis jedis = new Jedis("localhost");
        jedis.select(3);
        System.out.println("连接成功");
        //查看服务是否运行
        System.out.println("服务正在运行: "+jedis.ping());
        jedis.set("product", jsonString);
        // 获取存储的数据并输出
        System.out.println("redis 存储的字符串为: "+ jedis.get("product"));
    }

}
