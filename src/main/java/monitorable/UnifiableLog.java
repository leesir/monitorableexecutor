package monitorable;

/**
 * 具有统一格式日志组件，实现此接口的类均需要定义自己的日志模板。
 * 实现此接口的组件打印的日志，均可通过分析日志文件生成分析报表。
 * @author lijing
 * @since 2015/11/7
 */
public interface UnifiableLog {

    /**
     * 返回组件的日志模板。
     * @return 日志模板。
     */
    String getLogTemplate();
}
