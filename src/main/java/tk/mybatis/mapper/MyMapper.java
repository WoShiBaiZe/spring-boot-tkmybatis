package tk.mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Method
 * @Author BaiZe
 * @Version  1.0
 * @Description 自己的Mapper 特别注意：该接口不能被扫描，否则会出错
 * @Return 
 * @Exception 
 * @Date 2019/9/5 23:35
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
